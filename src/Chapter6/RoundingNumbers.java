package Chapter6;
import java.util.Scanner;
public class RoundingNumbers {
    public static void main(String[] args) {
Scanner input=new Scanner(System.in);
        /*
        Write an application that reads double values and uses the preceding statement to round each of the numbers to the nearest
 integer. For each number processed, display both the original number and the rounded number.
         */
        System.out.println("Enter a decimal number");
        double number= input.nextDouble();

        System.out.printf("The rounded value of %f is %f", number, Math.floor(number));
    }
}
