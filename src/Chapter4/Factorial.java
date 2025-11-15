package Chapter4;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter an integer to find its factorial:");
            int number = input.nextInt();
            int fact = 1;
            int counter = number;

            while (counter > 0) {
                fact = fact * counter;
                counter--;

            }
            System.out.printf("Factorial= %d%n", fact);
        }
}