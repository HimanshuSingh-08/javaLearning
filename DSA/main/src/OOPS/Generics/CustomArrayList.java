package OOPS.Generics;

import java.util.Arrays;

public class CustomArrayList {
    // We have to start with certain parameters
    private int [] data;
    static private int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList(){
        data = new int[DEFAULT_SIZE];
    }
    //method to add element
    public void add(int num){
        //first we have to check if do we have space
        if(isFull()){
            // we have to resize array and then put element
            resize();
        }
        this.data[size++] = num;
    }

    // function resize will create new array
    private void resize(){
        int[] temp = new int [data.length*2];
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
    public int get(int index){
        return this.data[index];
    }

    //function to know actual size of array
    public int getSize(){
        return size;
    }

    //function to set a value at particular index
    public void set(int index , int value){
        //first we need to check if index is feasible
        if(index <= size){
            this.data[index] = value;
        }
    }
    // we need function to remove elements
    public int removed(){
        return this.data[--size];
    }

   // print element
    @Override
    public String toString(){
        return "CustomArray list : " + "data= " + Arrays.toString(data) + " size " +
                size;
    }
}


// What are the methods we actually need in a custom array that are there in
// actuall array
// -> Add element
// -> Element at any index
// -> Delete any element (Try to reduce the size when elements are not there more optimised)
// -> Get element at any index which is present