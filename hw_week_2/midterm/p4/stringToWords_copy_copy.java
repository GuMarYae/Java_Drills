package hw_week_2.midterm.p4;

import java.util.Scanner;

public class stringToWords_copy_copy {

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




        
        // Print each word and its length
        String currentWord = "";
        for (int i = 0; i < noCommas.length(); i++) {
            char c = noCommas.charAt(i);
            if (c == ' ') {
                if (!currentWord.isEmpty()) {
                    System.out.print(currentWord + " " + currentWord.length() + ", ");
                    currentWord = "";
                }
            } else {
                currentWord += c;
            }
        }
        if (!currentWord.isEmpty()) {
            System.out.print(currentWord + " " + currentWord.length());
        }
        System.out.println(); // Print a newline at the end

    }
}
