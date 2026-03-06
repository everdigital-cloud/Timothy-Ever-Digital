package Chapter7;
import java.util.Arrays;
import java.util.Scanner;
import java.security.SecureRandom;
public class ArcheryGame {
    public static void main(String[] args) {
        /*
        (Archery Game) A group of four friends visit a sports club and they decide to practice ar
chery. Each player gets 3 chances and in every chance they can score between 0 to 10 points. The
player with the maximum score after adding the scores obtained in all 3 chances wins. Write an ap
plication that simulates this game and prints the scores of all four players in a tabular format and
also prints which player won.
Each line in the table should contain the following:
1) The player number
2) Their first chance score
3) Their second chance score
4) Their third chance score
5) Their score after all three chances
Use multidimensional arrays to store the scores of players in each chance.
Use the secure random-number generation mechanism learnt in the previous chapter to generate
scores between 0 and 10 for each player chance.
         */
        Scanner input = new Scanner(System.in);
        SecureRandom random = new SecureRandom();

            int [][] scores=new int[4][3];
            for (int row=0;row< scores.length;row++){
                for (int col=0;col<scores[row].length;col++){
                    scores[row][col]=random.nextInt(11);
                }
            }

        System.out.prinf("%-20s%-10s%-10s%-10s", "Score1","Score2","Score3","Total");
        int winner=0;
        int maximumScore=0;
        for (int row=0;row<scores.length;row++){
                int totoal=0;

                System.out.print("Player"+(row+1)+" :");
                for (int col=0;col<scores[row].length;col++){
                    System.out.printf("%-10d",scores[row][col]);
                    totoal+=scores[row][col];
                }
                System.out.println(totoal);
                if (totoal>maximumScore){
                    maximumScore=totoal;

                    winner=row+1;
                }
            }
        System.out.println("The winner is "+"player"+winner+" with "+maximumScore+" Scores");

    }
}
