package S1_javaLanguage.S1_08.Exercici_3;

import java.util.Arrays;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {
        List<String> months = Arrays.asList("January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December");

        months.forEach(System.out::println);
    }
}
