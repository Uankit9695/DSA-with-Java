package Array;

import java.util.Arrays;
import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][3];
        System.out.println("enter the number");
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                System.out.println("enter the number"+(i+1)+""+(j+1));
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("matrix is :-");
//        for (int i=0 ;i<arr.length;i++){
//            for(int j=0;j<arr.length;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//        for(int i=0;i<arr.length ;i++){
//            System.out.println(Arrays.toString(arr[i]));
//        }
        for(int [] a: arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
