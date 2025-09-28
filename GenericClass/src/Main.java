import javax.swing.*;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

//        // when class is non generic in that case
//        Nongeneric packBox = new Nongeneric();
//        packBox.setBox("Mango");
//        String item = (String) packBox.getItem();
//        System.out.println(item);
//
//        //when class is genreic in that case.
//        Generic<String> packItem = new Generic<>();
//        packItem.setItem("THis is string generic item");
//        System.out.println(packItem.getItem());
//
//        //same class can be used for int type usecases too.
//        Generic<Integer> packValue = new Generic<>();
//        packValue.setItem(25);
//        System.out.println(packValue.getItem());


        //Enums usage of Values and ordinal()
        for (SampleEnums sample : SampleEnums.values()){
            System.out.println("Actual day of week:" + sample + " and its numeric value " + sample.ordinal());
        }
    }
}