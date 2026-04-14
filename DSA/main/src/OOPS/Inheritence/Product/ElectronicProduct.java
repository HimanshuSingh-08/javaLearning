package OOPS.Inheritence.Product;

public class ElectronicProduct extends Product {

    public String productType;
    public int productPrice;
    public String productCompany;
    public String productDescription;
    public int productWeight;

    // Default constructor
    public ElectronicProduct() {
        super(); // calls Product()
        this.productType = "Default";
        this.productPrice = 0;
        this.productCompany = "Default";
        this.productDescription = "Default";
        this.productWeight = 0;
    }

    // parameterized constructor
    public ElectronicProduct(String productType, int productPrice,
                             String productCompany, String productDescription,
                             int productWeight,
                             int productId, int gstNumber, String distributer) {

        super(productId, gstNumber, distributer);

        this.productType = productType;
        this.productPrice = productPrice;
        this.productCompany = productCompany;
        this.productDescription = productDescription;
        this.productWeight = productWeight;
    }

    public void printElectronicProductInfo() {
        System.out.println("Type: " + productType +
                " | Price: " + productPrice +
                " | Company: " + productCompany +
                " | Desc: " + productDescription +
                " | Weight: " + productWeight);
    }
}