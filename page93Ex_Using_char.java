import java.util.Scanner;

public class page93Ex_Using_char {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Y to quit.");
        String enter = input.next();
        char start = enter.charAt(0);
        
        input.close();
        // i HAD TO MAKE IT LIKE THIS IN THE IF STATEMENT BECAUSE IF I WROTE if (start
        // == "Y") THE CODE WOULDVE KEPT GOING TO THE IF ESLE STATEMENT
        // sooo.. you have to make a char if youre looking for a specific letter, as far
        // as I kno. Java uuugh
        if (start == 'Y') {
            System.out.println("Goodbye.");
        } else
            System.out.print("nigga, Press Y!! The big Y!");
    }

};
