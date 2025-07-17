// ECommerceExample.java

interface Searchable {
    boolean matches(String keyword);
}

interface Discountable {
    double applyDiscount();
}

abstract class PaymentMethod {
    double amount;

    PaymentMethod(double amount) {
        this.amount = amount;
    }

    abstract void pay();

    void printReceipt() {
        System.out.println("Paid: ₹" + amount);
    }
}

class UpiPayment extends PaymentMethod {
    String upiId;

    UpiPayment(double amount, String upiId) {
        super(amount);
        this.upiId = upiId;
    }

    @Override
    void pay() {
        System.out.println("Paying ₹" + amount + " using UPI: " + upiId);
    }
}

class CreditCardPayment extends PaymentMethod {
    String cardNumber;

    CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    void pay() {
        System.out.println("Paying ₹" + amount + " using Card: ****" + cardNumber.substring(cardNumber.length() - 4));
    }
}

class Product implements Searchable {
    private String id;
    private String name;
    private double price;

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean matches(String keyword) {
        return name.toLowerCase().contains(keyword.toLowerCase());
    }

    @Override
    public String toString() {
        return name + " (ID: " + id + ", ₹" + price + ")";
    }
}

class DiscountedProduct extends Product implements Discountable {
    private double discountPercent;

    public DiscountedProduct(String id, String name, double price, double discountPercent) {
        super(id, name, price);
        this.discountPercent = discountPercent;
    }

    @Override
    public double applyDiscount() {
        return getPrice() - (getPrice() * discountPercent / 100);
    }
}

record OrderSummary(String orderId, String productName, double totalPrice) {}

public class ECommerceExample {
    public static void main(String[] args) {
        // Product with discount
        DiscountedProduct p = new DiscountedProduct("P001", "Nike Shoes", 4999.0, 10.0);
        System.out.println("Price after discount: ₹" + p.applyDiscount());

        // Record used as summary
        OrderSummary summary = new OrderSummary("ORD101", "Nike Shoes", 4499.1);
        System.out.println(summary);

        // Payment with abstract class
        PaymentMethod payment = new CreditCardPayment(4499.1, "1234567890123456");
        payment.pay();
        payment.printReceipt();

        // Interface used for search
        if (p.matches("nike")) {
            System.out.println("Search matched product: " + p);
        }
    }
}
