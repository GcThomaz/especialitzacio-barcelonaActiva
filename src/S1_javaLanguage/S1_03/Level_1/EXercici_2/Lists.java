package S1_javaLanguage.S1_03.Level_1.EXercici_2;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lists {

    public static void main(String[] args) {

        List<Integer> firstList = new ArrayList<>();
        firstList.add(1);
        firstList.add(2);
        firstList.add(3);
        firstList.add(4);
        firstList.add(5);

        List<Integer> secondList = new ArrayList<>();

        ListIterator<Integer> listIterator = firstList.listIterator(firstList.size());

        while (listIterator.hasPrevious()) {
            int element = listIterator.previous();
            secondList.add(element);
        }

        System.out.println("First List: ");
        for (int element : firstList) {
            System.out.println(element);
        }

        System.out.println("\nSecond List (Reverse order): ");
        for (int element : secondList) {
            System.out.println(element);

        }
    }

}