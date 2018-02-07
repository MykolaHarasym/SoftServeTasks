package Task4;

public class EmployeesWithHourlyWage extends Empoyees {
    private double hourlyWage;
    private double averageMonthlySalary;

    public EmployeesWithHourlyWage(String name, double hourlyWage) {
        super(name);
        this.hourlyWage = hourlyWage;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    @Override
    public double calculateAverageMonthlySalary() {
        averageMonthlySalary = getHourlyWage()*20.8*8;
        return averageMonthlySalary;
    }

    @Override
    public String toString() {
        return "EmployeesWithHourlyWage{" + "Id=" + getId() + " name=" + getName() +
                " AverageMonthlySalary=" + calculateAverageMonthlySalary() +
                '}' + "\n";
    }
}
