package S1_javaLanguage.S1_01.Exercici_1;

public abstract class Instruments {

    //Attributes

    String name;
    double price;

    //Constructor
    Instruments (String name, double price) {
        this.name = name;
        this.price = price;
    }
    public abstract void play();
}
