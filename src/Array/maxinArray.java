package Array;

import java.util.Arrays;

public class maxinArray {
    static int max(int []arr){
        if(arr.length==0){
            return -1;
        }
        int maxVal=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
    static int maxRange(int [] arr , int start , int end){
        if(end>start){
            return -1;
        }
        if(arr==null){
            return -1;
        }
        int maxval= arr[start];
        for (int i = start; i < end; i++) {
            if(arr[i]>maxval){
                maxval=arr[i];
            }
        }
        return maxval;
    }
    static void swap(int[] arr, int index1, int index2){
        int temp= arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    static void revarse(int arr[]){
        int start=0;
        int end = arr.length-1;
        while (end>start){
            swap(arr,start,end);
            start++;
            end--;
        }

    }

    public static void main(String[] args) {
        int arr[]={4,6,8,4,10};
//        int val=max(arr);
//        System.out.println(val);
//
//        int val1= maxRange(arr,0,3);
//        System.out.println(val1);

        revarse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
