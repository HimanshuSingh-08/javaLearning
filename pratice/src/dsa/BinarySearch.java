package dsa;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 8, 10, 19};

        Scanner inp = new Scanner(System.in);

        // Ask user for input
        System.out.println("Enter the no to Search:");
        int target = inp.nextInt();

        // Function to get element
        int index = binarySearch(arr, target);
        System.out.println("The index of target = " + index);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
