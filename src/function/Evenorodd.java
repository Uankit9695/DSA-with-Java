package function;

public class Evenorodd {

    static void evenOrodd(int n){
        if(n%2==0){
            System.out.println("it is even number "+n);
        }
        else {
            System.out.println("it is odd number "+n);
        }
    }

    public static void main(String[] args) {
        evenOrodd(7);
    }
}
