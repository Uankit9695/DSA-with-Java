package loops;

import java.util.Scanner;

public class typecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entre the Charter");
        char ch= sc.next().trim().charAt(0);
        if(ch >= 'a'&& ch <= 'z'){
            System.out.println("it is lower case");
        }
        else {
            System.out.println("it is upper case");
        }
    }
}
