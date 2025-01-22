package Sarching;

public class linerSarch {

    static void Linsarch(int []arr, int target){
        int start= arr.length-1;

        for (int i = 0; i < start; i++) {
            if(arr[i]==target){
                System.out.println("srach at index "+i+" target value is "+arr[i]);
            }


        }

    }

    public static void main(String[] args) {
        int []arr={3,5,6,8,7,6,5};
        int target= 5;
        Linsarch(arr,target);
    }
}
