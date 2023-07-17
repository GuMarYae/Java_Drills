package hw_week_2.midterm.p4;

import java.util.Scanner;

public class stringToWords_copy {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Remove commas from the string
        String noCommas = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c != ',') {
                noCommas += c;
            }
        }

        // Split the string into words
        String[] words = noCommas.split(" ");
        
        // Print each word and its length
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int length = word.length();
            System.out.print(word + " " + length);
            if (i < words.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(); // Print a newline at the end

    }
}
