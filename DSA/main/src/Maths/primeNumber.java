package Maths;

public class primeNumber {
    public static void main(String[] args) {
            int n = 1222234345;
            if(checkPrime(n)){
                System.out.println("The number is prime !!");
            }else{
                System.out.println("THe number is not prime!!");
            }
    }

    public static boolean checkPrime(int n){
        // koi bhi number prime tab hoga jab wo sirf khud se ya 1 se divisble ho so

        for(int i = 2; i<n ; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}

// Ye jo approach hai ye hai to sahi but thing is ki ye optimised nahi hai.
// Reason being if u see agar hamare pass bada number ajaye to ye wahi computution bara bara kar hai which dosent make sense.