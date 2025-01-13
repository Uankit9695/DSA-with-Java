package function;

import java.util.Scanner;

public class sum {

    static void Sum(){
        Scanner sc = new Scanner(System.in);
        int a, b ,ans;
        System.out.println("Enter the two Number a and b: ");
        a=sc.nextInt();
        b=sc.nextInt();
        ans=a+b;
        System.out.println("sum="+ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for (int i=1;i<=n;i++){
              Sum();
        }
    }

}
