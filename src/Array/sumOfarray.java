package Array;

import java.util.Scanner;

public class sumOfarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {4, 5, 3, 7, 8, 5, 6};
        int target = 9;


        for (int i = 0; i < arr.length - 1; i++) { // Use arr.length - 1 to avoid out-of-bounds
            if (arr[i] + arr[i + 1] == target) {
                System.out.println(i + " " + (i + 1));
            }
        }
    }
}
