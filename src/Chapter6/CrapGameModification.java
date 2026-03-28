package Chapter6;
import java.security.SecureRandom;
import java.util.Scanner;

public class CrapGameModification {

    // create secure random number generator for use in method rollDice

    private static final SecureRandom randomNumbers = new SecureRandom();

    // enum type with constants that represent the game status
    private enum Status {CONTINUE, WON, LOST}

    ;
    // constants that represent common rolls of the dice
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;
    // plays one game of craps


    public static void main(String[] args) throws InterruptedException {
        /*
        Modify the craps program of Fig. 6.8 to allow wagering. Ini
tialize variable bankBalance to 1000 dollars. Prompt the player to enter a wager. Check that wager
is less than or equal to bankBalance, and if it’s not, have the user reenter wager until a valid wager
is entered. Then, run one game of craps. If the player wins, increase bankBalance by wager and dis
play the new bankBalance. If the player loses, decrease bankBalance by wager, display the new bank
Balance, check whether bankBalance has become zero and, if so, display the message "Sorry. You
busted!" As the game progresses, display various messages to create some “chatter,” such as "Oh,
you're going for broke, huh?" or "Aw c'mon, take a chance!" or "You're up big. Now's the time to
cash in your chips!". Implement the “chatter” as a separate method that randomly chooses the
string to display.
         */
        int bankBalance = 1_000;
        while (bankBalance != 0) {

            System.out.println("Enter a wager:");
            Scanner input = new Scanner(System.in);
            int wager = input.nextInt();
            while (wager > bankBalance) {
                System.err.println("Insufficient balance. Enter a wager again:");
                wager = input.nextInt();
            }

            int myPoint = 0; // point if no win or loss on first roll
            Status gameStatus; // can contain CONTINUE, WON or LOST
            int sumOfDice = rollDice(); // first roll of the dice
            // determine game status and point based on first roll
            switch (sumOfDice) {
                case SEVEN: // win with 7 on first roll
                case YO_LEVEN: // win with 11 on first roll
                    gameStatus = Status.WON;
                    break;
                case SNAKE_EYES: // lose with 2 on first roll
                case TREY: // lose with 3 on first roll
                case BOX_CARS: // lose with 12 on first roll
                    gameStatus = Status.LOST;
                    break;
                default: // did not win or lose, so remember point
                    gameStatus = Status.CONTINUE; // game is not over
                    myPoint = sumOfDice; // remember the point
                    System.out.printf("Point is %d%n", myPoint);
                    break;

            }
            // while game is not complete
            while (gameStatus == Status.CONTINUE) {
                sumOfDice = rollDice(); // roll dice again
                // determine game status
                if (sumOfDice == myPoint) { // win by making point
                    gameStatus = Status.WON;
                } else {
                    if (sumOfDice == SEVEN) { // lose by rolling 7 before point
                        gameStatus = Status.LOST;
                    }
                }
            }
            // display won or lost message


            if (gameStatus == Status.WON) {
                System.out.println("Player wins");
                bankBalance += wager;
                System.out.println("Your new balance is $" + bankBalance);
                chatter();

            } else {

                System.out.println("Player loses");
                bankBalance -= wager;
                System.out.println("Your new balance is $" + bankBalance);
                chatter();

            }
            if (bankBalance == 0) {
                System.out.println("Sorry, you busted!");
            }
        }
    }

    // roll dice, calculate sum and display results
    public static int rollDice() throws InterruptedException {
              // pick random die values
         int die1 = 1 + randomNumbers.nextInt(6); // first die roll
         int die2 = 1 + randomNumbers.nextInt(6); // second die roll

         int sum = die1 + die2; // sum of die values

              // display results of this roll
      //  waiting();
         System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
        return sum;
    }
    private static void waiting() throws InterruptedException {
        int i=1;
        while (i<=3){
            Thread.sleep(1500);
            System.out.print(". ");
            i++;
        }
        System.out.println();
    }

    private static void chatter(){
        int random= 1+randomNumbers.nextInt(3);
        switch (random){
            case 1:
                System.out.println("Oh,you're going for broke, huh?");break;
            case 2:
                System.out.println("Aw c'mon, take a chance!");break;
            case 3:
                System.out.println( "You're up big. Now's the time to cash in your chips!");break;
        }

    }
}