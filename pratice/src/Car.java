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

    public  void  describeCar (){
        System.out.println(doors +"- Door " + color + " " + model + " " + make + " is it convertible "+
                (convertible ? "Yes":"No"));
    }
}
