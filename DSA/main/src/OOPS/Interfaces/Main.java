package OOPS.Interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();;
        car.acc();
        car.brake();
        car.stop();
    }
}


// Very important thing to keep in mind is that ki ham class ka type kya lere hai because if you use Car car then
// me sare methods use kar sakta hu kyunki wo sab car ke property me ate hai
//wheres if us Engine car then i will be only able to referne or use those elements which are there in it.
// To check : Create object of Engine type instead of Car you will notice we will not be able to use the brake() method
