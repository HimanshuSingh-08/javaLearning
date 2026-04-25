package CustomLinkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }

    // Node should be simple
    private class Node {
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }

        Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    //  Add at last
    public void addLast(int value){

        Node temp = new Node(value);

        if(head == null){
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    // Add in starting of the list
    public void addAtFirst(int value){
        Node temp = new Node(value);
        temp.next = head;
        head = temp;
    }

    //Function to add at any specific position
    public void addAtIndex(int value,int index){
        Node temp = new Node(value);
        Node pointer = head;
        int i = 1;
        while(i!= (index-1)){
            pointer = pointer.next;
            i++;
        }
        //chain break and join the ends
        temp.next = pointer.next;
        pointer.next = temp;

    }
    // Print list
    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.println("END");
    }

    // Size
    public int size(){
        return size;
    }
}