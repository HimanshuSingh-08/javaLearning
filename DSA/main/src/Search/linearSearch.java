package Search;

public class linearSearch {
    public static void main(String[] args) {
        int [] arr = {1,2,4,5,6,7,89,40};
        System.out.println(linearSearch.searchElement(5, arr));
    }

    // This function helps to find a particular element in array
    public static int searchElement(int target , int [] arr){
        int len = arr.length ;
        for(int i = 0; i<len ; i++){
            if(target == arr[i]){
                System.out.println("Element found : " + arr[i] + "at index "  + i);
                return arr[i];
            }
        }
        return -1;
    }
}
