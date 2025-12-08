package Chapter6;

import java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String[] args) {
         /*
    (Divisible by 5) Write a method isDivisible that uses the remainder operator (%) to deter
mine whether ten input integers are divisible by 5 or not. The method should take an integer argu
ment and return true if the integer is divisible by 5 and false otherwise. Incorporate this method
 into an application that inputs a sequence of integers (one at a time) and determines the result.
     */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten integers separated by space: ");
        int firstInteger = input.nextInt();
        int secondInteger = input.nextInt();
        int thirdInteger = input.nextInt();
        int fourthInteger = input.nextInt();
        int fifthInteger = input.nextInt();
        int sixthInteger = input.nextInt();
        int seventhInteger = input.nextInt();
        int eighthInteger = input.nextInt();
        int nighthInteger = input.nextInt();
        int tenthInteger = input.nextInt();
        System.out.println("All the integers are divisible by 5: " + isDivisible(fifthInteger,secondInteger,
                thirdInteger,fourthInteger,fifthInteger,
                sixthInteger,seventhInteger,eighthInteger,nighthInteger,tenthInteger));
    }
    private static boolean isDivisible(int a,int b,int c,int d,int e,int f,int g, int h, int i, int j) {
        return a % 5 == 0&&b%5==0&&c%5==0&&d%5==0&&e%5==0&&f%5==0&&g%5==0&&h%5==0&&i%5==0&&j%5==0;
    }
}
