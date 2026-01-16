package Chapter5;
import java.util.Scanner;
public class TemperatureConversion {
    public static void main(String[] args) {
        /*
        (Temperature Conversions) Implement the following integer methods:
 a) Method Kelvin returns the Kelvin equivalent of a Celsius temperature, using the calcu
lation
 Kelvin = Celsius + 273.15;
 b) Method Celsius returns the Celsius equivalent of a Kelvin temperature, using the cal
culation
 Celsius = Kelvin - 273.15;
 c) Use the methods from parts (a) and (b) to write an application that enables the user to
 enter a Kelvin temperature and display the Celsius equivalent, or, to enter a Celsius
 temperature and display the Kelvin equivalent.
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a Celsius temperature: ");
        int temperature=input.nextInt();

        System.out.println(temperature+"`C = "+ kelvin(temperature)+ "`K");
        //System.out.println(celsius(temperature)+"`C");
    }
    private static double kelvin(int temperature){
        double kelvin=temperature+273.15;
        return kelvin;
    }

    private static double celsius(int temperature){
        double celsius=temperature;
        return celsius;
    }
}