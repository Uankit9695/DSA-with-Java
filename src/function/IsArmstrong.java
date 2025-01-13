package function;

public class IsArmstrong {

    static boolean isarmstrong(int n){
        int origbal =n;
        int sum=0;
        while (n>0){
            int rem=n%10;
            sum=sum+rem*rem*rem;
            n=n/10;
        }
        if(sum==origbal){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        for (int i=1;i<=1000;i++){
            if(isarmstrong(i)){
                System.out.print(i+" ");
            }
        }
    }
}
