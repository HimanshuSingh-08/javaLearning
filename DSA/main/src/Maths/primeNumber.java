package Maths;

public class primeNumber {
    public static void main(String[] args) {
            int n = 765596972;
            if(checkPrime(n)){
                System.out.println("The number is prime !!");
            }else{
                System.out.println("THe number is not prime!!");
            }
    }

    public static boolean checkPrime(int n) {

        if (n <= 1) return false;
        if (n <= 3) return true;

        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

}

// Ye jo approach hai ye hai to sahi but thing is ki ye optimised nahi hai.
// Reason being if u see agar hamare pass bada number ajaye to ye wahi computution bara bara kar hai which dosent make sense.