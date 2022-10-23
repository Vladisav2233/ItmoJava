package lab4;

import java.util.Arrays;

public class Task25mergeSort {
    public static void main(String[] args) {
        int[] ints = new int[]{10, 22, 11, 64, 15, 21, 23, 18, 16, 19};

        int[] result = mergeSort(ints);
        System.out.print(Arrays.toString(result));
    }

    public static int[] mergeSort(int[] array) {
        if(array.length <2){
            return array;
        }

        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right;

        if (array.length % 2 == 0) {
            right = new int[mid];
        } else {
            right = new int[mid + 1];
        }

        for (int i = 0; i < left.length; i++) {
            left[i] = array[i];
        }
        for (int j = 0; j < right.length; j++) {
            right[j] = array[mid + j];
        }

        left = mergeSort(left);
        right = mergeSort(right);
        return mergeParts(left, right);
    }

    private static int[] mergeParts(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int leftPointer = 0;
        int rightPointer = 0;
        int resultPointer = 0;
        while (leftPointer < left.length || rightPointer < right.length) {
            if (leftPointer < left.length && rightPointer < right.length) {
                if (left[leftPointer] < right[rightPointer]) {
                    result[resultPointer++] = left[leftPointer++];
                } else {
                    result[resultPointer++] = right[rightPointer++];
                }
            }
            else if( leftPointer < left.length){
                result[resultPointer++] = left[leftPointer++];
            }
            else if( rightPointer < right.length){
                result[resultPointer++] = right[rightPointer++];
            }
        }
        return result;
    }
}
