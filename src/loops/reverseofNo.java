package loops;

import java.util.Scanner;

public class reverseofNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= sc.nextInt();
        int rev=0;
        while (n!=0){
            int temp= n%10;
            rev=(rev*10)+temp;
            n=n/10;
        }
        System.out.println(rev);
    }
}
