package sorting;

import utils.NumberGenerator;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] given = NumberGenerator.getNUniqueElementsOfBase(100, 100);
        System.out.println(Arrays.toString(given));
        for (int i = 0; i < given.length-1; i++) {
            if (given[i] > given[i+1]) {
                swap(given, i, i+1);
            }
            for (int j = i; j > 0; j--) {
                if (given[j] < given[j-1]) {
                    swap(given, j, j-1);
                }
            }
        }
        System.out.println(Arrays.toString(given));
    }

    static void swap(int[] array, int a, int b) {
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }
}
