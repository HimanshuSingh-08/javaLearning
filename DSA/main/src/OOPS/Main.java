package OOPS;

import OOPS.Inheritence.Product.ElectronicProduct;
import OOPS.Inheritence.Product.Product;
import OOPS.Inheritence.Product.ProductSale;

public class Main {
    public static void main(String[] args) {
        //Lets initalise the product class
        Product pro1 = new Product(12,23423,"SinghWholeSale");
        Product pro2 = new Product(13,23424,"himanshuSale");



//        pro1.printProductInfo();
//        pro2.printProductInfo();

        ProductSale obj = new ProductSale(
                "Himanshu", 20,
                "Laptop", 50000, "Dell", "Gaming Laptop", 2,
                101, 18, "ABC Distributor"
        );

        obj.printProductInfo();
        obj.printElectronicProductInfo();
        obj.printProductSellInfo();
    }
}
