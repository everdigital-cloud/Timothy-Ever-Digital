package Chapter6;
import java.util.Scanner;
public class DisplayingASquareOfAsterisks {
    public static void main(String[] args) {
        /*
         (Displaying a Square of Asterisks) Write a method squareOfAsterisks that displays a solid
 square (the same number of rows and columns) of asterisks whose side is specified in integer param
eter side. For example, if side is 4, the method should display... Incorporate this method into an application that reads an integer value for side from the user and
 outputs the asterisks with the squareOfAsterisks method.
         */
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size= input.nextInt();
        squareOfAsterisks(size);

    }
    private static void squareOfAsterisks(int size){
        for (int counter=1;counter<=size*size;counter++){
            System.out.print("*  ");
            if (counter%size==0){
                System.out.println();
            }
        }
    }
}
