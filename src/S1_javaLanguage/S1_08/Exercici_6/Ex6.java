package S1_javaLanguage.S1_08.Exercici_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex6 {
    public static void main(String[] args) {
        List<String> mixedList = new ArrayList<>();
        mixedList.add("Watermelon");
        mixedList.add("Banana");
        mixedList.add("Orange");
        mixedList.add("Mango");
        mixedList.add("Strawberry");

        mixedList.sort((s1, s2) -> s1.length() - s2.length());

        System.out.println(mixedList);
    }
}
