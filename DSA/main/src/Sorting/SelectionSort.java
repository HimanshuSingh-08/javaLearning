package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {2,1,4,3,5,6,7};

        // now we have to iterate through the error and check if
        for(int i = 0 ; i<arr.length; i++){
            int last = arr.length - i -1;
            int maxIndex = getMaxIndex(arr , 0 , last);
            swap(arr, maxIndex, last);
        }

        System.out.println(Arrays.toString(arr));
    }

    public static int getMaxIndex (int [] arr, int start , int end){
        int max = arr[start];
        int maxIndex = start;
        for(int i = start ; i<= end; i++){
            // check if the element is max
            if(max < arr[i]){
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }


    public static void swap(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}



// whole concept of algorithm is like find max element and then just put it as is at max point.
// So it can be broken down into 2 things one function that gives us the max in the array adn then
// other part should be able to put it into a place.

//What Selection Sort Should Do
//Logic:
//
//For each pass:
//
//Find max element in range [0 → last]
//
//Put that max at last