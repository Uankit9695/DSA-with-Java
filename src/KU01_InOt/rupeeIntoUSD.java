package KU01_InOt;

import java.util.Scanner;

public class rupeeIntoUSD {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        final double exchengeinUSD= 0.012;
        System.out.print("enter the amount in Rupee: ");
        final double amountinrupee =sc.nextDouble();

        final double USD = amountinrupee*exchengeinUSD;
        System.out.println("$"+USD);
    }
}
