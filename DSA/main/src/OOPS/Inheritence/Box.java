package OOPS.Inheritence;

public class Box {
    // Variables to hold information
    public double height;
    public double length;
    public double width;

    // general by default box with now dimensions
    public Box(){
        this.height = -1;
        this.length = -1;
        this.width = -1;
    }

    //If we want to create a cube
    public Box(double side){
        this.height = side;
        this.width = side;
        this.length = side;
    }

    // what if require a specific cuboid
    public Box (double h , double l , double w){
        this.height = h;
        this.width = w;
        this.length = l;
    }

    //we can have a copy constructor to we want to initialise if we want.
    public Box(Box old){
        this.height = old.height;
        this.width = old.width;
        this.length = old.length;
    }

    // to return the dimension i have to create the get and set function.
    public void printInfo(){
        System.out.println("Box is running !!");
    }

}
