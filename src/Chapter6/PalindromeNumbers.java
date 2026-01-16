package Chapter6;
import java.util.Scanner;
public class PalindromeNumbers {
    public static void main(String[] args) {
        /*
        (Palindrome Numbers) A positive integer is a palindrome if its value is the same after re
versing the order of the digits in the number. For example, 12321 is a palindrome, but 12563 is not.
 Write a method that determines whether a number is a palindrome. Use this method in an applica
tion that determines whether a number entered by the user is a palindrome or not and prints the
 result to the console.
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number to check if it is a palindrome");
        int number= input.nextInt();

        System.out.println(palindrome(number));

    }
    private static boolean palindrome(int number) {
        if (number < 0) {
            return false;
        }
        int originalNumber = number;
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            //System.out.println(digit);
            reversedNumber = reversedNumber * 10 + digit;
            //System.out.println(reversedNumber);
            number /= 10;
           // System.out.println(number);
        }
        return originalNumber == reversedNumber;
    }
}
