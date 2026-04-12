package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int [] arr = {1,2,3};

        Arrays.sort(arr);

        List<List<Integer>> result = new ArrayList<>();
        getcombinationSum2(arr , 8 , 0, new ArrayList<>(), result);

    }


    // Print this like

    public static void getcombinationSum2(int [] arr, int target, int index,
                                   List<Integer> currentList,
                                   List<List<Integer>> result){

        if(target == 0){
            result.add(new ArrayList<>(currentList));
            return;
        }

        if(target < 0) return;

        for(int i = index; i < arr.length; i++){

            if(i > index && arr[i] == arr[i-1]) continue;

            currentList.add(arr[i]);

            getcombinationSum2(arr, target - arr[i], i + 1, currentList, result);

            currentList.remove(currentList.size() - 1);
        }
    }
}
