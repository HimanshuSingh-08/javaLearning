package Recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {1,23,5,2,3};
        System.out.println(getTarget(arr , 0 , 50));
    }
    //helper function to find target
    public static int getTarget(int [] arr ,int i, int target){
        // base condition when we have crossed array.
        if(i == arr.length){
            return -1;  // why this ? agar me yaha tak agya hu iska matlab mujhe element nahi mila hai array me
        }

        // check if we got a element
        if(arr[i] == target){
            return i;
        }
        return getTarget(arr , i+1,target);
    }
}
