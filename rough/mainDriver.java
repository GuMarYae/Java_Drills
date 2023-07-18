package rough;

public class mainDriver {
    public static void main(String[] args) {
        SalaryEmployee empSalary = new SalaryEmployee("Tony", "Dee", "000000007", 680000);
        System.out.println(empSalary.toString());
        System.out.println("Earnings: $" + empSalary.earnings());

        HourlyEmployee hourlyEmployee = new HourlyEmployee("AnotherTony", "NotJunior", "700000000", 15.0, 10005);
        System.out.println(hourlyEmployee.toString());
        System.out.println("Earnings: $" + hourlyEmployee.earnings());
    }
}