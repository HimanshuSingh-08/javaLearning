package CustomLinkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }

    // Class to create nodes
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

    // function to print values at last of the index.
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

    // function to add value at particular index.
    public void addAtFirst(int value){

        Node temp = new Node(value);
        temp.next = head;
        head = temp;

        if(tail == null){
            tail = head;
        }

        size++;
    }

    // function to add valu at particular index
    public void addAtIndex(int value, int index){

        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException();
        }

        if(index == 0){
            addAtFirst(value);
            return;
        }

        if(index == size){
            addLast(value);
            return;
        }

        Node pointer = head;

        for(int i = 1; i < index; i++){
            pointer = pointer.next;
        }

        Node temp = new Node(value);
        temp.next = pointer.next;
        pointer.next = temp;

        size++;
    }

    // function to delete values at front
    public void deleteAtFront(){

        if(head == null) return;

        head = head.next;
        size--;

        if(head == null){
            tail = null;
        }
    }

    // Function to delete value at particular index.
    public void deleteAtLast(){

        if(head == null) return;

        if(size == 1){
            head = tail = null;
            size = 0;
            return;
        }

        Node pointer = head;

        for(int i = 1; i < size - 1; i++){
            pointer = pointer.next;
        }

        pointer.next = null;
        tail = pointer;

        size--;
    }

    // Delete value which is there at particular index
    public void deleteAtIndex(int index){

        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }

        if(index == 0){
            deleteAtFront();
            return;
        }

        if(index == size - 1){
            deleteAtLast();
            return;
        }

        Node pointer = head;

        for(int i = 1; i < index; i++){
            pointer = pointer.next;
        }

        pointer.next = pointer.next.next;

        size--;
    }

    // Get value which is present at particular field.
    public int get(int index){

        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }

        Node temp = head;

        for(int i = 0; i < index; i++){
            temp = temp.next;
        }

        return temp.value;
    }

    // Function set or update existing value of element.
    public void set(int index, int value){

        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }

        Node temp = head;

        for(int i = 0; i < index; i++){
            temp = temp.next;
        }

        temp.value = value;
    }

    // function to get size
    public int size(){
        return size;
    }

    // Function to print linkedlist
    public void printList(){

        Node temp = head;

        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.println("END");
    }
}