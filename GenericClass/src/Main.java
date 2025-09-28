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

        //Enum usage of ValueOf() and name()
        SampleEnums temp = SampleEnums.valueOf("WEDNESDAY") ;
        System.out.print(temp.name());
    }
}


// Eager Initialization
 class DBConnection {
    // object created as soon as class loads
    private static DBConnection conObject = new DBConnection();

    private DBConnection(){}

    public static DBConnection getInstance(){
        return conObject;
    }

    public void connect(){
        System.out.println("Connected using Eager Initialization!");
    }
}

// Lazy Initialization
class DBConnection {
    private static DBConnection conObject;

    private DBConnection(){}

    public static DBConnection getInstance(){
        if(conObject == null){
            conObject = new DBConnection();
        }
        return conObject;
    }

    public void connect(){
        System.out.println("Connected using Lazy Initialization!");
    }
}

// Synchronized Method
public class DBConnection {
    private static DBConnection conObject;

    private DBConnection(){}

    public static synchronized DBConnection getInstance(){
        if(conObject == null){
            conObject = new DBConnection();
        }
        return conObject;
    }

    public void connect(){
        System.out.println("Connected using Synchronized Method!");
    }
}

// Double Checked Locking
 class DBConnection {
    private static volatile DBConnection conObject;

    private DBConnection(){}

    public static DBConnection getInstance(){
        if(conObject == null){
            synchronized(DBConnection.class){
                if(conObject == null){
                    conObject = new DBConnection();
                }
            }
        }
        return conObject;
    }

    public void connect(){
        System.out.println("Connected using Double Checked Locking!");
    }
}

//Bill Pugh Singleton
public class DBConnection {
    private DBConnection(){}

    // static inner helper class
    private static class Helper {
        private static final DBConnection INSTANCE = new DBConnection();
    }

    public static DBConnection getInstance(){
        return Helper.INSTANCE;
    }

    public void connect(){
        System.out.println("Connected using Bill Pugh Singleton!");
    }
}

// Enum Singleton

public enum DBConnection {
    INSTANCE;

    public void connect(){
        System.out.println("Connected using Enum Singleton!");
    }
}


