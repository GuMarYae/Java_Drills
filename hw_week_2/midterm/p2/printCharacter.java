package hw_week_2.midterm.p2;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.BigInteger;

public class printCharacter {

    public static void main(String[] args) {
        System.out.print("Enter an odd integer\n");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number % 2 == 1) {
            for (int i = 0; i < number; i++) {
                System.out.println();
                for (int j = 0; j < number; j++) {
                    System.out.print("*" + " ");
                }
            }

        } else {
            System.out.print("that number is EVEN");
        }
        input.close();
        
    }

}
