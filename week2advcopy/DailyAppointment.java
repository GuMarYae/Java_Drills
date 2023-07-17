package week2advcopy;

public class DailyAppointment extends Appointment {
    private String dayOfWeek;
    private char important;
    private String isImportant;

    public DailyAppointment(int year, int month, int day, String dayOfWeek, char important, String description) {
        super(year, month, day, description);
        this.dayOfWeek = dayOfWeek;
        this.important = important;
    }

    //////////////////////////////////
    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    //////////////////////////////////
    public char getImportant() {
        return this.important;
    }

    public void setImportant(char important) {
        this.important = important;
    }

    //////////////////////////////////

    // public String getIsImportant() {
    // return this.isImportant;
    // }
    // literally 1 hour before realizing that i need to modifying the getter
    public String getIsImportant() {
        if (this.important == 'y') {
            return "Important";
        } else {
            return "Not a Priority";
        }
    }

    // not deleting this.. somehow this will work when class is finished
    // public String setIsImportant() {
    // if (this.important == 'y') {
    // this.isImportant = "Important";
    // } else {
    // this.isImportant = "Not a Priority";

    // }
    // return this.isImportant;
    // }

    // this might not be necessary but im keeping it. I like it
    // it looks pointless because of the setter

    // public boolean isImportant(boolean important) {
    // setImportant(important);
    // if (important = true) {
    // return true;
    // } else
    // return false;
    // }

    //////////////////////////////////
    public String toString() {
        return "Daily Appointment:" +
                "  Day of Week: " + getDayOfWeek() +
                ", Year: " + getYear() +
                ", Month: " + getMonth() +
                ", Day: " + getDay() + ", Important: " +
                getIsImportant() +
                ", Description: '" + getDescription();
    }

    public boolean occursOn(int year, int month, int day) {
        if (this.getYear() == year && this.getMonth() == month && this.getDay() == day) {
            return true;
        } else {
            return false;
        }
    }
}