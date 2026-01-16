package Chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessTheNumberModification {

    /*
    (Guess-the-Number Modification) Modify the program of Exercise 6.30 to count the num
ber of guesses the player makes. If the number is 10 or fewer, display Either you know the secret
or you got lucky! If the player guesses the number in 10 tries, display Aha! You know the secret!
If the player makes more than 10 guesses, display You should be able to do better! Why should it
take no more than 10 guesses? Well, with each “good guess,” the player should be able to eliminate
half of the numbers, then half of the remaining numbers, and so on.
     */

    public static void main(String[] args) {
        int counter = 1;
        int correct = 0;
        while (counter <= 10) {
            SecureRandom randomNumber = new SecureRandom();
            int random = 1 + randomNumber.nextInt(1_000);
            System.out.println("Guess the number (between 1-1,000)");
            Scanner input = new Scanner(System.in);
            int guessedNumber = input.nextInt();

            int guessCounter = 2;
            while (guessCounter <= 10) {
                if (guessedNumber != random) {
                    System.out.println("Try again");
                    guessedNumber = input.nextInt();

                    if (guessedNumber == random && correct!=10) {
                        System.out.println("You got lucky!");
                        correct++;
                    }


                }

                guessCounter++;
            }
            System.out.println("The number is " + random);
            counter++;
        }
        if (correct>=10) {

            System.out.println("Aha! You know the secret! ");
        }else System.out.println("You should be able to do better!");
        System.out.printf("You got %d/10%n", correct);
    }

}



