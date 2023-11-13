package S1_javaLanguage.S1_07.Exercici_1;

public class WorkerPresencial extends Worker{
    private static double gasoline = 50.0;

    public WorkerPresencial(String firstName, String lastName, double hourlyRate) {
        super(firstName, lastName, hourlyRate);
    }

    @Override
    public double calculateSalary(int hoursWorked) {
        return super.calculateSalary(hoursWorked) + gasoline;
    }

    @Deprecated
    public void deprecatedMethod() {
        System.out.println("This method is deprecated in WorkerPresencial.");
    }
}
