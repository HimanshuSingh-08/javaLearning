public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("red-black");
        car.setMake("Tata");
        car.setDoors(2);
        System.out.println(car.getMake());
        car.describeCar();
    }
}