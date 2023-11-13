package S1_javaLanguage.S1_07.Exercici_1;

public class WorkerOnline extends Worker{
    private static final double internetFlatFee = 30.0;

    public WorkerOnline(String firstName, String lastName, double hourlyRate) {
        super(firstName, lastName, hourlyRate);
    }

    @Override
    public double calculateSalary(int hoursWorked) {
        return super.calculateSalary(hoursWorked) + internetFlatFee;
    }

    @Deprecated
    public void deprecatedMethod() {
        System.out.println("This method is deprecated in WorkerOnline.");
    }
}
