package Search;


public class binarySearch {
    public static void main(String[] args) {
        int [] arr = {0,3,5,7,8,9,15,17,19};
        System.out.println(searchIndex(23,arr));
    }

    //helper function to get the particular index
    //This algorithm is called as binarySearch : Time complexity :log(n)

    public static int searchIndex(int target, int [] arr){
        int s = 0, e = arr.length-1;
        while(s <= e){
            int mid = s + (e-s)/2;

            // if we get element in the array.
            if(arr[mid] == target){
                return mid;
            }else if (arr[mid] < target){
                s = mid +1;
            }else{
                e = mid -1;
            }
        }
        // index is not there then directly return -1;
        return -1;
    }
}
