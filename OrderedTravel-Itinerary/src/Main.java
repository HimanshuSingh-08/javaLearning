import java.util.LinkedList;
import java.util.Scanner;

// Easy way to use my custom data type as it comes with its own constructor,
//  accesors methods and an overridden toString
record Place(String name , int distance){

    @Override
//    public String toString() {
//        return "Place{" +
//                "name='" + name + '\'' +
//                ", distance=" + distance +
//                '}';
//    }
//
    // other way around for this is like
    public String toString() {
        return String.format("%s (%d)",name, distance);

    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList<Place> placesToVisit = new LinkedList<>();

        Place bsl = new Place("Bhusawal" , 2344);
        placesToVisit.add(bsl);
        addplaceToVisit(placesToVisit,new Place("Bhopal" , 2345));
        addplaceToVisit(placesToVisit , new Place("jhansi" , 3890));
        addplaceToVisit(placesToVisit ,new Place("Gwalior" , 8933));
        addplaceToVisit(placesToVisit, new Place("Dehradun" , 323));

        var iterator = placesToVisit.iterator();
        Scanner scanner = new Scanner(System.in);
        boolean quitloop = false;
        boolean forward  = true;

        display();

        while(!quitloop){
            System.out.println("Enter the value: ");
            String menuItem = scanner.nextLine().toUpperCase().substring(0,1);

            switch (menuItem){
                case "F":
                    System.out.println("User wants to move forward");
                    break;
                case "B":
                    System.out.println("User wants to go backwards");
                    break;
                case "L":
                    System.out.println(placesToVisit);
                    break;
                case "M":
                    display();
                    break;
                default:
                    quitloop = true;
                    break;
            }
        }
        System.out.println(placesToVisit);

    }


    public static void addplaceToVisit(LinkedList<Place> placesToVisit, Place place){
        // we need to check if have any place already present
        if(placesToVisit.contains(place)){
            System.out.println("The place already exists in the system");
            return ;
        }

        // we also need to check if the element is either in the uppercase or lowercase implementation
        for(Place p : placesToVisit){
            if(p.name().equalsIgnoreCase((place.name()))){
                System.out.print("Still we have same place !!");
                return ;
            }

        }

        // Method to put elements close to the place
        int matchedIndex = 0;
        for(var templace : placesToVisit){
            if(place.distance() < templace.distance()){
                placesToVisit.add(matchedIndex , place);
                return;
            }
            matchedIndex++;
        }

        placesToVisit.add(place);
    }
    public static void display(){
        System.out.println("""
                Operations that are available to perform are : !
                (F)orwar
                (B)ackward
                (L)ist places
                (M)enu
                (Q)uit
                """);
    }
}