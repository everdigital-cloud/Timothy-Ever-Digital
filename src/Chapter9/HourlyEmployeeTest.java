package Chapter9;

public class HourlyEmployeeTest {
    public static void main(String[] args) {
        HourlyEmployee employee1=new HourlyEmployee("Jane","Green", "123-45-6789",160,10);
        System.out.println("Hourly-mployee information obtained by get methods:");
        System.out.printf("%s%n%s%n%s%n%s%n%.2f%n%.2f%n", employee1.getFirstName(), employee1.getLastName(),
                employee1.getSocialSecurityNumber(), employee1.getHour(), employee1.getHourlyWage(), employee1.earnings());
        employee1.setHour(10);employee1.setHourlyWage(30);
        System.out.printf("Updated Hourly-employee information obtained by toString: %n%s%n", employee1);
    }
}
