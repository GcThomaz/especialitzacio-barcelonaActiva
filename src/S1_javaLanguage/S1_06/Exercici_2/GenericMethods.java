package S1_javaLanguage.S1_06.Exercici_2;

public class GenericMethods {
    public static <T> void imprimirArguments(T arg1, T arg2, T arg3) {
        System.out.println("Argument 1: " + arg1);
        System.out.println("Argument 2: " + arg2);
        System.out.println("Argument 3: " + arg3);
    }
}
