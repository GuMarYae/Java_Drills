package hw_week_3;

import java.util.Scanner;
import java.math.BigInteger;
import java.math.BigInteger;
import java.lang.String;
//this might be useful with equals or compareTo

/*
        my main idea
        int num1 = 2;
        int num2 = 3;
        int temp;

        temp = num1;//2
        num1 =num2; //3
        num2 = temp;//2

 */

public class p1_Swapping {

    public static void main(String[] args) {

        String word = "supercalifragilisticexpialidocious";
        String word2 = "What?";
        char temp;

        char character_1;
        char character_2;
        // random words minus the first and last character
        String randomWord1 = word.substring(1, word.length() - 1);
        int wordLength1 = randomWord1.length();

        String randomWord2 = word2.substring(1, word2.length() - 1);
        // System.out.println(randomWord2);
        int wordLength2 = randomWord2.length();
        // ------------------------------------------------------

        for (int i = 0; i < 1; i++) {
            // generate random number of randomword1 through wordlength

            int randomNum1 = (int) ((Math.random()) * wordLength1);//the reason why we need int is because math.random() pushes out a "double" numnber between o.o and 1.0
            // generate a random character of randomWord1 with the random number above its
            // kinda like a random [i] in c++
            // System.out.println(randomNum1); //this was the issue saying put of range ..
            // took the -1 from int randomNum1 = (int) ((Math.random()) * wordLength1)-1;
            char randomChar1 = randomWord1.charAt(randomNum1);
            character_1 = randomChar1;
            // System.out.println(character_1);

            for (int j = 0; j < 1; j++) {
                // generate random number of randomword1 through wordlength

                int randomNum2 = (int) ((Math.random()) * wordLength2);
                // generate a random character of randomWord1 with the random number above its
                // kinda like a random [i] in c++
                // System.out.println(randomNum1); //this was the issue saying put of range ..
                // took the -1 from int randomNum1 = (int) ((Math.random()) * wordLength1)-1;
                char randomChar2 = randomWord2.charAt(randomNum2);
                character_2 = randomChar2;

                System.out.println("\tThe character taken from word 1 is: \"" + character_1
                        + "\". and the character taken from word 2 is: \"" + character_2 + "\".\n \n");
                // swap
                temp = character_1;
                character_1 = character_2;
                character_2 = temp;
                System.out.println("\tSwapping them will be \"" + character_1 + "\" for word 1 and \"" + character_2
                        + "\" for word 2.");

            }

        }

    }

}
