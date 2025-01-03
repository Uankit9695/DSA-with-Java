package KU01_InOt;

import java.util.Scanner;

public class SI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p;
        int t;
        int r;
        System.out.println("Enter the principle :");
        p=sc.nextInt();
        System.out.println("Enter the time in year :");
        t=sc.nextInt();
        System.out.println("Enter the rate of intrest :");
        r=sc.nextInt();
        int SI = (p*t*r)/100;
        System.out.println(SI);
    }
}
