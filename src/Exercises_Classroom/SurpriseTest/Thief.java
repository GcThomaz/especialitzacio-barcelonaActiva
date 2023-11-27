package Exercises_Classroom.SurpriseTest;

import java.util.ArrayList;

public class Thief extends Supplier {

    //Attribute

    private ArrayList<Product> thiefProductList;

    //Constructor
    public Thief(String name, int age, String city) {
        super(name, age, city);
        this.thiefProductList = new ArrayList<>(3);
    }

    //Getters

    public ArrayList<Product> getThiefProductList() {
        return thiefProductList;
    }
}
