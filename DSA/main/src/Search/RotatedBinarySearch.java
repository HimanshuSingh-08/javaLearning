package Search;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,4,7,12,13,0,11};
        System.out.println(getPivot(arr));
    }

    // first we need to find if we have pivot
    public static int getPivot(int [] arr){
        int start = 0 , end = arr.length -1;

        while(start <= end){
            //cal mid
            int mid = start + (end-start)/2;
            // There will be 4 cases to find
            if(mid < end && arr[mid] > arr[mid +1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid -1]){
                return mid -1;
            }
            if(arr[mid] <= arr[start]){
                end = mid -1;
            }else{
                start = mid +1;
            }
        }
        return -1; // if element is not found.
    }
}
