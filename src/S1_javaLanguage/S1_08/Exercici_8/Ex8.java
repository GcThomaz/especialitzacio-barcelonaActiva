package S1_javaLanguage.S1_08.Exercici_8;

public class Ex8 {
    public static void main(String[] args) {
        StringReverser reverser = input -> {
            StringBuilder reversed = new StringBuilder(input);
            return reversed.reverse().toString();
        };

        String result = reverser.reverse("Gustavo");
        System.out.println(result);
    }
}
