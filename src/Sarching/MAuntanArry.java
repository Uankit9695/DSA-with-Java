package Sarching;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/submissions/1524750408/
public class MAuntanArry {
    static int mauntainarray(int []arr){
        int start = 0;
        int end= arr.length-1;
        while(start<end){
            int mid= start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            else {
                end=mid;
            }

        }
        return start;
    }

    public static void main(String[] args) {
        int a[]={0,2,1,0};
        System.out.println(mauntainarray(a));
    }
}
