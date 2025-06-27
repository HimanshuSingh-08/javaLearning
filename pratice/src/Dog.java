public class Dog extends Animal {
    private String earShape;
    private String tailShape;
    private String extraInfo; // Add this to store the fifth value

    // Default constructor
    public Dog() {
        super("Mutt", "Big", 50);
    }

    // Two-parameter constructor
    public Dog(String type, double weight) {
        this(type, weight, "perky", "Curled");
    }

    // Four-parameter constructor
    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    // Missing five-parameter constructor
    public Dog(String type, double weight, String earShape, String tailShape, String extraInfo) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
        this.extraInfo = extraInfo;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                ", extraInfo='" + extraInfo + '\'' +
                "} " + super.toString();
    }

    // creating method make noise for dog class itself

    public void makeNoise(){
        bark();
        System.out.println();
    }

    public void move(String speed) {
            super.move(speed);
            if(speed == "slow"){
                walk();
                wagTail();
            }else{
                run();
                bark();
            }
    }

    private void bark(){
        System.out.println("woof! ");
    }

    private void wagTail(){
        System.out.println("Dogesh wavying the tail ! ");
    }

    private void walk(){
        System.out.println("Dogesh gone on walk!");
    }

    private void run(){
        System.out.println("Dogesh bhai speed me bhago! ");
    }

}
