package Task4;

public class EmployeeWithFixedPayment extends Empoyees {
    private double fixedPayment;
    private double averageMonthlySalary;

    public EmployeeWithFixedPayment(String name, double fixedPayment) {
        super(name);
        this.fixedPayment = fixedPayment;
    }

    public double getFixedPayment() {
        return fixedPayment;
    }

    public void setFixedPayment(double fixedPayment) {
        this.fixedPayment = fixedPayment;
    }

    @Override
    public double calculateAverageMonthlySalary() {
        averageMonthlySalary = fixedPayment;
        return averageMonthlySalary;
    }

    @Override
    public String toString() {
        return "EmployeesWithHourlyWage{" + "Id=" + getId() + " name=" + getName() +
                " AverageMonthlySalary=" + calculateAverageMonthlySalary() +
                '}'  + "\n";
    }
}
