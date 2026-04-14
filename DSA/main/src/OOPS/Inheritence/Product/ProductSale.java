package OOPS.Inheritence.Product;

public class ProductSale extends ElectronicProduct {

    public String sellerName;
    public int discount;

    // default constructor
    public ProductSale() {
        super(); // calls ElectronicProduct()
        this.sellerName = "Default";
        this.discount = 0;
    }

    // parameterized constructor
    public ProductSale(String sellerName, int discount,
                       String productType, int productPrice,
                       String productCompany, String productDescription,
                       int productWeight,
                       int productId, int gstNumber, String distributer) {

        super(productType, productPrice, productCompany,
                productDescription, productWeight,
                productId, gstNumber, distributer);

        this.sellerName = sellerName;
        this.discount = discount;
    }

    public void printProductSellInfo() {
        System.out.println("Seller: " + sellerName +
                " | Discount: " + discount);
    }
}