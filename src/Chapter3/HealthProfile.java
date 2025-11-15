package Chapter3;

import java.sql.SQLOutput;

public class HealthProfile {
    private String firstName;
    private String lastName;
    private String gender;
    private int monthOfBirth;
    private int dayOfBirth;
    private int yearOfBirth;
    private double height;
    private double weight;

    public HealthProfile(String firstName, String lastName, String gender, int monthOfBirth, int dayOfBirth, int yearOfBirth, double height, double weight){
        this.firstName=firstName;
        this.lastName=lastName;
        this.gender=gender;
        this.monthOfBirth=monthOfBirth;
        this.dayOfBirth=dayOfBirth;
        this.yearOfBirth=yearOfBirth;
        this.height=height;
        this.weight=weight;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName=lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setMonthOfBirth(int monthOfBirth) {

        if(monthOfBirth>0){
            if (monthOfBirth<=12){
                this.monthOfBirth = monthOfBirth;
            }
        }else{
            System.out.println("Invalid month of birth");
        }
    }


    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {

        if(dayOfBirth>0){
            if (dayOfBirth<=31){
                this.dayOfBirth = dayOfBirth;
            }
        }else{
            System.out.println("Invalid day of birth");
        }
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if(yearOfBirth>0){
            if (yearOfBirth<=2025){
                this.yearOfBirth = yearOfBirth;
            }
        }else{
            System.out.println("Invalid year of birth");
        }
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setHeight(double height) {
        if(height>0.0) {
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(double weight) {
        if(weight>0.0) {
            this.weight = weight;
        }
    }

    public double getWeight() {
        return weight;
    }

    public int age(){
        return 2025-yearOfBirth;
    }

    public int maxHeartRate(){
        return 220-age();
    }

    public double lowerTargetHeartRate(){
        return maxHeartRate()*50/100;
    }

    public double upperTargetHeartRate(){
        return maxHeartRate()*85/100;
    }

    public double bodyMassIndex(){
        return weight/height*height;
    }

}
