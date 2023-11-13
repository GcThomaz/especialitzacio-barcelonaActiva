package S1_javaLanguage.S1_04.Exercici_2;

public class DniCalculation {
    public static char calculateDniLetter(int dniNumber) {
            String letters = "TRWAGMYFPDXBNJZSQVHLCKE";
            int index = dniNumber % 23;
            return letters.charAt(index);
        }
    }
