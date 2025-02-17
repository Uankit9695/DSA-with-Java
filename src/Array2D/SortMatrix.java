package Array2D;

import java.util.Arrays;

public class SortMatrix {

    static int[] binarySrach(int matrix[][], int row , int cStart, int cEnd, int traget){
        while (cStart<=cEnd){
            int mid= cStart+(cEnd-cStart)/2;
            if(matrix[row][mid]==traget){
                return new int[]{row, mid};
            } else if (matrix[row][mid]<traget) {
                cStart= mid+1;
            }
            else {
                cEnd = mid-1;
            }
        }
        return new int[]{-1,-1};
    }
    static int [] search(int [][] matrix , int target){
        int rows = matrix.length;
        int cols = matrix[0].length;
        if(rows==1){
            return binarySrach(matrix, 0,0,cols-1,target);
        }
        int rStart=0;
        int rEnd= rows-1;
        int cMid= cols/2;
        while (rStart<(rEnd-1)){
            int mid= rStart+(rEnd-rStart)/2;
            if(matrix[mid][cMid]==target){
                return  new int[] {mid,cMid};
            }
            else if(matrix[mid][cMid]<target){
                rStart=mid;
            }
            else {
                rEnd=mid;
            }
        }
        if(matrix[rStart][cMid]==target){
            return new int[] {rStart, cMid};
        }
        if(matrix[rStart+1][cMid]==target){
            return new int[]{rStart+1, cMid};
        }
//        srach for 1st half
        if (target<= matrix[rStart][cMid-1]){
            return binarySrach(matrix,rStart,0,cMid-1,target);
        }
//        serach for secong half
        if(target>= matrix[rStart][cMid+1]&& target<= matrix[rStart][cols-1]){
            return binarySrach(matrix, rStart,cMid+1,cols-1, target );
        }
        if(target<=matrix[rStart+1][cMid-1]){
            return binarySrach(matrix, rStart+1, 0, cMid-1, target);
        }
        else {
            return binarySrach(matrix, rStart+1,cMid+1,cols-1, target );
        }

    }
    public static void main(String[] args) {

        int matrix[][]={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(search(matrix,9)));

    }
}
