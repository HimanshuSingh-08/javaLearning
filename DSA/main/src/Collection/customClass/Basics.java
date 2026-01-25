package Collection.customClass;

class Data {
    public Integer num;
    public String name;
    private Integer holding;
    Data(Integer num, String name, Integer revenue){
        this.num = num;
        this.name = name;
        this.holding = revenue;
    }

    //getter and setter function for the custom data.
    public void setName(String name){
        this.name = name;
    }

    public  void setNumber(Integer num){
        this.num = num;
    }

    public  void printData(){
        System.out.println("This is my name: " + num + " and this is my number: " + name + "And this is my revenue" + holding);
    }
}

class InternalData {
    public Integer revenue;
    InternalData(Integer _revenue){
        this.revenue = _revenue;
    }
}

public class Basics {
    public static void main(String[] args) {
        Data data = new Data(93 , " Himanshu",2323);
        data.setName("Singh");
        data.printData();
    }
}