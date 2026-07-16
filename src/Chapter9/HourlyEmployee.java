package Chapter9;

public class HourlyEmployee extends Employee{
    private double hour;
    private double hourlyWage;
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hour, double hourlyWage){
        super(firstName, lastName, socialSecurityNumber);
        if (hour<0||hour>168){
            throw new IllegalArgumentException("Hour should be > 0.0 and <= 168 hours");
        } this.hour=hour;
        if (hourlyWage<0.0){
            throw new IllegalArgumentException("Hourly wage should be > $0.0");
        }this.hourlyWage=hourlyWage;
    }
    public void setHour(double hour){
        if (hour<0||hour>168){
            throw new IllegalArgumentException("Hour should be > 0.0 and <= 168 hours");
        } this.hour=hour;
    }
    public void setHourlyWage(double hourlyWage){
        if (hourlyWage<0.0){
            throw new IllegalArgumentException("Hourly wage should be > $0.0");
        }this.hourlyWage=hourlyWage;
    }

    public double getHour() {
        return hour;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }
    public double earnings(){
        return getHour()*getHourlyWage();
    }
    public String toString(){
        return String.format("%s%s: %.2f%n%s: %.2f%n%s: %.2f%n", super.toString(),"Hour worked", getHour(),"Hourly wage",getHourlyWage(), "Earnings", earnings() );
    }

}
