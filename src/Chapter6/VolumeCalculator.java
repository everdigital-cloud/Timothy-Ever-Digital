package Chapter6;
import java.util.Scanner;
public class VolumeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*6.6 Declare method sphereVolume to calculate and return the volume of the sphere. Use the
 following statement to calculate the volume:
double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)
 Write a Java application that prompts the user for the double radius of a sphere, calls sphereVolume
 to calculate the volume and displays the result.  */
        System.out.print("Enter the radius: ");
        double radius = input.nextDouble();
        System.out.printf("The volume of the sphere is %.2f%n", sphereVolume(radius));


    }
    private static double sphereVolume(double radius){
       double volume=(4.0/3.0)*Math.PI*Math.pow(radius, 3);
       return volume;
    }
}