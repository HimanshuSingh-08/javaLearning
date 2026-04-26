package CustomStack;

public class customStack {
    protected int [] data;
    private static final int DEFAULT_SIZE = 5;

    private int ptr = -1; // To track elements in stack

    // Incase if we dont have specific then we will use
    public customStack(){
        this(DEFAULT_SIZE);
    }

    // Function to create specific size of stack
    public customStack(int size){
        this.data = new int [size];
    }

    // Now we need functions to perform operations.

    // Push function
    public void push(int value) throws Exception{
        //first we will check if stack is full.
        if(ptr == data.length-1){
            throw new Exception("Stack is full !! Cannot insert new element.");
        }
        this.data[++ptr] = value;
    }

    //Function to pop element
    public int pop() throws Exception{
        //check if it is empty.
        if(isEmpty()){
            throw new Exception("Cannot delete element in empty stack !!");
        }
        return this.data[ptr--];
    }


    // Function to return peek value
    public int peek(){
        // Simply return value ot current pointer
        return data[ptr];
    }

    // Need basic check if stack is empty or full
    public boolean isEmpty(){
        return ptr == -1;
    }

    // Check if it is full
    public boolean isFull(){
        return ptr == data.length-1;
    }
}

//For dynamic stack we sim