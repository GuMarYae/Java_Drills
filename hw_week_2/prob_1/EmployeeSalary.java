package hw_week_2.prob_1;

//from now on , to get use to it I add these as repitition 
import java.util.Scanner;
import java.math.BigInteger;
import java.math.BigDecimal;

/*
 * we need weekly wage
 * weekly wage if hours pass 40
 * extra pay by 1.50
 * annual salary based off hours and weekly
 * name of employer
 */

/* Also.. page 65-> The next method places the next word 
into the string variable.
 */
//also input.nextLine  !!!!!!!!!!   is input for strings
//ill figure out whats the difference later, I guess

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double wage;
        double hoursPerWeek;

        double pay = 0;
        double ot = 0;

        String fName, lName, temp;

        System.out.println("Enter hourly wage/pay: ");
        wage = input.nextDouble();
        System.out.println("Ok: $" + wage + "\n");
        System.out.println("Enter hours per week worked: ");
        hoursPerWeek = input.nextDouble();
        System.out.println("Ok: " + hoursPerWeek + " hr's\n");

        if (hoursPerWeek <= 40) {
            pay = wage * hoursPerWeek;
            Scanner input2 = new Scanner(System.in);
            System.out.print("Enter your first name: ");
            fName = input2.nextLine();
            System.out.print("Enter your last name: ");
            lName = input2.nextLine();
            System.out.print(fName + " " + lName+"\n");
            input2.close();
            System.out.println("Your weekly checks are: $" + pay + ".\n");
        } else {
            pay = wage * hoursPerWeek;
            ot = (hoursPerWeek - 40) + (wage * 1.5) + pay;
            Scanner input2 = new Scanner(System.in);
            System.out.print("Enter your first name: ");
            fName = input2.nextLine();
            System.out.print("Enter your last name: ");
            lName = input2.nextLine();
            System.out.print(fName + " " + lName+"\n");
            input2.close();
            System.out.println("Your weekly checks are: $" + ot + ".\n");

        }
        input.close();

        System.out.println("Your salary is: $" + pay * 52);

    }

}
