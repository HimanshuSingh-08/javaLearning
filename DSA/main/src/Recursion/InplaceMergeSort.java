package Recursion;

import java.util.Arrays;

public class InplaceMergeSort {
    public static void main(String[] args) {
        int [] arr = {2,4,4,5,9,10,12,7};

        mergeSortInplace(arr , 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSortInplace(int[] arr, int start, int end) {
        if (end - start == 1) return;

        int mid = start + (end - start) / 2;

        mergeSortInplace(arr, start, mid);
        mergeSortInplace(arr, mid, end);

        mergeInplace(arr, start, mid, end);
    }

    public static void mergeInplace(int[] arr, int start, int mid, int end) {
        int[] mergedArray = new int[end - start];

        int i = start, j = mid, k = 0;

        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                mergedArray[k++] = arr[i++];
            } else {
                mergedArray[k++] = arr[j++];
            }
        }

        while (i < mid) mergedArray[k++] = arr[i++];
        while (j < end) mergedArray[k++] = arr[j++];

        for (int l = 0; l < mergedArray.length; l++) {
            arr[start + l] = mergedArray[l];
        }
    }
}
