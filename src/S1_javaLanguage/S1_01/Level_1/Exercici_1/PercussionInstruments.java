package S1_javaLanguage.S1_01.Level_1.Exercici_1;

public class PercussionInstruments extends Instruments {
    PercussionInstruments(String name, double price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("A Percussion instrument is playing!");
    }
}
