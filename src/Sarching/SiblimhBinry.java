package Sarching;

public class SiblimhBinry {

    static  int FindSibling(int []arr, int target){
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            } else if (arr[mid]>target) {
                end=mid-1;

            }
            else {
                start=mid+1;



                }
            }

        return arr[end];
    }

    public static void main(String[] args) {
        int arr[]={1,3,4,7,8,9,10};
        int target= 6;
        System.out.println(FindSibling(arr,target));
    }
}
