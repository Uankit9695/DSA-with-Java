package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylistExample {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>(10);
//        list.add(10);
//        list.add(14);
//        list.add(16);
//        list.add(18);
//        list.add(17);
//        list.add(19);
//        list.add(123);
//        list.add(178);
//        list.add(169);
//        list.add(178);
//        list.add(178);
//        System.out.println(list);
//        list.set(0,60);
//        System.out.println(list);
//        System.out.println(list.get(4));
//        System.out.println(list.contains(123));
//        list.remove(2);
//        System.out.println(list);
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        for (int i=0;i<5;i++){
            System.out.println(list.get(i));
        }




    }
}
