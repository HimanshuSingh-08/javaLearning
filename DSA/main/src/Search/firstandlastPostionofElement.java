package Search;

import java.util.Arrays;

public class firstandlastPostionofElement {
    public static void main(String[] args) {
        // In this we will try to find the first and last occurrence of element in sorted array.
        // inorder to find the elements we have to run the algo twice
        int [] nums = {1,2,3,4,5,5,5,5,5,7,8,9,10};
        int [] ans = {-1,-1};
        ans[0] = search(nums , 5,true);
        ans[1] = search(nums, 5, false);

        System.out.println(Arrays.toString(ans));
    }

    //get element in the array
    public static int search(int[] nums, int target, boolean firstOcc) {
        int ans = -1;
        int s = 0, e = nums.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (nums[mid] == target) {
                ans = mid;
                if (firstOcc) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            } else if (nums[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }
}
