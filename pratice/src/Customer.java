public class Customer {
    private  String name ;
    private int creditLimit ;
    private  String emailAddress;

    //getter function for all these fields
    public String getName(){
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    //constructor set all the values
    public Customer (String name , String emailAddress, int creditLimit){
        this.name = name;
        this.emailAddress = emailAddress;
        this.creditLimit = creditLimit;

    }

    //constructor with no para
//    public void Customer (){
//        this.Customer("himanshu", "himanshu@gmail.com",23);
//    }

    //p
//    public void Customer (){
//        this.Customer("himanshu", "himanshu@gmail.com");
//    }
}
