package S1_javaLanguage.S1_04.Exercici_3;

import org.junit.Test;

public class ThrowExceptionTest {
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void throwExceptionTest() {
        ThrowException test = new ThrowException();
        test.throwException();
    }
}
