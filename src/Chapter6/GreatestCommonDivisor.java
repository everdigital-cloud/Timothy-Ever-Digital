package Chapter6;
import java.util.Scanner;
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        /*
        (Greatest Common Divisor) The greatest common divisor (GCD) of two integers is the largest
integer that evenly divides each of the two numbers. Write a method gcd that returns the greatest
common divisor of two integers. [Hint: You might want to use Euclid’s algorithm. You can find
information about it at en.wikipedia.org/wiki/Euclidean_algorithm.] Incorporate the method
into an application that reads two values from the user and displays the result.
         */

        gcd(144,180);
        //if (gcd(number1,number2)==1) {
            //System.out.println( number1 * number2);
       // }
    }
    private static int gcd(int number1,int number2) {
       while (number1!=number2){
           if (number1>number2){
               number1=number1-number2;

           }else {
               number2=number2-number1;
           }
       }
        System.out.println("The greatest Common Divisor is "+number1);
        return number1;
    }
}
