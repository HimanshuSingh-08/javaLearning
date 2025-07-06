import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // we are going to use the linked list in different wa
        LinkedList<String> varList = new LinkedList<>();

        addElements(varList);
        // We are going to have
        System.out.println(varList);

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
}