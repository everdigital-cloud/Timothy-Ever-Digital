package Chapter7;

import java.util.Scanner;
public class Fibonacci_Series {
    public static void main(String[] args) {
/*
a) Write a method fibonacci(n) that calculates the nth Fibonacci number. Incorporate
this method into an application that enables the user to enter the value of n.
 */

        fibonacci_n();
    }

    private static void fibonacci_n(){
        System.out.println("Enter a number: ");
        Scanner input=new Scanner(System.in);
        double n= input.nextDouble();
        double[]array=new double[(int) n];
        array[0]=0;
        array[1]=1;

        for (int counter=2;counter<array.length;counter++){
            array[counter]=array[counter-1]+array[counter-2];
        }
        for (int counter=0;counter<array.length;counter++){
            System.out.print(array[counter]+"  ");
        }

    }
}
