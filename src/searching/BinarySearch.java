package searching;

import utils.NumberGenerator;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] given = {10, 17, 20, 25, 29, 34, 35, 36, 41, 43, 46, 47, 53, 54, 56, 57, 67, 73, 84, 89};
        System.out.println(Arrays.toString(given));
        boolean found = iterativeBinarySearch(given, 10, 0, given.length-1);
        System.out.printf("Target found: %s for iterative\n", found);
        found = recursiveBinarySearch(given, 10, 0, given.length-1);
        System.out.printf("Target found: %s for recursive\n", found);
    }

    public static boolean iterativeBinarySearch(int[] toSearch, int target, int left, int right) {
        while (left <= right) {
            int pivot = (left + right)/2;
            if (toSearch[pivot] == target) return true;
            else if (target > toSearch[pivot]) {
                left = pivot+1;
            } else {
                right = pivot-1;
            }
        }
        return false;
    }

    public static boolean recursiveBinarySearch(int[] toSearch, int target, int left, int right) {
        if (left > right) { // base case to break recursion
            return false;
        } else {
            int pivot = (left+right)/2; // constantly update pivot position
            if (target == toSearch[pivot]) {
                return true;
            }
            if (target > toSearch[pivot]) {
                return recursiveBinarySearch(toSearch, target, pivot+1, right); // if larger, move pivot right
            } else {
                return recursiveBinarySearch(toSearch, target, left, pivot-1); // if smaller, move pivot left
            }
        }
    }
}
