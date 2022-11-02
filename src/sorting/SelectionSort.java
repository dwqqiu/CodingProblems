package sorting;

import utils.NumberGenerator;

import java.util.Arrays;

public class SelectionSort {
    // find the lowest and swap with the beginning element
    // the 2nd for loop is the main logic searching for the lowest value
    public static void main(String[] args) {
        int[] given = NumberGenerator.getNElementsOfBase(100, 100);
        //System.out.println(Arrays.toString(given));
        for (int i = 0; i < given.length-1; i++) {
            int min_index = i; // pivot
            for (int j = i+1; j < given.length; j++) {
                if (given[j] < given[min_index])
                    min_index = j;
            }
            // swap
            int tmp = given[i];
            given[i] = given[min_index];
            given[min_index] = tmp;
        }
        System.out.println(Arrays.toString(given));
    }

    // time O(n^2)
    // space O(1) - memory used are temporary while swapping and it does not takes more than O(n) swaps
}
