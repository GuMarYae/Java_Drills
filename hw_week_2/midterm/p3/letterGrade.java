package hw_week_2.midterm.p3;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.BigInteger;

public class letterGrade {
    public static void main(String[] args) {

        char letter;

        System.out.println("Enter letter grade:");
        Scanner input = new Scanner(System.in);
        // this is the reason why JAVA is giving me bad vibes [BELOW]
        // update. I found this pic online on how to use a char for JAVA
        // Picture saved in homework. Ill definetely NEED IT
        letter = input.next().charAt(0);// ITS LITERALLY A METHOD AFTER ANOTHER METHOD JUST TO CHANGE A CHARACTER
                                        // (REMEMBER smh)
        // ⏬test to see if it works ⏬
        // System.out.println(letter);
        // ill make a switch statement forst then throw it all in an if statement only
        // accepting A B C D E F or else!
        // if(Character.toUpperCase(letter) =='A')

        switch (letter) {
            // Okay im just playin around at this point added picture to the hw folder..
            // trying to know Java more and more
            // because I have yet to understand why the world prefers java ove c++ but its
            // growing little by little
            case 'a':
                letter = Character.toUpperCase(letter);
                break;
            case 'b':
                letter = Character.toUpperCase(letter);
                break;
            case 'c':
                letter = Character.toUpperCase(letter);
                break;
            case 'd':
                letter = Character.toUpperCase(letter);
                break;
            case 'e':
                letter = Character.toUpperCase(letter);
                break;
            case 'f':
                letter = Character.toUpperCase(letter);
                break;
            default:
                System.out.print("");
        }

        switch (letter) {
            case 'A':
                System.out.print("Grade is : 4.0");

                break;
            case 'B':
                System.out.print("Grade is : 3.0");
                break;
            case 'C':
                System.out.print("Grade is : 2.0");
                break;
            case 'D':
                System.out.print("Grade is : 1.0");
                break;
            case 'E':
                System.out.print("Grade is : 0.0");
                break;
            case 'F':
                System.out.print("Grade is : 0.0 Daaang, man!!!  uugh");
                break;
            // default: System.out.print("Invalid letter. Note Make sure its uppercase");
            default:
                System.out.print("Invalid letter.");

        }

    }

}
