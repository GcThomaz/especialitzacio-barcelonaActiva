package S1_javaLanguage.S1_08.Exercici_2;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        List<String> strings = List.of("hello", "world", "java", "programming", "language");

        List<String> result = filterStringsContainingOAndLength(strings);
        System.out.println(result);
    }

    private static List<String> filterStringsContainingOAndLength(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String str : strings) {
            if (str.contains("o") && str.length() > 5) {
                result.add(str);
            }
        }
        return result;
    }
}
