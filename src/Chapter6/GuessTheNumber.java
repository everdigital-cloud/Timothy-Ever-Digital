package Chapter6;
import java.util.Scanner;
import java.security.SecureRandom;
public class GuessTheNumber {
    public static void main(String[] args) {
        guess();

    }



    private static void guess() {
        SecureRandom randomNumber = new SecureRandom();
        int random = 1 + randomNumber.nextInt(1000);
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a number between 1-1,000");
        int guessNumber = input.nextInt();

        if (guessNumber == random) {
            System.out.println("Wow");
            System.out.println("The correct number is " + random);
            again();
        }

            if (random <= 500 && guessNumber != random) {
                //System.out.println("too low");
                System.out.println("The correct number is " + random);
            }

            if (guessNumber > 500 && guessNumber != random) {
                System.out.println("Too high");
                System.out.println("The correct number is " + random);
            }


        while (random!=guessNumber) {
            guess();
        }
    }
    private static void again() {
        Scanner input=new Scanner(System.in);
        System.out.println("""
                Would you play again?
                1. Yes
                2. No
                """);

        int menu = input.nextInt();
        if (menu == 1) {
            guess();
        }
        if (menu == 2) {
            System.out.println("Good Bye");
        }
    }
}

