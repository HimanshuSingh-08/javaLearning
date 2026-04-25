package CustomLinkedList;

public class Main {
    public static void main(String[] args) {
//        LL node = new LL();
//        node.addLast(2);
//        node.addLast(3);
//        node.addLast(4);
//        node.printList();
//        node.addAtFirst(9);
//        node.printList();
//        node.addAtIndex(10,3);
//        node.printList();
//        node.deleteAtIndex(3);
//        node.printList();

        // Methods for Doublly linked list
        DL dl = new DL();
        dl.addAtLast(2);
        dl.addAtLast(3);
        dl.addAtLast(4);
        dl.printfrontToEnd();
        dl.printBackToFront();
    }
}
