package Recurstion;

public class recursionExample {

    static void print(int n){

        if(n==10){
            System.out.println(n);
            return;
        }

        System.out.println(n);
        print(n+1);
    }
    public static void main(String[] args) {
        print(1);
    }
}
