package Array2D;

import java.util.Arrays;

public class RowColoumMatrix {

    static int [] search(int [][]matrix , int traget){
        int r= 0;
        int c= matrix.length-1;
        while (r<matrix.length && c >=0){
            if(matrix[r][c]==traget){
                return new int[] {r,c};
            } else if (matrix[r][c]<traget) {
                r++;
            }
            else {
                c--;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int matrix[][]={
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        System.out.println(Arrays.toString(search(matrix,35)));
    }

}
