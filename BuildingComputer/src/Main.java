public class Main {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2208", "Hp Omen");
        Monitor theMonitor = new Monitor("27inch the beast and curved", "Acer", 27 ,"2540x1440");
        Motherboard theMotherboard = new Motherboard("MSI-23" , "msi-dragon",4,6,"v2.23");

        PersonalComputer personalComputer = new PersonalComputer("2208", "HP Omen",theMonitor,theMotherboard,theCase);

//        personalComputer.getMonitor().drawPixelAt(10,10,"blue");
//        personalComputer.getMotherboard().loadProgram("Windows OS is booting Up");
//        personalComputer.getComputerCase().pressPowerButton();

        personalComputer.powerUP();
    }
}