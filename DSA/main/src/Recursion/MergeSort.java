package Recursion;

import java.util.*;

public class MergeSort {
    public static void main(String[] args) {
        int [] arr = {2,4,4,5,9,10,12,7};

        // call the merged sort helper function for it.
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //helper function to split an array
    public static int [] mergeSort(int [] arr){
        // base condition when we reached to a point where we cant break an array.
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        // now we have to calculate and store the arrays that we have implemented so far.
        int [] firstHalf = mergeSort(Arrays.copyOfRange(arr ,0,mid));
        int [] secHalf = mergeSort(Arrays.copyOfRange(arr ,mid,arr.length));

        return merge(firstHalf,secHalf);
    }

    // now we need helper function to merge those arrays.
    public static int [] merge(int [] firsHalf , int [] secHalf){
        // now we got the two arrays we have to merge those arrays.
        int [] mergedArray = new int [firsHalf.length + secHalf.length];

        // now we have to merge these arrays
        int i = 0 ,j=0, k =0;
        // i will point to first and j will point to sec and k if for new array.
        while(i < firsHalf.length && j<secHalf.length){

            // we have to check which element is greater
            if(firsHalf[i] < secHalf[j]){
                mergedArray[k++] = firsHalf[i++];
            }else{
                mergedArray[k++] = secHalf[j++];
            }
        }

        // now there is possibility that array is completed by traversing
        while(i<firsHalf.length){
            mergedArray[k++] = firsHalf[i++];
        }

        while(j<secHalf.length){
            mergedArray[k++] = secHalf[j++];
        }
        return mergedArray;
    }
}

// Concept of mergesort is to break an array into sorted ones and then merge them
// time complexity jo hai wo hai big o(n*log(n))