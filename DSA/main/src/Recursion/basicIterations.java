package Recursion;

public class basicIterations {
    public static void main(String[] args) {
        int n = 123343;
//        printNto1(n);
         System.out.println(prodOfDigits(n));
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

    // function to print n to 1 with one paramter
    public static void printNto1(int n){
        if(n == 0) return;
        printNto1(n-1);
        System.out.println(n);
    }

    //factorial of number
    public static int printFact(int n){
        if(n == 1 || n ==0) return 1;
        return n*printFact(n-1);
    }

    public static  int sumOfDigits(int n){
        if(n==0){
            return 0;
        }
        return (n%10) + sumOfDigits(n/10);
    }

    public static  int prodOfDigits(int n){
        if(n%10==n){
            return n;
        }
        return (n%10) * prodOfDigits(n/10);
    }
}
