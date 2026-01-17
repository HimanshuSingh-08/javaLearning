package Search;

public class ceilingNumber {
    public static void main(String[] args) {
        // Question goes like we have a array and we have a target.We want to find the ceiling of a number.
        int [] arr = {2,3,5,7,8,9,12,14,17};

        //helper function to find ceil of a number.
//        System.out.println(getCeilNumber(2, arr));

        System.out.println(getFloorNumber(7,arr));
    }

    //this helper function will return the ceil
    public static int getCeilNumber(int target , int[] arr) {
        int s = 0, e = arr.length - 1;
        while(s<=e){
            int mid = s + (e-s)/2;
            // element found then return the index
            if(arr[mid] == target){
                return mid; // yaha pe hi element  mil jara hai isliye wo 5 dera hai.
            }else if(arr[mid] < target){
                s = mid + 1;
            }else{
                e = mid -1;
            }
        }
        return arr[s];
    }

    //Helper function to get the floor of function.
    public static int getFloorNumber(int target , int [] arr){
        int s = 0, e = arr.length - 1;
        while(s<=e){
            int mid = s + (e-s)/2;
            // element found then return the index
            if(arr[mid] == target){
                System.out.println("Equal element is found");
                return mid; // yaha pe hi element  mil jara hai isliye wo 5 dera hai.
            }else if(arr[mid] < target){
                s = mid + 1;
            }else{
                e = mid -1;
            }
        }
        return arr[e];
    }
}
