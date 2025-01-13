package function;

public class sawping {

    static  void swapno(int num1 , int num2){
        int temp =num1;
        num1=num2;
        num2=temp;
        System.out.println("after sawp of number a="+num1 +" b="+num2);
    }

    public static void main(String[] args) {
        int a=2;
        int b=4;
        System.out.println("before sawp of number a"+a+" b="+b);
        swapno(2,4);

    }
}
