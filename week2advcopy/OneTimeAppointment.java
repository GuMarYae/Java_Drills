package week2advcopy;

public class OneTimeAppointment extends Appointment {
    private String atTime;
    String title;

    public OneTimeAppointment(int year, int month, int day, String atTime, String title, String description) {
        // like the book said, make sure super is before anything
        super(year, month, day, description);
        //System.out.println("Onetime appointment called");
        // TODO Auto-generated constructor stub
        this.atTime = atTime;
        this.title = title;

    }

    public String getAtTime() {
        return atTime;
    }

    public void setAtTime(String atTime) {
        this.atTime = atTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString() {
        return "One Time Appointment:" +
                "  Time: " + getAtTime() +
                ", title: " + getTitle() + "\"" +
                ", year: " + getYear() +
                ", month: " + getMonth() +
                ", day: " + getDay() +
                ", description:" + getDescription() + "\"" +
                ".";
    }

    // might have to use this tooo
    public boolean occursOn(String atTime, String title) {
        if (this.atTime == atTime && this.title == title) {

            return true;
        } else

        {

            return false;
        }

    }
}
