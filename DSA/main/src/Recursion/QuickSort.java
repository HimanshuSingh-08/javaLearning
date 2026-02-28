package Recursion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int [] arr = {5,4,3,1,2};
        quickSort(arr , 0, arr.length-1);
        System.out.println("This is a sorted array : " + Arrays.toString(arr));
    }

    //Create a helper function for it.
    public static void quickSort(int [] arr , int low , int high){
        // when low has crossed each other.
        if(low >= high){
            return;
        }

        // now we need pointer to point
        int s = low;
        int e = high;
        int mid = low + (high - low)/2;
        // let assume ki pivot jo hai wo mid hai
        int pivot = arr[mid];

        // now we will traverse through the array and place a pivot at its place

        while(s <= e){
            // Notes : Ye jo do while loop hai wo hame ek s and e ki wo do values pe leke chale jayenge jaha pe
            // ye pivot ki condition ko violate karate hai but niche if block me wo abhi hi wahi isliye likha
            // hai kyunki wo s and e abhi bhi ek dusre ko cross nahi kiye hai and voilate kare hai so
            // swap them
            while(arr[s] < pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }

            // but when they crossed each other at that moment just swap them
            if(s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        //now we have placed the pivot at its position we will sort the two halves now.
        quickSort(arr ,low, e);
        quickSort(arr ,s , high);
    }
}
// Better for arrays : Reason we are not creating new array each time. Th