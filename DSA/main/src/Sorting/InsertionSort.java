package Sorting;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1,2,-4,6,5,-9,8};

        //call for the helper function
        System.out.println(Arrays.toString(InsertSortArray(arr)));
    }

    //Helper function to sort the array.
    public static int [] InsertSortArray(int[] arr){
        for(int i =0; i<arr.length-1; i++){
            // we have to ensure till j all the elements are sorted.
            int j = i +1;
            while(j>0){
                // we have to check if we have previous element greater than the current one.
                if(arr[j-1] > arr[j]){
                    swap(arr,j-1,j);
                }else{
                    break;
                }
                j--;
            }
        }
        return arr;
    }

    //swap function
    public static void swap(int[] arr, int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
// This implementation is of Insertion Sort.
// Concept is quite simple we have to sort the array till we are moving for ward.

// Logic itna hi hai ki j i se age rahega and ye insure karega ki j ke left me array hamesha sorted rahe.
// If we have any element greater at in left we will just swap till j reaches to zero.
// Reason why it is called as Insertion sort as we are looking for the right position to insert the element in the left side.