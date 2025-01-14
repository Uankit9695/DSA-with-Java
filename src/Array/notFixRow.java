package Array;

public class notFixRow {
    public static void main(String[] args) {
        int arr[][]={
                {1,5,3,4,4},
                {4,6,5},
                {7,9,6,3}
        };
        for (int row = 0; row < arr.length; row++) {

            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();

        }
    }
}
