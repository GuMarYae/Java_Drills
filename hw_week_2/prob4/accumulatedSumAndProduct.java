package hw_week_2.prob4;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.BigInteger;

public class accumulatedSumAndProduct {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        // when 0 the product answer will always be 0
        int product = 1;
        System.out.print("Enter five whole numbers followed by spaces or \"ENTER\": \n");
        for (int i = 0; i < 5; i++) {

            if (input.hasNext()) {
                num = input.nextInt();
                sum += num;
                product *= num;
            }
        }
        input.close();
        System.out.println("The sumTOT is: " + sum);
        System.out.println("The product of numbers are: " + product);
    }
}
