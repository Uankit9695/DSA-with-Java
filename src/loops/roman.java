package loops;

class Solution {

    public int value(char r) {
        switch (r) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return -1;
        }
    }
    public int romanToInt(String s) {
        int res = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int s1 = value(s.charAt(i));

            if (i + 1 < n) {
                int s2 = value(s.charAt(i + 1));

                if (s1 < s2) {
                    res += (s2 - s1);
                    i++;
                } else {
                    res += s1;
                }
            } else {
                res += s1;
            }
        }
        return res;
    }

    public static void main(String[] args) {

    }

}