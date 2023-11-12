package S1_javaLanguage.S1_04.Exercici_1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MonthsOfTheYearTest {
    @Test
    public void testMonthList() {
        MonthsOfTheYear montsYear = new MonthsOfTheYear();

        assertEquals(12, montsYear.getMonthsList().size());

        assertNotNull(montsYear.getMonthsList());

        assertEquals("August", montsYear.getMonthsList().get(7));
    }
}
