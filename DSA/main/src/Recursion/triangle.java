package Recursion;

public class triangle {
    public static void main(String[] args) {
        print2(4,0);
    }

    //helper function to print triangle

    public static void print(int r ,int c){
        if(r == 0) return;

        //phele sari rows ko me print kardunga
        if(c<r){
            System.out.print("*");
            print(r, c+1);
        }else {
            System.out.println();
            print(r-1,0);
        }
    }

    public static void print2(int r ,int c){
        if(r == 0) return;

        //phele sari rows ko me print kardunga
        if(c<r){
            print2(r, c+1);
            System.out.print("*");
        }else {
            print2(r-1,0);
            System.out.println();
        }
    }
}
