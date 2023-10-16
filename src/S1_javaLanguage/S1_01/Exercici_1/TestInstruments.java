package S1_javaLanguage.S1_01.Exercici_1;

public class TestInstruments {
    public static void main(String[] args) {

        Instruments i1 = new StringInstrument("Guitar", 150.7);
        Instruments i2 = new PercussionInstruments("drums", 890);
        Instruments i3 = new WindInstrument("Flute", 200);

        i1.play();
        i2.play();
        i3.play();
    }
}
