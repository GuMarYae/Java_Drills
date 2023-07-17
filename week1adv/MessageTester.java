package week1adv;
//this (import) works for me like c++ but it matters where you actually put it. smh!
//if i put it above package, the code goes crazy and crashes 
import week1adv.Message;

//javac Message.java MessageTester.java
import java.util.Scanner;

public class MessageTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("From: ");
        String sender = input.nextLine();
        System.out.println("To: ");
        String recipient = input.nextLine();

        //////////////////////////////////////////////////
        // Message test1 = new Message("Shaina", "Tony");
        // objects that calls constructors

        Message myMsg1 = new Message(recipient, sender);
        Message myMsg2 = new Message("Shaina", "Tony");
        // add a message with Message class

        System.out.println("add message ");
        String msg = input.nextLine();
        
        // append message
        myMsg1.append(msg);
        myMsg2.append(msg);
        input.close();
        ////////////////////mailbox class object///////////////////////////////////
        // CRUD -> javaScript creat, read, update, delete
        Mailbox mailbox = new Mailbox();
        // create
        mailbox.addMessage(myMsg1);
        mailbox.addMessage(myMsg2);
        // read
        System.out.println("Your Message is: \n");
        System.out.println(myMsg1.toString());
        System.out.println(myMsg2.toString());

        // retrieve message
        Message retrievedMessage = mailbox.getMessage(0);
        System.out.println(retrievedMessage.toString());
        // delete
        System.out.println("Total messages is: " + mailbox.mailboxSize());
        mailbox.removeMessage(0);
        System.out.println("Total messages is now: " + mailbox.mailboxSize());

        //delete again
        System.out.println("Total messages is: " + mailbox.mailboxSize());
        mailbox.removeMessage(0);
        System.out.println("Total messages is now: " + mailbox.mailboxSize());

    }

}
