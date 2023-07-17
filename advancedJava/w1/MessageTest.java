package advancedJava.w1;
//import advancedJava.w1.Message;

import java.util.Scanner;

public class MessageTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("From: ");

        String sender = input.nextLine();
        System.out.println("To: ");
        String recipient = input.nextLine();
        // Message test1 = new Message("Shaina", "Tony");

        Message myMsg1 = new Message(recipient, sender);

        System.out.println("add message ");
        String msg = input.nextLine();
        input.close();

        myMsg1.append(msg);

        System.out.println("Your Message is: \n");
        System.out.println(myMsg1.toString());

    }

}
