package Maths;

public class squareNumber {
    public static void main(String[] args) {
        int n = 81;
        System.out.println(getSquareRoot(n));
    }

    public static int getSquareRoot(int n){
        for(int i = 1; i<= n ; i++){
            if(n%i == 0 && n == i*i){
                return i;
            }
        }
        return -1;
    }
}
