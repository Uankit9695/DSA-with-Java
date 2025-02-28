package patterns;

public class righttrangle {

    static void riganleInstar(){
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
    static void riganleInnum(){
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j+1);

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        riganleInstar();
        riganleInnum();
    }

}
