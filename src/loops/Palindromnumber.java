package loops;

public class Palindromnumber {

    static boolean palindrom(int x){

        int origanl=x;
        if(origanl<0){
            return false;
        }
        int pal=0;
        while (x!=0){
            int temp = x%10;
            pal= (pal*10)+temp;
            x=x/10;
        }
        if(origanl==pal){
            return true;
        }


        return false;
    }

    public static void main(String[] args) {
        int x= -121;
        boolean rsult = palindrom(x);
        System.out.println(rsult);

    }
}
