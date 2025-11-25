package Chapter4;
import java.util.Scanner;
public class LargetNumber {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

//        (Find the Largest Number) The process of finding the largest value is used frequently in com
//        puter applications. For example, a program that determines the winner of a sales contest would input
//        the number of units sold by each salesperson. The salesperson who sells the most units wins the con
//        test. Write a pseudocode program, then a Java application that inputs a series of 10 integers and deter
//        mines and prints the largest integer. Your program should use at least the following three variables:
//        a) counter: A counter to count to 10 (i.e., to keep track of how many numbers have been
//        input and to determine when all 10 numbers have been processed).
//        b) number: The integer most recently input by the user.
//        c) largest: The largest number found so far.

        // Application to determine the largest number

        //While counter less than 10
        //Prompt user for numbers

        //Determine the largest number

        int counter=1;


        System.out.println("Enter a number: ");
      int  largestNumber=input.nextInt();

        while(counter<10){
            System.out.println("Enter next number: ");
            int number=input.nextInt();

            if (number>largestNumber){
                largestNumber=number;
            }
            counter++;
        }
            System.out.printf("The largest number is: %d", largestNumber);
        }

    }
