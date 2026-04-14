package OOPS.Inheritence.Product;

public class Product {
    public int productId;
    public int gstNumber;
    public String distributer;

    // default constructor
    public Product() {
        productId = 1;
        gstNumber = 1;
        distributer = "Default";
    }

    // parameterized constructor
    public Product(int productId, int gstNumber, String distributer) {
        this.productId = productId;
        this.gstNumber = gstNumber;
        this.distributer = distributer;
    }

    public void printProductInfo() {
        System.out.println("ProductId: " + productId +
                " | GST: " + gstNumber +
                " | Distributor: " + distributer);
    }
}