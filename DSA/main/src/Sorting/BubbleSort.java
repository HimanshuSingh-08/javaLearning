package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        // These algorithm are for sorting an existing
        int[] arr = {23,43,4,5,11,29,30};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //This is bubble sort algorithm
    public static void sort(int[] arr ){
        int len = arr.length;
        for(int i=0; i<len; i++){
            for(int j=1; j<len-i; j++){
                if(arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    // There is further improvement : In the inner loop we dont need to iterate till last of the array
    // as the last elements are put in a sorted manner so no need to put search and swap till there.
}
