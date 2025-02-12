package Sarching;

public class NextgratestNumber {

    static char nextgratestnumber(char[] letter, char target) {
        int start = 0;
        int end = letter.length - 1;


        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < letter[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return letter[start % letter.length];

}
    public static void main(String[] args) {
        char [] letters = {'c','f','j'};
        char target = 'a';
        System.out.println(nextgratestnumber(letters,target));

    }
}
