package Chapter6;
import java.util.Scanner;
public class DisplayingTheSquareOfAnyCharacter {
    public static void main(String[] args) {
        /*
         (Displaying a Square of  Any Character) Modify the method created in Exercise 6.18 to
 receive a second parameter of type char called fillCharacter. Form the square using the char pro
vided as an argument. Thus, if side is 5 and fillCharacter is #, the method should display
... Use the following statement (in which input is a Scanner object) to read a character from the user
 at the keyboard:
 // next() returns a String and charAt(0) gets the String's first character
 char fill = input.next().charAt(0);
         */
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size= input.nextInt();
        char fill=input.next().charAt(0);

        squareOfAsterisks(size, fill);

    }
    private static void squareOfAsterisks(int size, char fillCharacter){
        for (int counter=1;counter<=size*size;counter++){
            System.out.print(fillCharacter+"   ");
            if (counter%size==0){
                System.out.println();
            }
        }
    }
}
