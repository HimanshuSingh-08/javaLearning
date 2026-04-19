package OOPS.ExceptionHandiling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        // But we can catch the error
        try{
            divide(a,b);
        }catch (Exception e){
            System.out.println(e);
        }
    }

    static public int divide (int a , int b) throws MyException{
        if(b==0){
            throw new MyException("This is my custom Exception. This operation is invalid as we cannot divide no by 0");
        }
        return a/b;
    }
}
