package S1_javaLanguage.S1_08.Exercici_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex7 {
    public static void main(String[] args) {
        List<String> mixedList = new ArrayList<>();
        mixedList.add("Watermelon");
        mixedList.add("Banana");
        mixedList.add("Orange");
        mixedList.add("Mango");
        mixedList.add("Strawberry");

        Collections.sort(mixedList, (s1, s2) -> s2.length() - s1.length());

        System.out.println(mixedList);
    }
}
