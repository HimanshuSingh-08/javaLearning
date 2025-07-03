import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
   private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean flag = true;
        ArrayList<String> orders = new ArrayList<>();
        while(flag){
            printActions();
            switch (Integer.parseInt(scanner.nextLine())){
                case 1-> addItems(orders);
                case 2->removeItem(orders);
                case 3->showListOfItems(orders);
                default -> flag = false;
            }
        }
        orders.sort(Comparator.naturalOrder());
        System.out.println(orders);

    }

    private static void addItems(ArrayList<String> orders){
        System.out.println("Add items [Separate items by comma]: ");
        String [] items = scanner.nextLine().split(",");
        // simply take intput and add to the orders
        for(String item : items){
            String trimmed = item.trim();
            if(orders.indexOf(trimmed) < 0){
                orders.add(trimmed);
            }
        }
    }

    private static void removeItem(ArrayList<String>orders){
        System.out.println("Enter the name of item to be removed:");
        String [] excludedItem = scanner.nextLine().split(",");

        //now if we have multiple items then simply remove them by
        for(String items : excludedItem){
            String item = items.trim();
            if(orders.remove(item)){
                System.out.println("The items has been removed from the list");
            }else{
                System.out.println("Item is not found in the List");
            }
        }
    }

    private static void showListOfItems(ArrayList<String> orders){
        System.out.println(orders);
    }

    private static void printActions(){
        String textBlock = """
                Available actions :
                0 - to shutdown
                1 - to add item(s) to list (comma delimited)
                2 - to remove any items (comma delimited list)
                3 - show the list of items   
                Enter a number for which action you want to do :
                """;
        System.out.println(textBlock + " ");
    }

}