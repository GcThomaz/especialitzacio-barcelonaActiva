package S1_javaLanguage.S1_08.Exercici_5;

public class Ex5 {
    public static void main(String[] args) {
        PiValue piProvider = () -> 3.14159265359;
        System.out.println(piProvider.getPiValue());
    }
}
