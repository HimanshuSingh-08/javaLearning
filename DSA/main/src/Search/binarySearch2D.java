package Search;

import java.util.Arrays;

// Implementing the binary function on the
public class binarySearch2D {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},
                        {12,14,17},
                        {18,19,20}};

        int [] result = searchIndex(arr, 12);
        System.out.println(Arrays.toString(result));
    }

    //Helper function to find the specifc index
    public static int[] searchIndex(int[][] arr, int target) {

        int rows = arr.length;
        int cols = arr[0].length;

        int i = 0;
        int j = cols - 1;   // top-right corner

        while (i < rows && j >= 0) {

            if (arr[i][j] == target) {
                return new int[]{i, j};
            }
            else if (target < arr[i][j]) {
                j--;   // move left
            }
            else {
                i++;   // move down
            }
        }
        return new int[]{-1, -1};  // not found
    }
}
