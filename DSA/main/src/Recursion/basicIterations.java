package Recursion;

public class basicIterations {
    public static void main(String[] args) {
        int n = 12;
        printNumbers1toN(0,n);
    }
    //functions to print n to 1
    public static void printNumbersNto1(int n){
        // we need base condition to break the call
        if (n == 0){
            return ;
        }
        System.out.println(n);
        printNumbersNto1(n);
    }
    // function to print n to 1
    public static void printNumbers1toN(int start,int n){
        // we need base condition to break the call
        if (start == n){
            return ;
        }
        System.out.println(start);
        printNumbers1toN(start +1 , n);
    }
}
