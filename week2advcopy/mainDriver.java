package week2advcopy;

import java.util.Scanner;
import java.math.BigInteger;
import java.math.BigDecimal;

public class mainDriver {

    // tester / DriverMain
    public static void main(String[] args) {
        // ⭐ Appointment
        Appointment[] app = new Appointment[4];
        app[0] = new Appointment(2023, 7, 15, "time to trade");
        app[1] = new Appointment(2023, 7, 15, "time to make music");
        app[2] = new Appointment(2023, 7, 15, "dont sleep");
        app[3] = new Appointment(2023, 7, 16, "sleep early");
        System.out.println(app[0].occursOn(2023, 7, 15));
        System.out.println(app[0].occursOn(2022, 7, 15));
        System.out.println(app[0].toString());

        // ⭐ One time
        OneTimeAppointment[] appOT1 = new OneTimeAppointment[4];
        appOT1[0] = new OneTimeAppointment(2022, 12, 17, "1:20pm", "2023 is my year",
                "try to profit more from last week");
        // appOT[0].setAtTime(12);
        // System.out.println(appOT[0].getAtTime());
        System.out.println(appOT1[0].occursOn("1:21pm", "2023 is my year"));
        System.out.println(appOT1[0].toString());

        // daily
        DailyAppointment[] appDaily1 = new DailyAppointment[2];
        appDaily1[0] = new DailyAppointment(2021, 8, 1, "M,W,R,F ", 'n', "workout these mornings");
        System.out.println(appDaily1[0].toString());

        // System.out.println(appDaily1[0].getIsImportant());

        // monthly
        MonthlyAppointment appMonth = new MonthlyAppointment(2023, 4, 10, 10, "check bills");
        System.out.println(appMonth.toString());
        System.out.println("on 2002-03-10: " + appMonth.occursOn(2022, 3, 10));

        /*
         * display prompt the user to ask to enter yr, month, and day to check
         * use scanner to read the yr, month and day
         * use a forloop to go through each of the appointment objects in the array
         * invoke the the occurs on method to determine if the appointment happens on
         * the specific day
         * 
         * part b creating an appointment
         * 
         */
        // user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Appointment type: ");
        String type = scanner.nextLine();

        System.out.print("Description: ");
        String description = scanner.nextLine();

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        System.out.print("Enter month: ");
        int month = scanner.nextInt();

        System.out.print("Enter the day: ");
        int day = scanner.nextInt();
        // Scenner close
        scanner.close();
        
        Appointment appointment = new Appointment(year, month, day, description);

        System.out.println("New appointment created:");
        System.out.println(appointment);

    }

}
