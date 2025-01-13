package Array;

import java.util.Scanner;

public class inputnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int []arr= new int[10];

        for (int i=0;i<arr.length;i++){
            System.out.println("Enter the number : "+ (i+1));
            arr[i]=sc.nextInt();
        }
        for (int j : arr) {  // here nu, represents element of the array
            System.out.print(j + " ");
        }
    }
}
