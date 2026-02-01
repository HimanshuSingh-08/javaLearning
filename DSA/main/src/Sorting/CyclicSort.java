package Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int []arr = {1,3,2,5,4,7,6,6};

        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cyclicSort(int [] arr){
        // we will start from the starting index and check till we get correct element of current index.
        int i =0;
        while(i < arr.length){
            int correctIndex = arr[i] -1;// It will take us to the required index for current element
            if(arr[i] != arr[correctIndex]){
                swap(arr, i , correctIndex);
            }else{
                i++;
            }
        }
    }

    public static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last]  = temp;
    }
}

// This algorithm is based on observation : we can sort an array in big O(n) in single pass.
// if array is have elements from 1 to N striclty then its a observation that in ideal case
// the difference between the value at index and the index itself will remains the same.


// Keep in mind this is only possible when array is has 1 to N elements and distinct it is not working for {1,3,2,5,4,7,6,6} this test case