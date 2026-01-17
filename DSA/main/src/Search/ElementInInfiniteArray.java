package search;

public class ElementInInfiniteArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,12,13,16,17,19,20,23,24,27,30};
        int target = 23;

        int index = searchInInfiniteArray(arr, target);
        System.out.println(index);
    }

    static int searchInInfiniteArray(int[] arr, int target) {
        int start = 0;
        int end = 1;

        // Expand the range safely
        //Note : now thing is we are in a infinite array we cant know the last index but to keep the code
        // bug free we have to consider the range eles we are going to have indexout of bound error.
        while (end < arr.length && target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;

            //why we did this : Reason being what if the end size got greater then the file then ?
            // it will give the error and hence we have to make it in lower bound.
            if (end >= arr.length) {
                end = arr.length - 1;
            }

            start = newStart;
        }

        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
