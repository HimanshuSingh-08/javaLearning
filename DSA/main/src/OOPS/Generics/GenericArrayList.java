package OOPS.Generics;

import java.util.Arrays;

public class GenericArrayList<T> {
    private Object[] data;
    static private int DEFAULT_SIZE = 10;
    private int size = 0;

    public GenericArrayList(){
        data = new Object[DEFAULT_SIZE];
    }
    //method to add element
    public void add(T num){
        //first we have to check if do we have space
        if(isFull()){
            // we have to resize array and then put element
            resize();
        }
        this.data[size++] = num;
    }

    // function resize will create new array
    private void resize(){
        Object[] temp = new Object [data.length*2];
        for(int i=0; i < data.length; i++){
            temp[i] = data[i];
        }
        this.data = temp;
    }

    //function isFull will check if we can add one more element
    private boolean isFull(){
        return size == this.data.length;
    }

    //we need function to return a value at an index
    public T get(int index){
        return (T)this.data[index];
    }

    //function to know actual size of array
    public int getSize(){
        return size;
    }

    //function to set a value at particular index
    public void set(int index , T value){
        //first we need to check if index is feasible
        if(index <= size){
            this.data[index] = value; // no need to type case we are adding to uper one in the object it will be handled by it self.
        }
    }
    // we need function to remove elements
    public Object removed(){
        return this.data[--size];
    }

    // print element
    @Override
    public String toString(){
        return "CustomArray list : " + "data= " + Arrays.toString(data) + " size " +
                size;
    }
}
