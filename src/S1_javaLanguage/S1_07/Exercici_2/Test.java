package S1_javaLanguage.S1_07.Exercici_2;

public class Test {
    public static void main(String[] args) {
        WorkerPresencial presencialWorker = new WorkerPresencial("Joao", "Maria", 20.0);
        double presencialSalary = presencialWorker.calculateSalary(160);
        System.out.println("Presencial Worker Salary: $" + presencialSalary);

        WorkerOnline onlineWorker = new WorkerOnline("Maria", "Joao", 15.0);
        double onlineSalary = onlineWorker.calculateSalary(120);
        System.out.println("Online Worker Salary: $" + onlineSalary);
    }
}
