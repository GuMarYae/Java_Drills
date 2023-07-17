package hw_week_2.prob3;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.BigInteger;

//figure out later if you can add a comment after the hasNext() method

public class sumOfOdds {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = 0;
        int sum = 0;

        while (number > -1) {
            System.out.print("Enter a whole number:");
            if (input.hasNext()) {

                number = input.nextInt();

                if (number <= -1) {
                    System.out.println("...Bye");
                    break;
                }
                else if (number % 2 == 1) {
                    System.out.print("Number entered :" + number + "\n");
                    sum = sum + number;
                    System.out.print("sum of all odds is : " + sum + "\n");
                } else {
                    System.out.println(number + " is an even number and will be ignored\n");
                }
            } 

        }
        input.close();
    }
}
