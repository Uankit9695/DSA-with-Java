package loops;

import java.util.Scanner;

public class largestNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three number :");
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

//        if(a>=b){
//            if(a>c){
//                System.out.println("grater is" + a);
//            }
//            else {
//                System.out.println("grater is "+ c);
//            }
//        }
//        else {
//            if(b>=c){
//                System.out.println("grater is "+ b);
//            }
//            else {
//                System.out.println("grater is "+ c);
//            }
//        }

        int max = Math.max(c , Math.max(a , b));
        System.out.println(max);


    }
}
