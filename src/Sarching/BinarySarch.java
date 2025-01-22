package Sarching;

public class BinarySarch {
    static int binarysarch(int arr[], int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            } else if (arr[mid]<target) {
                start = mid + 1;
            }
            else {
                end=mid-1;
            }


        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]= {2,4,6,9,10};
        int tar=4;
        System.out.println(binarysarch(arr,tar));
    }
}
