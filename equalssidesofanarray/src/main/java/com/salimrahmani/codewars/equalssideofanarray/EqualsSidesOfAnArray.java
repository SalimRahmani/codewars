package com.salimrahmani.codewars.equalssideofanarray;


import java.util.Arrays;
import java.util.stream.IntStream;

public class EqualsSidesOfAnArray {
    public static int findEvenIndex(int[] arr) {

        if (arr.length == 0) {
            return 0;
        }


        for (int i = 0; i < arr.length; i++) {

            int leftSum = 0;
            int rightSum = 0;

            int[] leftArray;
            int[] rightArray;


            if (i == 0) {
                leftSum = 0;
                // Get the right subarray
                rightArray = subArray(arr, i+1, arr.length - 1);
                // Compute the right array sum
                rightSum = IntStream.of(rightArray).sum();

            } else if (i + 1 == arr.length) {
                rightSum = 0;
                // Get the left subarray
                leftArray = subArray(arr, 0, i-1);
                // Compute the left array sum
                leftSum = IntStream.of(leftArray).sum();

            } else {

                leftArray = subArray(arr, 0, i-1);
                leftSum = IntStream.of(leftArray).sum();
                rightArray = subArray(arr, i+1, arr.length - 1);
                rightSum = IntStream.of(rightArray).sum();

            }

            if (leftSum == rightSum) {
                return i;
            }
        }

        return -1;
    }

    private static int[] subArray(int[] array, int beg, int end) {
        return Arrays.copyOfRange(array, beg, end + 1);
    }

}
