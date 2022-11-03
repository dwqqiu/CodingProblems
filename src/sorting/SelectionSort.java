package sorting;

import utils.NumberGenerator;

import java.util.Arrays;

public class SelectionSort {
    // as the name suggest, picks either the highest or the lowest value and swaps with the beginning of the list
    // the 2nd for loop is the main logic searching for the lowest value
    // each time it founds a value, the pivot moves 1 step forward
    public static void main(String[] args) {
        int[] given = NumberGenerator.getNUniqueElementsOfBase(100, 100);
        System.out.println(Arrays.toString(given));
        for (int i = 0; i < given.length-1; i++) {
            int min_index = i; // pivot
            for (int j = i+1; j < given.length; j++) {
                if (given[j] < given[min_index])
                    min_index = j;
            }
            // swap
            swap(given, i, min_index);
        }
        System.out.println(Arrays.toString(given));
    }

    static void swap(int[] array, int a, int b) {
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }

    // time O(n^2)
    // space O(1) - memory used are temporary while swapping and it does not takes more than O(n) swaps
}
