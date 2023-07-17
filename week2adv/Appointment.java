package week2adv;

public class Appointment {
    private String Description;
    private int year, month, day;

    // constructor
    public Appointment(int year, int month, int day, String description) {
        System.out.println("Constructor called");

        this.Description = description;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // functions
    // getter
    public String getDescription() {
        return Description;
    }

    // remember from c++ SETTERS ARE VOID
    public void setDescription(String description) {
        this.Description = description;
    }

    //////////////////
    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //////////////////
    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    //////////////////
    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    //////////////////
    public String toString() {
        //skeleton
        //return description;
    }

    public boolean occursOn(int year, int month, int day) {
        // this is subject to change this is a skeleton. so false is not
        // the answer
        return false;
    }
}
