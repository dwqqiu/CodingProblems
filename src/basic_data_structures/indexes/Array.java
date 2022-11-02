package basic_data_structures.indexes;

import utils.NumberGenerator;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = NumberGenerator.getRangeInTens();
        }
        System.out.println(Arrays.toString(nums));

        double[] cash = { 1.1, 2.5, 0.9, 10.8 };
        System.out.println(Arrays.toString(cash));
    }
}
