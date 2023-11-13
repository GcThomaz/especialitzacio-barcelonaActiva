package S1_javaLanguage.S1_07.Exercici_2;

public class Worker {
    protected String firstName;
    protected String lastName;
    protected double hourlyRate;

    public Worker(String firstName, String lastName, double hourlyRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hourlyRate = hourlyRate;
    }

    // Método para calcular el salario
    public double calculateSalary(int hoursWorked) {
        return hoursWorked * hourlyRate;
    }
}
