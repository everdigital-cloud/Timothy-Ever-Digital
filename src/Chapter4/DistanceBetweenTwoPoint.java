package Chapter4;
import java.util.Scanner;

public class DistanceBetweenTwoPoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//(Distance between two points) Write an application that reads the x and y coordinates of
// two points on a plane and prints whether the points are located on a line perpendicular to an axis.
        int xFirstCoordinate;
        int xSecondCoordinate;
        int yFirstCoordinate;
        int ySecondCoordinate;

        System.out.println("Enter x coordinates");
        xFirstCoordinate = input.nextInt();
        xSecondCoordinate = input.nextInt();

        System.out.println("Enter y coordinates");
        yFirstCoordinate = input.nextInt();
        ySecondCoordinate = input.nextInt();

        if (yFirstCoordinate < 0 && ySecondCoordinate > 0) {
            System.out.print("The points are located on a line perpendicular to an axis");
        } else {
            if (yFirstCoordinate > 0 && ySecondCoordinate > 0) {
                System.out.print("The points are not located on a line perpendicular to an axis");

            }


        }
    }
}
