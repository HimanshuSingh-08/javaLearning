import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
   private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> orders = new ArrayList<>();
        boolean flag = true;
        while(flag){
            printActions();
            switch (Integer.parseInt(scanner.nextLine())){
                default -> flag = false;
            }
        }
        orders.sort(Comparator.naturalOrder());
        System.out.println(orders);

    }

    private static void printActions(){
        String textBlock = """
                Available actions :
                0 - to shutdown
                1 - to add item(s) to list (comma delimited)
                2 - to remove any items (comma delimited list)
                                
                Enter a number for which action you want to do :
                """;
        System.out.println(textBlock + " ");
    }

}