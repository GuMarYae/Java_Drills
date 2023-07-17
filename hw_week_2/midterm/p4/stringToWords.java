package hw_week_2.midterm.p4;

import java.util.Scanner;

public class stringToWords {

    public static void main(String[] args) {

        System.out.print("Enter a sentence\n");
        Scanner input = new Scanner(System.in);
        // if this dont work, ill try input.next()
        String sentence = input.nextLine();
        // test
        //System.out.print(sentence);
        // taking away commas

        String commas = "";

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch != ',') {
                commas = commas + ch;
            }
        }
        // now for the indiv words
        String currentWord = "";
        for (int i = 0; i < commas.length(); i++) {
            char ch = commas.charAt(i);
            if (ch == ' ') {
                System.out.print(ch + " " + sentence.length());
                currentWord = "";
            } else {
                currentWord += ch;
                System.out.print(ch + " " + sentence.length());
            }
            // System.out.print(i);
            // System.out.print(ch);

        }
        System.out.println();
    }

}
