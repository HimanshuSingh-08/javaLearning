public class Car {
    private String make = "BMW";
    private  String model = "MW-R8";
    private  String color = "Black" ;
    private  String doors = "4";
    private  boolean convertible = true ;

    public  void  describeCar (){
        System.out.println(doors +"- Door " + color + " " + model + " " + make + " is it convertible "+
                (convertible ? "Yes":"No"));
    }
}
