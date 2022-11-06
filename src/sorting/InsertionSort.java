package sorting;

import utils.NumberGenerator;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {
    // the algorithm is similar to holding a set of cards
    // as you check the first card, you insert the selected card into the target section where it belongs to.
    // the trick here is that it splits the swap function by storing first
    // search then swap
    public static void main(String[] args) {
        int[] given = NumberGenerator.getNUniqueElementsOfBase(100, 100);
        System.out.println(Arrays.toString(given));

        for (int i = 1; i < given.length; i++) {
            int x = given[i]; // store your target element
            int j = i-1;
            while (j >= 0 && given[j] > x) {
                given[j+1] = given[j]; // shift it to the adjacent index
                j--;
            }
            given[j+1] = x; // j will be -1 if the target element is the smallest,
                            // therefore increment by 1 to the last position checked
        }
        System.out.println(Arrays.toString(given));
    }

    static void swap(int[] array, int a, int b) {
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }
}
