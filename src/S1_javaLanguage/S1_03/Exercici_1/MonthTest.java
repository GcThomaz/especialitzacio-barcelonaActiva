package S1_javaLanguage.S1_03.Exercici_1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class MonthTest {
    public static void main(String[] args) {

        ArrayList<Month> listMonth = new ArrayList<>();

        String[] nameMonth = {"January", "February", "March", "April", "May", "June", "July", "September",
                "October", "November", "December"};

        for (String name : nameMonth) {
            Month month = new Month(name);
            if (!name.equals("August")) {
                listMonth.add(month);
            }
        }

        Month august = new Month("August");
        listMonth.add(7, august);

        System.out.println("ArrayList keeping the correct order: ");
        for (Month month : listMonth) {
            System.out.println(month.getName());
        }

        HashSet<Month> setMonth = new HashSet<>(listMonth);

        System.out.println("\nIterating through the HashSet using for: ");
        for (Month month : setMonth) {
            System.out.println(month.getName());
        }

        System.out.println("\nIterating through the HashSet using iterator: ");
        Iterator<Month> iterator = setMonth.iterator();
        while (iterator.hasNext()) {
            Month month = iterator.next();
            System.out.println(month.getName());
        }
    }
}
