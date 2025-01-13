package function;

public class largnminNo {

    static void largest(int a ,int b ,int c){
        if(a>=b){
            if(a>b){
                System.out.println("max is a: "+a);

            }
            else{
                System.out.println("maximum is c: "+c);
            }
        }
        else {
            if(b>=c){
                System.out.println("max is b: "+b);
            }
            else {
                System.out.println("max is c: "+c);
            }
        }

    }
    static void smallest(int a , int b , int c){
        if(a<=b){
            if(a<=c){
                System.out.println("smallest is a: "+a);
            }
            else {
                System.out.println("smallest is c: "+c);
            }
        }
        else {
            if(b<=c){
                System.out.println("smallest is b: "+b);
            }
            else {
                System.out.println("smallest is c: "+c);
            }
        }
    }
    public static void main(String[] args) {
        largest(10,30,15);
        smallest(30,10,20);

    }
}
