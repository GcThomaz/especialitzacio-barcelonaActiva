package S1_javaLanguage.S1_04.Exercici_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MonthsOfTheYear {
    private List<String> monthsList;

    public MonthsOfTheYear() {
        // Inicializa a lista com os nomes dos meses
        this.monthsList = new ArrayList<>(Arrays.asList(
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        ));
    }

    public List<String> getMonthsList() {
        return monthsList;
    }
}
