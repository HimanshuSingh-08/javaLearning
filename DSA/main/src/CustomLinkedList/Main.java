package CustomLinkedList;

public class Main {
    public static void main(String[] args) {
        LL node = new LL();
        node.addLast(2);
        node.addLast(3);
        node.addLast(4);
        node.printList();
        node.addAtFirst(9);
        node.printList();
        System.out.println(node.size());
    }
}
