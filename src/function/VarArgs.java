package function;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    public static void main(String[] args) {
        fun(2,3,4,5,6,21,45,10,35);

    }
}
