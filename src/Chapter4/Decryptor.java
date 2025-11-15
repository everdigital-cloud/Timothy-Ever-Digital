package Chapter4;
import java.util.Scanner;
public class Decryptor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter the encrypted number: ");
        int number = input.nextInt();

        while (number >= 9999) {
            System.err.println("Invalid");
            System.out.println("Enter a valid encrypted number: ");
            number = input.nextInt();
        }

        int first = number / 1000;
        int second = (number % 1000) / 100;
        int third = (number % 100) / 10;
        int forth = number % 10;

        int firstNumber = (third + 10) - 7;
        int secondNumber = (forth + 10) - 7;
        int thirdNumber = (first + 10) - 7;
        int forthNumber = (second + 10) - 7;

        int originalNumber = (firstNumber * 1000) + (secondNumber * 100) + (thirdNumber * 10) + (forthNumber);
        System.out.printf("Original number is %d%n", originalNumber);


    }
}


