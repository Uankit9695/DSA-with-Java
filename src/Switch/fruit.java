package Switch;

import java.util.Scanner;

public class fruit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();
        switch (fruit){
            case "mango":
                System.out.println("king of fruit");
                break;
            case "apple":
                System.out.println("A sweet red fruit");
                break;
            case "orange":
                System.out.println("round fruit");
                break;
            case "grapes":
                System.out.println("small fruit");
            default:
                System.out.println("please enter valid fruit");
        }
    }
}
