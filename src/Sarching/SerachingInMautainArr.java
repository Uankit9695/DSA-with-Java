package Sarching;

public class SerachingInMautainArr {
//https://leetcode.com/problems/find-in-mountain-array/description/
    static  int srach(int arr[], int target){
        int peak= peakIndexinMauntain(arr);
        int firstTry = oredragnostic(arr, target,0,peak);
        if(firstTry != -1){
            return firstTry;
        }
        return oredragnostic(arr, target, peak+1 , arr.length-1);
    }

    static  int peakIndexinMauntain(int []arr){
        int start = 0;
        int end= arr.length-1;
        while (start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            else {
                end=mid;
            }
        }
        return start;
    }
    static  int oredragnostic (int arr[], int traget , int start , int end){
        boolean isAsc = arr[start]<arr[end];
        while (start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]==mid){
                return mid;
            }
            else if(isAsc){
                if(traget< arr[mid]){
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
            else {
                if(traget>arr[mid]){
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
