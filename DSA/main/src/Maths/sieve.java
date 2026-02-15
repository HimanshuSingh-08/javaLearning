package Maths;

public class sieve {
    public static void main(String[] args) {
        int n = 40 ;
        boolean[] primes = new boolean[n+1];
        doSieve(n,primes);

    }

    public static void doSieve(int n, boolean[] isComposite) {

        for (int i = 2; i * i <= n; i++) {
            if (!isComposite[i]) { // i is prime
                for (int j = i*2; j <= n; j += i) {
                    isComposite[j] = true; // mark multiples
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (!isComposite[i]) {
                System.out.println("Prime no " + i);
            }
        }
    }

}


// now for this part of code we  for (int j = i*2; j <= n; j += i) {
//                    isComposite[j] = true; // mark multiples
//                }
// we have one thing ki we can have j = i*i  now thing is ki ye jada optmise karta hai code ko kyunki we redundant code se bachta hai.

