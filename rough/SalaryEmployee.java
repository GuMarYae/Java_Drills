package rough;

public class SalaryEmployee extends Employee {
    private int salary;

    public SalaryEmployee(String firstName, String lastName, String socialSecurityNumber, int salary) {
        super(firstName, lastName, socialSecurityNumber);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public double earnings() {
        return salary;
    }
}