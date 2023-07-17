package rough;

public class mainDriver {
    public static void main(String[] args) {
        SalaryEmployee salaryEmployee = new SalaryEmployee("John", "Doe", "123-456-7890", 5000.0);
        System.out.println(salaryEmployee.toString());
        System.out.println("Earnings: $" + salaryEmployee.earnings());

        HourlyEmployee hourlyEmployee = new HourlyEmployee("Jane", "Smith", "987-654-3210", 15.0, 40.0);
        System.out.println(hourlyEmployee.toString());
        System.out.println("Earnings: $" + hourlyEmployee.earnings());
    }
}