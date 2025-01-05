package loops;

import java.util.Scanner;

public class countNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        int n= sc.nextInt();
        int target= sc.nextInt();
        int count=0;
        while (n!=0){
           int rem= n%10;
            if(rem==target){
                count++;
            }
            n= n/10;
        }
        System.out.println("number of "+target+" in digit is "+count);

    }
}
