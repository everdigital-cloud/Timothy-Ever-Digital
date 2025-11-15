package Chapter3;

public class HeartRate {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String month;
    private String day;
    private int year;
    private int age;
    private double maxHeartRate;
    private double targetHeartRate;

    public HeartRate(String firstName, String lastName, String month, String day, int year) {
this.firstName=firstName;
this.lastName=lastName;
this.month=month;
this.day=day;
this.year=year;
    }
// Setter and getter
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMonth() {
        return month;
    }


    public void setMonth(String month) {
        this.month = month;
    }


    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

// Methods
    public int age() {
        return 2025-year;
    }
    //
    public double maxHeartRate(){return 220-age();}

//
public double lowerTargetHeartRate(){return maxHeartRate()*50/100;}

public double upperTargetHeartRate(){return maxHeartRate()*85/100;}
}