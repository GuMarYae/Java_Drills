package week2advcopy;

public class MonthlyAppointment extends Appointment {
    private int dayOfMonth;

    // constructor
    public MonthlyAppointment(int year, int month, int day, int dayOfMonth, String description) {
        super(year, month, day, description);
        this.dayOfMonth = dayOfMonth;
    }

    // getter and setter for Monthly appointment
    public int getDayOfMonth() {
        return dayOfMonth;
    }

    public void setDayOfMonth(int dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    //sheesh

    // public String toString() {
    //     return "Appointment:  " +
    //             "Year: " + getYear() +
    //             ", Month: " + getMonth() +
    //             ", day: " + getDay() +
    //             ", description: " + getDescription() + "\"";
    // }
    // I thought i was doing the override the whole time until now smh

    public boolean occursOn(int year, int month, int day) {
        return (day == dayOfMonth && super.getYear() == year && super.getMonth() == month);
    }

    public String toString() {
        return super.toString() + ", day of month: " + dayOfMonth;
    }
}