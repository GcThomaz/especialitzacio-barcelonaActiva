package S1_javaLanguage.S1_07.Exercici_1;

public class Test {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        WorkerPresencial presencialWorker = new WorkerPresencial("Joao", "Maria", 20.0);

        presencialWorker.deprecatedMethod();

        WorkerOnline onlineWorker = new WorkerOnline("Maria", "Joao", 15.0);

        onlineWorker.deprecatedMethod();
    }

}
