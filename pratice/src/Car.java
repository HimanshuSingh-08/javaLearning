public class Car {
    private String make = "BMW";
    private  String model = "MW-R8";
    private  String color = "Black" ;
    private  int doors = 4;
    private  boolean convertible = true ;

    //Settings functions to get values

    public String getMake(){
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }


    //now we have to set the setter function incase to set the values

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void setMake(String make){
        this.make = make;
    }
    public  void  describeCar (){
        System.out.println(doors +"- Door " + color + " " + model + " " + make + " is it convertible "+
                (convertible ? "Yes":"No"));
    }
}
