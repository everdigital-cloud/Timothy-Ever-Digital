package Chapter6;
import java.security.SecureRandom;
import java.util.Scanner;
public class CoinTossing {
/*
(Coin Tossing) Write an application that simulates coin tossing. Let the program toss a coin
each time the user chooses the “Toss Coin” menu option. Count the number of times each side of
the coin appears. Display the results. The program should call a separate method flip that takes no
arguments and returns a value from a Coin enum (HEADS and TAILS). [Note: If the program realistically
simulates coin tossing, each side of the coin should appear approximately half the time.]
 */
    private static final SecureRandom randomNumbers = new SecureRandom();
    private enum Coin {HEADS,TAILS};

    private static final int HEADS=1;
    private static final int TAILS=2;

    public static int tossCoin() {
        int t=0;
        int h=0;
        int coin = 1 + randomNumbers.nextInt(2);
        if (coin==1){
            return h;
        }else {
            return t;
        }
    }

    public static void main(String[] args) {
        menu();
    }


    private static void menu() {
        Scanner input=new Scanner(System.in);
        System.out.println("""
                Menu options:
                1. Toss coin.
                2. Exit.
                """);
        while (input.nextInt()==1){
                tossCoin();
                menu();
        }
    }
}

