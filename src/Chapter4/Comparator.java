package Chapter4;
import java.util.Scanner;
public class Comparator {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        // (Creating a Comparator) Write an application that works as a comparator. Your program
        // should read two numbers from the user and print 0 if they are equal to each other, 1 if the first
        // number is greater, and –1 if the second number is greater.

        System.out.println("Enter the first number");
        int firstNumber= input.nextInt();
        System.out.println("Enter the second number");
        int secondNumber= input.nextInt();

        if(firstNumber==secondNumber){
            System.out.println("0-(the first number is equal to the second number)");
        }
        if(firstNumber>secondNumber){
            System.out.println("1-(the first number is greater than the second number)");
        }
        if(firstNumber<secondNumber){
            System.out.println("-1-(the second number is greater than the first number)");
        }

    }
}
