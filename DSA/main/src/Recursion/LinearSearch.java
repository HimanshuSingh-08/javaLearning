package Recursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {1,23,5,2,3,3,3,5,6,7};
        System.out.println(getTargetList(arr , 3 , 0));
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

    // lets consider if want to push multiple entries of targets in that case we need to
    // assume we want to create the issue then we have
    public static ArrayList<Integer> getTargetList(int [] arr, int target , int i){
        // we need store our answers.
        ArrayList<Integer> ans = new ArrayList<>();
        // if we reached to the end then it means we already sorted out and added the numbers.
        if(i == arr.length-1){
            return ans;
        }

        //if we found target then we will add to the list
        if(arr[i] == target){
            ans.add(arr[i]);
        }

        ArrayList<Integer> ansFromPrevCall = getTargetList(arr , target, i+1);
        ans.addAll(ansFromPrevCall);
        return ans;
    }
}
