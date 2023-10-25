package S1_javaLanguage.S1_02.Level_1.Exercici_1;

import java.util.ArrayList;

public class Sale {

    //ATTRIBUTES
    private ArrayList<Product> productList;
    private double totalSalePrice;

    // CONSTRUCTOR
    Sale() {
        productList = new ArrayList<>();
        totalSalePrice = 0;
    }

    //GETTERS
    public ArrayList<Product> getProductList() {
        return productList;
    }

    public double getTotalSalePrice() {
        return totalSalePrice;
    }

    // METHODS
    public void addProduct(Product product) {
        productList.add(product);
    }

    public void calculateTotal() throws EmptySaleException {
        if(productList.isEmpty()) {
            throw new EmptySaleException("To make a sale, you must first add products!");
        }
        totalSalePrice = 0;
        for(Product product : productList) {
            totalSalePrice += product.getProductPrice();
        }
    }
}
