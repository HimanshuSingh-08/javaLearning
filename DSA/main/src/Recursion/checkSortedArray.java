package Recursion;

public class checkSortedArray {
    public static void main(String[] args) {
        int [] arr = {2,3,4,4,5,9,10,11};
        if(checkArray(arr,1)){
            System.out.println("The array is sorted");
        }else{
            System.out.println("The array is not sorted");
        }

    }

    //helper function to check if array is sorted.
    public static boolean checkArray(int [] arr , int i){
        // base condition
        if(i == arr.length){
            return true;
        }

        if(arr[i-1]>arr[i]) return false;

       return checkArray(arr, i+1);
    }
}
