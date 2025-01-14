package Array;

import java.util.Arrays;

public class passingArray {
    static void chaenge(int []arr){
        arr[0]=99;
    }

    public static void main(String[] args) {
        int num[]={35,45,65,78,78};
        System.out.println(Arrays.toString(num));
        chaenge(num);
        System.out.println(Arrays.toString(num));
    }
}
