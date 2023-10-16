package S1_javaLanguage.S1_01.Level_1.Exercici_2;

public class Car {

    // Attributes
    static final String brand = "Mercedes";
    static String model;
    final int power = 100;

    // Constructor
    public Car() {}

    // Methods
    static void brake() {
        System.out.println("The vehicle is breaking!");
    }
    void accelerate() {
        System.out.println("The vehicle is accelerating!");
    }
}
