package week3adj.timer;

import java.util.Date;
import java.util.Scanner;



public class Time {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        // time in seconds test
        System.out.println("time in seconds: " + startTime / 1000 + "\n");
        long currentTime;
       
        // Date now = new Date();
        // TESTER FOR the now variable
        // System.out.println(now);

        // change with respect to the currentTimeMillis
        // in a while true loop
        //Scanner userInput = new Scanner(System.in);
        //int input = userInput.nextInt();
        //while (input != 0) 
        while(true){
            Date now = new Date();
            // userInput.nextInt() in here so the code updates every 1000
            // milli seconds (1 second)
            currentTime = System.currentTimeMillis();

            if (currentTime - startTime >= 1000) {
                // tried System.out(new Date(). also worked)
                // update added public variable Date now
                System.out.println(now);
                startTime = currentTime;
            }

        }
        //userInput.close();

    }
  
}
