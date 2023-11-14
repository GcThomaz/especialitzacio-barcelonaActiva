package S1_javaLanguage.S1_06.Exercici_2;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("Joao", "Maria", 100);
        String chain = "Hello, I'm a chain!";
        int number = 42;
        System.out.println();
        GenericMethods.imprimirArguments(person, chain, number);
    }
}
