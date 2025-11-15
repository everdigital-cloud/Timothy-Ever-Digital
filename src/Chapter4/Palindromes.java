package Chapter4;
import java.util.Scanner;
public class Palindromes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        (Palindromes) A palindrome is a sequence of characters that reads the same backward as for
//        ward. For example, each of the following five-digit integers is a palindrome: 12321, 55555, 45554
//        and 11611. Write an application that reads in a five-digit integer and determines whether it’s a pal
//        indrome. If the number is not five digits long, display an error message and allow the user to enter
//        a new value.
      /*  System.out.println("Enter a five digit number: ");
        int digit = input.nextInt();
        int firstValidator = (digit - (digit % 10000)) / 10000;
//        System.out.print(firstValidator);
        int secondValidator = 10;


        if (firstValidator >= secondValidator) {
            System.err.println("Invalid input!!! Enter a five digit number");
            digit = input.nextInt();
        } */
        System.out.println("Enter a 5-digit number: ");
        int digit=input.nextInt();
        while (digit<10000||digit>=99999){
            System.err.println("Invalid");
            System.out.println("Enter a 5-digit number: ");
            digit= input.nextInt();

        }

        int firstDigit = digit / 10000;
        int b = digit - ((digit / 10000) * 10000);
        int secondDigit = b / 1000;
        int c = b - (secondDigit * 1000);
        int thirdDigit = (c - (c % 100)) / 100;
        int d = digit % 100;
        int forthDigit = d / 10;
        int fifthDigit = digit % 10;

//            System.out.println(firstDigit);
//            System.out.println(secondDigit);
//            System.out.println(thirdDigit);
//            System.out.println(forthDigit);
//            System.out.println(fifthDigit);

        if (firstDigit == fifthDigit && secondDigit == forthDigit) {
            System.out.println("Correct!!! The number is a palindrome");
        } else {
            System.err.print("The number is not a palindrome!!!");
        }
    }
}




