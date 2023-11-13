package S1_javaLanguage.S1_08.Exercici_1;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        List<String> strings = List.of("hello", "world", "java", "programming", "language");

        List<String> result = filterStringsContainingO(strings);
        System.out.println(result);
    }

    private static List<String> filterStringsContainingO(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String str : strings) {
            if (str.contains("o")) {
                result.add(str);
            }
        }
        return result;
    }
}
