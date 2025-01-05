package loops;

import java.util.Scanner;

public class CAlculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int ans= 0;
        while (true){
            System.out.println("enter the prator");
            char op= sc.next().trim().charAt(0);
            if(op=='+' || op=='-' || op=='*' || op=='/' || op =='%'){
                System.out.println("enter the number: ");
                int a= sc.nextInt();
                int b=sc.nextInt();
                if (op == '+') {
                    ans=a+b;
                }
                if (op == '-') {
                    ans=a-b;
                }
                if (op == '*') {
                    ans=a*b;
                }
                if (op == '/') {
                    if(b!=0){
                        ans=a/b;
                    }
                    else {
                        System.out.println(b+"can not devide a");
                    }
                }
                if(op=='%'){
                    ans=a%b;
                }
            } else if (op =='X' || op == 'x') {
                break;

            }
            else {
                System.out.println("invelid opration");
            }
            System.out.println(ans);
        }
    }
}
