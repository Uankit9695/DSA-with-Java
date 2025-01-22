package Sarching;

import java.util.Arrays;

public class Sarching2Darray {

    static int[] sarching2d(int arr[][], int target){


        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }

            }
        }return new int[]{-1 , -1};
    }

    public static void main(String[] args) {
        int [][]arr={{23,45,86,96},
                {2,47,42,46,52},
                {78,79,71,72,70}
    };
        int target =71;
        int[] ans=sarching2d(arr,target);
        System.out.println(Arrays.toString(ans));
    }
}
