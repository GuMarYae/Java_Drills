package hw_week_2.prob2;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.BigInteger;

public class superMarketCoupon {
    public static void main(String[] args) {

        int amountSpent;

        double discount;

        System.out.print("Enter amount spent: ");
        Scanner input = new Scanner(System.in);
        amountSpent = input.nextInt();
        input.close();

        if (amountSpent >= 40 && amountSpent <= 50) {
            discount = amountSpent * 0.08;

        } else if (amountSpent > 50 && amountSpent <= 65) {
            discount = amountSpent * 0.10;

        }

        else if (amountSpent > 65 && amountSpent <= 77) {
            discount = amountSpent * 0.13;

        }

        else if (amountSpent > 77 && amountSpent <= 100) {
            discount = amountSpent * 0.15;

        } else if (amountSpent > 100) {
            discount = amountSpent * 0.2;
        } else
            discount = amountSpent * 0;

        double afterMath = amountSpent - discount;

        System.out.print("You spent $" + amountSpent + ". Your discount is: $" + discount + "\n");
        System.out.print("Your new total is $");
        System.out.printf("%.2f", afterMath);
    }

}
