package S1_javaLanguage.S1_04.Exercici_2;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class DniCalculationTest {
    @Test
    public void testCalculateDniLetter() {
                int[] dniNumbers = {12345678, 87654321, 98765432, 34567890, 56789012, 43210987, 11122333, 44455566,
                        77788899,
                        99900011};
                char[] expectedLetters = {'X', 'Z', 'N', 'R', 'E', 'Y', 'X', 'R', 'U', 'K'};

                for (int i = 0; i < dniNumbers.length; i++) {
                    char calculatedLetter = DniCalculation.calculateDniLetter(dniNumbers[i]);
                    assertEquals(expectedLetters[i], calculatedLetter);
                }
            }
        }
