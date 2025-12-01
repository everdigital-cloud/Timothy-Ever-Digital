package Chapter6;
import java.util.Scanner;
public class RoundingNumbers2 {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);

        System.out.println("Enter a decimal number: ");
        double number= input.nextDouble();

        System.out.printf("The rounded value of %f to the nearest integer is %f%n", number, roundToInteger(number));
        System.out.printf("The rounded value of %f to tenths is %f%n", number, roundToTenths(number));
        System.out.printf("The rounded value of %f to tenths is %f%n", number, roundToHundreds(number));
        System.out.printf("The rounded value of %f to tenths is %f%n", number, roundToThousands(number));
    }
    public static double roundToInteger(double number){
        return Math.floor(number);
    }
    public static double roundToTenths(double number){
        return Math.floor(number*10+0.5)/10;
    }
    public static double roundToHundreds(double number){
        return Math.floor(number*100+0.5)/100;
    }


    public static double roundToThousands(double number){
        return Math.floor(number*1000+0.5)/1000;
    }
}
