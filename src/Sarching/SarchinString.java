package Sarching;

public class SarchinString {

    static boolean sarchstring(String str , char target){
        if(str.length()==0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==target){
                return true;
            }
        }
        return false;
    }
    public static void main(String [] args){
        String name = "Ankit";
        char target = 'i';
        System.out.println(sarchstring(name,target));

    }
}
