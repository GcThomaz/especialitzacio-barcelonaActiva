package S1_javaLanguage.S1_07.Exercici_1;

public class Worker {
    protected String firstName;
    protected String lastName;
    protected double hourlyRate;

    public Worker(String firstName, String lastName, double hourlyRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary(int hoursWorked) {
        return hoursWorked * hourlyRate;
    }

    @Deprecated
    public void deprecatedMethod() {
        System.out.println("This method is deprecated.");
    }
}
