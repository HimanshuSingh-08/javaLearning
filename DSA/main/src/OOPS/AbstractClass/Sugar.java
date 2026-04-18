package OOPS.AbstractClass;

public class Sugar extends Person{
    @Override
    int getAge(){
        return 23;
    }

    @Override
    String career(){
        return "Doctor";
    }

    String gender(){
        return "Female";
    }

    String name(){
        return "Pari";
    }
}
