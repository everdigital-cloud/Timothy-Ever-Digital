package Chapter7;
import java.util.Arrays;
import java.util.Scanner;
public class Knights_Tour {
    public static void main(String[] args) {

            knightPosition(3, 4);


    }

    private static void printmovements(int movementRow, int movementColumn) {
        String[][] knightboard = new String[8][8];
        int position = 0;
            for (int row = 0; row < knightboard.length; row++) {
                for (int column = 0; column < knightboard[row].length; column++) {
                    if (row == movementRow && column == movementColumn) {
                        System.out.print(" " + position + " ");

                    }
                }
            }

    }
    private static void knightPosition(int movementRow, int movementColumn) {
        System.out.println();
        int currentRow=2;
        int currentColumn=6;


        System.out.println();
        String[][] knightboard = new String[8][8];

        for (int row = 0; row < knightboard.length; row++) {
            for (int column = 0; column < knightboard[row].length; column++) {

                if (row == movementRow && column == movementColumn) {
                    System.out.print(" k ");
                } else if (row == currentRow && column == currentColumn) {
                    printmovements(currentRow, currentColumn);
                } else {
                    System.out.print(" , ");
                }

        }
            System.out.println();
        }
        System.out.println("Make a move: ");
        Scanner input=new Scanner(System.in);
        int moveNumber= input.nextInt();

            int newRow=2;
            int newColumn=6;
            knightPosition(newRow,newColumn);

    }
}
