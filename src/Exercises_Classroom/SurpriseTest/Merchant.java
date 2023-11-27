package Exercises_Classroom.SurpriseTest;

import java.util.ArrayList;

public class Merchant extends Supplier {

    //Attributes

    private ArrayList<Product> merchantProductList;

    //Constructor
    public Merchant(String name, int age, String city) {
        super(name, age, city);
        this.merchantProductList = new ArrayList<>(7);
    }

    //Getters

    public ArrayList<Product> getMerchantProductList() {
        return merchantProductList;
    }
}
