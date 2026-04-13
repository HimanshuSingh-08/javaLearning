package OOPS;

import OOPS.Inheritence.Box;
import OOPS.Inheritence.FeatureBox;

public class Main {
    public static void main(String[] args) {
        FeatureBox cube2 = new FeatureBox();
        System.out.println(cube2.weight + " " + cube2.length);

        FeatureBox cuboid = new FeatureBox(23.4, 2,3,4);
        System.out.println("The weight of the cuboid is "+ cuboid.weight + "And dimensions are " + cuboid.length +" "+ cuboid.width + " " + cuboid.height);
    }
}
