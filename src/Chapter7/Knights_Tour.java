package Chapter7;
import java.util.Arrays;
import java.util.Scanner;
public class Knights_Tour {
    public static void main(String[] args) {
        knightMovement();
    }
    private static void knightMovement() {
        Scanner input=new Scanner(System.in);
        System.out.println("WELCOME TO KNIGHTS TOUR");
        System.out.println("Enter your name: ");
        String name=input.next();
        char knightName=name.charAt(0);
        System.out.println("The first letter of our name represent your name");


        int knightRow = 4;
        int knightColumn = 4;
        for (int counter=0;counter<64;counter++) {
            //int[][] knightBoard = new int[8][8];
            int[][] knight = new int[8][8];
            for (int row = 0; row < knight.length; row++) {
                for (int column = 0; column < knight[row].length; column++) {
                    int position = 0;

                    while (position <= 8) {
                        int movementRow = knightRow;
                        int movementColumn = knightColumn;
                        switch (position) {
                            case 1: movementRow = movementRow - 1;movementColumn = movementColumn + 2;break;
                            case 2: movementRow = movementRow - 2;movementColumn = movementColumn + 1;break;
                            case 3: movementRow = movementRow - 2;movementColumn = movementColumn - 1;break;
                            case 4: movementRow = movementRow - 1;movementColumn = movementColumn - 2;break;
                            case 5: movementRow = movementRow + 1;movementColumn = movementColumn - 2;break;
                            case 6: movementRow = movementRow + 2;movementColumn = movementColumn - 1;break;
                            case 7: movementRow = movementRow + 2;movementColumn = movementColumn + 1;break;
                            case 8: movementRow = movementRow + 1;movementColumn = movementColumn + 2;break;
                        }
                        if (row == movementRow && column == movementColumn) {
                            knight[row][column] = position;
                        }
                        position++;
                    }
                }
            }
            for (int row = 0; row < knight.length; row++) {
                for (int column = 0; column < knight[row].length; column++) {
                    if (row == knightRow && column == knightColumn) {
                        System.out.print(" "+knightName+" ");
                    } else if (knight[row][column] == 0) {
                        System.out.print(" , ");
                    } else {
                        System.out.print(" " + (knight[row][column]) + " ");
                    }
                }
                System.out.println();
            }

            System.out.print("Make a move: ");
            //Scanner input = new Scanner(System.in);
            int move = input.nextInt();
             switch (move){
                 case 1:knightRow=knightRow-1;knightColumn=knightColumn+2;break;
                 case 2:knightRow=knightRow-2;knightColumn=knightColumn+1;break;
                 case 3:knightRow=knightRow-2;knightColumn=knightColumn-1;break;
                 case 4:knightRow=knightRow-1;knightColumn=knightColumn-2;break;
                 case 5:knightRow=knightRow+1;knightColumn=knightColumn-2;break;
                 case 6:knightRow=knightRow+2;knightColumn=knightColumn-1;break;
                 case 7:knightRow=knightRow+2;knightColumn=knightColumn+1;break;
                 case 8:knightRow=knightRow+1;knightColumn=knightColumn+2;break;
                 default:knightRow=3;knightColumn=4;
             }
        }
    }
}
