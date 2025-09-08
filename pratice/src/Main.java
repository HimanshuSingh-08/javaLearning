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
//        Animal animal = new Animal("Generic animal" , "Big enough" , 235);
////        doAnimalStuff(animal , "this animal is slow");
//            Dog dog = new Dog();
//            doAnimalStuff(dog, "fast");
//
//            Dog yorkie = new Dog("yorkie" , 15);
//            doAnimalStuff(yorkie , " fast");
//
//
//            Dog retriver = new Dog("Labrodar Retriever" ,45,"small", "Floppy" ,"Swimmer");
//            doAnimalStuff(retriver , " slow");
//
//            Fish goldie = new Fish("Goldfish" , 0.345, 2,3);
//            doAnimalStuff(goldie , "fast");

    //--------------Concept of Java---------------//
        Box tempBox = new Box(2);
        tempBox.setItem(2);
        Box tempBox2 = new Box();
        tempBox2.setItem("Himanshu");

//        Object str =  tempBox2.getItem();
//        Object temp = tempBox.getItem();

        //---> But specific data type me chaiye to bhai mujhe typecast karna padega.
        String str = (String) tempBox2.getItem();
        int temp = (int) tempBox.getItem();


        GBox<Integer> testItem = new GBox();
        testItem.setItem(23);

        GBox<String> testItem2 = new GBox();
        testItem2.setItem("TheBox");

        String testStr = testItem2.getItem();
        System.out.println(testStr);
    }

    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("-----");
    }
}