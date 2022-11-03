package utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    public static int[] getNUniqueElementsOfBase(int n, int base) {
        List<Integer> distinct = new ArrayList<>();
        while (distinct.size() != n) {
            int num = (int) (Math.random() * base + 1);
            if (!distinct.contains(num)) distinct.add(num);
        }
        return distinct.stream().mapToInt(i -> i).toArray();
    }
}
