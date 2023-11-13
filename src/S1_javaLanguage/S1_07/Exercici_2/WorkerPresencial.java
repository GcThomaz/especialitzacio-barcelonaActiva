package S1_javaLanguage.S1_07.Exercici_2;

public class WorkerPresencial extends Worker{
    // Atributo estático
    private static double gasoline = 50.0;

    public WorkerPresencial(String firstName, String lastName, double hourlyRate) {
        super(firstName, lastName, hourlyRate);
    }

    // Sobrescribe el método de la clase base
    @Override
    public double calculateSalary(int hoursWorked) {
        // Calcula el salario incluyendo el costo de la gasolina
        return super.calculateSalary(hoursWorked) + gasoline;
    }
}
