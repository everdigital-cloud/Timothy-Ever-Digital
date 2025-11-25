package Chapter5;
import java.util.Scanner;
public class ModifiedDiamondPrintingProgramme {
    public static void main(String[] args) {


        //(Modified Diamond Printing Program) Modify the application you wrote in Exercise 5.24
        // to read an odd number in the range 1 to 19 to specify the number of rows in the diamond. Your
        // program should then display a diamond of the appropriate size.
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an odd number between 1 to 19:");
        int number = input.nextInt();
        while (number%2==0||number>19) {
            System.err.println("Enter an odd number between 1 to 19:");
             number = input.nextInt();
        }

        int numberOfMiddleLine = number;
        int halfOfMiddleLine = numberOfMiddleLine / 2;
        for (int row = 0; row <= halfOfMiddleLine; row++) {
            int spaces = halfOfMiddleLine - row;
            int asteriks = 2 * row + 1;

            for (int space = 0; space < spaces; space++)
                System.out.print(" ");
            for (int a = 0; a < asteriks; a++)
                System.out.print("*");

            System.out.println();
        }

        for (int row = halfOfMiddleLine - 1; row >= 0; row--) {
            int spaces = halfOfMiddleLine - row;
            int asteriks = 2 * row + 1;

            for (int s = 0; s < spaces; s++)
                System.out.print(" ");
            for (int a = 0; a < asteriks; a++)
                System.out.print("*");
            System.out.println();

        }
    }
}
