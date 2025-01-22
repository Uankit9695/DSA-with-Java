package Sarching;

public class maxIn2Darray {

    static  int maxin2d(int arr[][]){
        int max= Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j =0;j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }

        }
        return max;
    }

    public static void main(String[] args) {
        int arr[][]={{25,36,9,79,65},
                {45,79,63,25,4,},
                {98,97,64,38,79}
        };
        System.out.println(maxin2d(arr));
    }
}
