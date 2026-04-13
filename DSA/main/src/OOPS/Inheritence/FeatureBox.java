package OOPS.Inheritence;

public class FeatureBox extends Box{
    // storing containers
    public double weight ;

    //default constructor
    public FeatureBox(){
        this.weight = -1;
    }

    //what if we want to initilise all the parameters
    public FeatureBox(double weight , double h , double l, double w){
        // now we have access to the current element of weight but we need to initilise others too.
        // for that we need to initilise it in the base class for that we first call its constructor
        super(h,l,w);
        this.weight = weight;
    }
}
