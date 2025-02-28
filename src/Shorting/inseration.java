package Shorting;

import java.util.Arrays;

public class inseration {

    static void insertionShort(int arr[]){
        for(int i= 0 ;i<arr.length;i++){

            for(int j=0;j<i+1;j++){
                if(arr[j]>arr[i]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    static void swap(int arr[], int first , int second){
        int temp= arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    public static void main(String[] args) {
        int arr[]={4,-3,0,1,-8};
        insertionShort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
