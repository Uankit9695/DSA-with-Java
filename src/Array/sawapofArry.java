package Array;

import java.util.Arrays;

public class sawapofArry {

    static void swap(int[] arr, int index1, int index2){
        int temp= arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }

    public static void main(String[] args) {
        int [] arr= {4,5,3,9,7,6};
        swap(arr,0,3);
        System.out.println(Arrays.toString(arr));
    }
}
