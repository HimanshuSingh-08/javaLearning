package CustomLinkedList;

public class DL {
    // We have to make internal pointers
    private Node head;
    private Node tail;
    private int size;

    public DL(){
        this.size = 0;
    }

    //now we have to make a class to initialise the node
    private class Node{
        // here we will have own data of node
        int value;
        Node next;
        Node prev;

        //constructor to create a node
        Node(int value){
            this.value = value;
        }

        //constructor with specific headers
        Node(int value,Node next, Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    // Function to add element in a list
    public void addAtLast(int value){
        //first we have to create node
        Node temp = new Node(value);
        // need to check if we have element or not.
        if(head == null){
            head = tail = temp;
        }else{
           tail.next = temp;
           temp.prev = tail;
           tail = temp;
        }
        size++;
    }

    //Function to print doubly linked list
    public void printfrontToEnd(){
        // we will point to head and move from front to end.
        Node pointer = head;
        while(pointer != null){
            System.out.print(pointer.value + "->");
            pointer = pointer.next;
        }
        System.out.println("END");
    }

    //Function to print doubly linked list from back to front
    public void printBackToFront(){
        // We need a pointer and then we have to just move from back to front
        Node pointer = tail;
        while(pointer !=null){
            System.out.print(pointer.value + "->");
            pointer = pointer.prev;
        }
        System.out.println("Start");
    }
}
