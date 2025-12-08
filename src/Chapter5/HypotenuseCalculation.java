package Chapter5;
import java.util.Scanner;
public class HypotenuseCalculation {
    public static void main(String[] args) {
        /*
        (Hypotenuse Calculations) Define a method hypotenuse that calculates the hypotenuse of
 a right triangle when the lengths of the other two sides are given. The method should take two ar
guments of type double and return the hypotenuse as a double. Incorporate this method into an
 application that reads values for side1 and side2 and performs the calculation with the hypotenuse
 method. Use Math methods pow and sqrt to determine the length of the hypotenuse for each of the
 triangles in Fig. 6.14. [Note: Class Math also provides method hypot to perform this calculation.]
         */
Scanner input=new Scanner(System.in);
        System.out.print("Enter side 1 and side 2 separated by space: ");
        double side1= input.nextDouble();
        double side2= input.nextDouble();
        System.out.println("Hypotenuse = "+hypotenuse(side1,side2));
    }
    private static double hypotenuse(double a, double b){
        return Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
    }
}
