package hw_week_3;

import java.util.Scanner;

public class p2_maxMinAverage {
    ////////////////////////////////
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        double sum = 0;
        double min = Double.MIN_VALUE;// thats that -2,147,483,648
        double max = Double.MAX_VALUE;
        int count = 0;
        // scanner.close();

        System.out.println("Enter a set of numbers. Enter a negative number to stop:");
        while (true) {
            double num = user_input.nextDouble();
            if (num < 0) {
                break;
            } else {
                sum += num;
                min = Math.min(min, num);
                max = Math.max(max, num);
                count++;
            }
        }
        user_input.close();

        if (count == 0) {
            System.out.println("No numbers entered.");
        } else {
            double average = sum / count;
            double range = max - min;
            System.out.println("Count is: " + count);
            System.out.println("Average is: " + average);
            System.out.println("Smallest is: " + min);
            System.out.println("Largest is: " + max);
            System.out.println("Range is: " + range);
        }
    }
    ////////////////////////////////
}
