package S1_javaLanguage.S1_01.Level_2.Exercici_1;

public class Phone {

    // Attributes
    String brand;
    String model;

    Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Methods
    void call(String number) {
        System.out.println("The number " + number + " is receiving a call.");
    }
}
