package S1_javaLanguage.S1_02.Level_1.Exercici_1;

public class Product {

    // ATTRIBUTES
    private String productName;
    private double productPrice;

    // CONSTRUCTOR
    Product(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    // GETTERS
    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }
}
