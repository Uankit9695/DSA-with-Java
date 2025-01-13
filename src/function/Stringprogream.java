package function;

public class Stringprogream {
    static String myGreet(String name) {
        String message= "Hello "+name;
        return  message;
    }

    public static void main(String[] args) {
        String personal = myGreet("ankit");
        System.out.println(personal);
    }
}
