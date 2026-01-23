package Search;

public class splitArrayMaxsum {
    public static void main(String[] args) {
        int [] arr = {7,2,5,10,8};
        int m = 2;
        System.out.println(splitArray(arr, m));
    }

    public static int splitArray(int [] arr , int m){
        int start = 0;
        int end = 0;

        for (int i = 0; i<arr.length; i++){
            start = Math.max(start ,arr[i]);
            end += arr[i];
        }

        //now we now the range so we will find the pieces.
        //binary search
        while(start < end){
            // we have to look for the middle value
            int mid = start + (end - start)/2;

            // now will will try to find ki ham is max vale se kitne pieces create kar sakte
            int sum = 0 ;
            int pieces = 1;
            for(int ele :arr ){
                if(sum + ele > mid){
                    // me is array me isko add nahi kar sakta hu , i have to make new one.
                    // and if me add karta hu to sum = ele
                    sum = ele;
                    pieces++;
                }else{
                    sum += ele;
                }
            }

            if(pieces > m){
                start = mid +1;
            }else{
                end = mid;
            }
        }
        return end;
    }
}
