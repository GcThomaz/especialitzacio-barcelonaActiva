package S1_javaLanguage.S1_07.Exercici_2;

public class WorkerOnline extends Worker{
    // Atributo constante
    private static final double internetFlatFee = 30.0;

    public WorkerOnline(String firstName, String lastName, double hourlyRate) {
        super(firstName, lastName, hourlyRate);
    }

    // Sobrescribe el método de la clase base
    @Override
    public double calculateSalary(int hoursWorked) {
        // Calcula el salario incluyendo la tarifa plana de Internet
        return super.calculateSalary(hoursWorked) + internetFlatFee;
    }
}
