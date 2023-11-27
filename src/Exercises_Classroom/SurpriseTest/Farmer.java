package Exercises_Classroom.SurpriseTest;

import java.util.ArrayList;

public class Farmer extends Supplier {

    //Attributes

    private ArrayList<Product> farmerProductList;

    //Constructor
    public Farmer(String name, int age, String city) {
        super(name, age, city);
        this.farmerProductList = new ArrayList<>(5);
    }

    //Getter
    public ArrayList<Product> getFarmerProductList() {
        return farmerProductList;
    }
}
