package Chapter4;
import java.util.Scanner;
public class RightAngledTriangle {
    public static void main (String[] args) {

//        (Right-angled Triangle) Write an application that prompts the user to enter the length of
//        the base of a triangle, and uses that to draw a right-angled triangle composed of asterisks. Your
//        program should work for triangles of base lengths between 1 and 10.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number less than or equal to 10: ");
        int triangleBase=input.nextInt();
        if (triangleBase<=10){
        }else{
            System.err.println("Invalid input!!! Enter a number less than or equal to 10 ");
            triangleBase=input.nextInt();
        }
        System.out.println();
        int counter=1;
        while(counter<=triangleBase){
            int length=1;
            while (length<=counter){
                System.out.print("*");
                length++;
            }
            System.out.println();
            counter++;
        }

        }
    }


