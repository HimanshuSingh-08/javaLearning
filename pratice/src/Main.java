public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.setColor("red-black");
//        car.setMake("Tata");
//        car.setDoors(2);
//        System.out.println(car.getMake());
//        car.describeCar();

//    Customer customerOne = new Customer("Himanshu Singh", "himansh.singh293@gmail.com" , 23);
//    System.out.println(customerOne.getName());
//    System.out.println(customerOne.getEmailAddress());
//    System.out.println(customerOne.getCreditLimit());

        // Concept of the inheretience
        Animal animal = new Animal("Generic animal" , "Big enough" , 235);
//        doAnimalStuff(animal , "this animal is slow");
            Dog dog = new Dog();
            doAnimalStuff(dog, "fast");

            Dog yorkie = new Dog("yorkie" , 15);
            doAnimalStuff(yorkie , " fast");


            Dog retriver = new Dog("Labrodar Retriever" ,45,"small", "Floppy" ,"Swimmer");
            doAnimalStuff(retriver , " slow");

            Fish goldie = new Fish("Goldfish" , 0.345, 2,3);
            doAnimalStuff(goldie , "fast");


    }

    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("-----");
    }
}