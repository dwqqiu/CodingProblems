package sorting;

import utils.NumberGenerator;

import java.util.Arrays;

public class BubbleSort {
    // main objective is to swap the adjacent elements each time it iterates
    // each time it swaps, the target element is pushed further down the array
    public static void main(String[] args) {
        int[] given = NumberGenerator.getNElementsOfBase(10, 100);
        System.out.println(Arrays.toString(given));
        for (int i = 0; i < given.length; i++) {
            for (int j = 0; j < given.length-1; j++) {
                if (given[j] > given[j+1]) {
                    int tmp = given[j];
                    given[j] = given[j+1];
                    given[j+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(given));
    }

    // time O(n^2) - bubble sort runs in O(n^2) even on sorted array
    // space O(1)
}
