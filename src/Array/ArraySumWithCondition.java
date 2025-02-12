package Array;

public class ArraySumWithCondition {
    public static int calculateSum(int[] arr) {
        int total = 0;
        boolean skip = false;

        for (int num : arr) {
            if (num == 6) { // Start ignoring numbers
                skip = true;
                continue;
            }
            if (num == 7 && skip) { // Stop ignoring numbers after encountering 7
                skip = false;
                continue;
            }
            if (!skip) { // Add numbers to total if not in the ignore section
                total += num;
            }
        }

        return total;
    }

    public static void main(String[] args) {
        int[] array = {10, 3, 6, 1, 2, 7, 9};
        int result = calculateSum(array);
        System.out.println("Sum of array elements: " + result);
    }
}

