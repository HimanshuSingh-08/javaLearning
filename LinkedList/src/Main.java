import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // we are going to use the linked list in different wa
        LinkedList<String> varList = new LinkedList<>();

        addElements(varList);
        // We are going to have
        System.out.println(varList);
        printElements(varList);

    }
    private static void addElements(LinkedList<String> varList){

        // This function mostly tell about the different possible and use case of the linkedlist
        // dedque methods
        varList.addFirst("The deque first");
        varList.addLast("The deque Last");

        //we can have the stack methods
        varList.push("The stack push");
        varList.getLast();

        // we can have the queue methods
        varList.offer("quque");
        varList.offerFirst("This is queue first");
        varList.offerLast("This quque last");
    }

    // as we have different methods to add similarly we have several  methods to removed the elements from linkedlist
    public static void removeElements(LinkedList<String>varList){
        varList.remove(3);
        varList.remove("quque");
    }

    //ways to print the list using iterative methods for it
    public  static void printElements(LinkedList<String> varList){
        var iterator  = varList.iterator();
        while(iterator.hasNext()){
            System.out.println("Items :->" + iterator.next());
        }
    }
}