package rough;

public class SalaryEmployee extends Employee {
    private double salary;

    public SalaryEmployee(String firstName, String lastName, String socialSecurityNumber, double salary) {
        super(firstName, lastName, socialSecurityNumber);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public double earnings() {
        return salary;
    }
}