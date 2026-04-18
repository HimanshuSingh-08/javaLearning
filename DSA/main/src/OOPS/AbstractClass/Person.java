package OOPS.AbstractClass;

abstract public class Person {

    abstract int getAge(); // method get age of an person
    abstract String career();
    abstract String name ();
    abstract String gender ();
}


// Notes : Abstract class can be hybrid it may have some methods implmented and some not
// But the object we are creating out of it are bounded to have the implmentation of those.Else it will break.