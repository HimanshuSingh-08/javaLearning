package NumberSystem;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // check if  a no is odd using bits
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the no t check : ");
        int num = inp.nextInt();

        System.out.println(checkNumber(num));
    }

    public static boolean checkNumber(int n){
        return ((n & 1) == 1);
    }
}
