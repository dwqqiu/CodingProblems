package searching;

import utils.NumberGenerator;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] given = NumberGenerator.getNElementsOfBase(10, 100);
        System.out.println(Arrays.toString(given));

        int target = 5;
        boolean found = false;
        for (int i = 0; i < given.length; i++) {
            if (given[i] == target) {
                found = true;
                break;
            }
        }
        System.out.printf("target %d found: %s\n", target, found);

        int target2 = 11;
        boolean found2 = false;
        int count = 0;
        while (count < given.length) {
            if (given[count] == target2) {
                found2 = true;
                break;
            }
            count++;
        }
        System.out.printf("target2 %d found: %s", target2, found2);
    }
}
