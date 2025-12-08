package Chapter6;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        /*
         (Multiples) Write a method isMultiple that determines, for a pair of integers, whether the
 second integer is a multiple of the first. The method should take two integer arguments and return
 true if the second is a multiple of the first and false otherwise. [Hint: Use the remainder operator.]
 Incorporate this method into an application that inputs a series of pairs of integers (one pair at a
 time) and determines whether the second value in each pair is a multiple of the first.
         */

        Scanner input=new Scanner(System.in);
        System.out.print("Enter the first and the second number separated by space: ");
        int firstNumber= input.nextInt();
        int secondNumber= input.nextInt();
        System.out.println("The second number is a multiple of the first number: "+isMultiple(firstNumber,secondNumber));
    }
    private static boolean isMultiple(int firstNumber, int secondNumber) {
        return secondNumber % firstNumber == 0;
    }
}
