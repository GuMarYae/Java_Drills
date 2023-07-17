package hw_week_3;

import java.util.Scanner;

public class p4_writingMethods {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("enter an integer number:");
        int input = userInput.nextInt();
        System.out.print("\nThe first digit in " + input + " is " + firstDigit(input));
        // firstDigit(input);

        userInput.close();

    }

    public static int firstDigit(int input) {

        int number = input;
        while (input > 10) {
            input /= 10; // input = (input / 10) and it will keep looping until the value is under ten
                         // but
                         // will store the last digit right before the VALUE decreased under 10}
        }
        // if the number is already smaller than 10, itll just retutn it
        // itll literally get sent to a function, get divided by nothing and get spit
        // right back out
        // the whole while loop will be ignored
        lastDigit(number);
        return input;

    }

    public static int lastDigit(int input) {
        int number = input;
        System.out.print("\nThe last digit in " + input + " is " + input % 10);
        digits(number);
        return input % 10;
    }

    public static int digits(int input) {
        int number = input;
        int count = 0;
        while (input != 0) {
            input /= 10;
            count++;
        }
        System.out.print("\nThe total digits in " + number + " is " + count);
        return count;
    }
    /*
     * I know I could've just called the functions in main
     * but i wanted to see what calling a function within a function
     * would look like.. bad idea for this problem.. but it worked... from bottom to top
     */

}
