package S1_javaLanguage.S1_01.Level_1.Exercici_1;

public class WindInstrument extends Instruments{
    WindInstrument(String name, double price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("A Wind instrument is playing!");
    }
}
