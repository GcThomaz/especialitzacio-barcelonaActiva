package S1_javaLanguage.S1_01.Exercici_1;

public class StringInstrument extends Instruments{
    StringInstrument(String name, double price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("A String instrument is playing!");
    }
}
