package utils;

public class NumberGenerator {
    /**
     * Generates a random number with base 10 values
     * @return non zero value in base 10
     */
    public static int getRangeInTens() {
        return (int) (Math.random() * 10 + 1);
    }

    public static int[] getNElementsOfBase(int n, int base) {
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * base + 1);
        }
        return nums;
    }
}
