package Maths;

public class squareNumber {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(getSquareRoot(n));
    }

    //sync we are aware that number will going to lie between the range so it will be beneificial
    public static int getSquareRoot(int n) {

        if (n < 0) throw new IllegalArgumentException("Negative number");
        if (n == 0 || n == 1) return n;

        int start = 1, end = n, ans = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            long square = (long) mid * mid;

            if (square <= n) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

//    public static int getSquareRoot(int n){
//        for(int i = 1; i<= n ; i++){
//            if(n%i == 0 && n == i*i){
//                return i;
//            }
//        }
//        return -1;
//    }
}
