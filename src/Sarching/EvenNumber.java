package Sarching;

public class EvenNumber {


    static int findNumber(int [] nums){
        int count=0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    static  int digit2(int nums){
        return (int)(Math.log10(nums)+1);
    }

    static boolean even(int nums){
        int numberOfDigits= digits(nums);
        return numberOfDigits%2==0;
    }
    static int digits(int nums){
        if(nums<0){
            nums=(nums*-1);
        }
        if(nums==0){
            return 0;
        }
        int cout=0;
        while(nums!=0){
            cout++;
            nums=nums/10;
        }
        return cout;
    }

    public static void main(String[] args) {
//        int nums[]={12,345,2,6,7896,-2345};
//        System.out.println(findNumber(nums));
        System.out.println(digit2(456862));
    }
}
