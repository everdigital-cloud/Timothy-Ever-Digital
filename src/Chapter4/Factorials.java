package Chapter4;
import java.util.Scanner;
public class Factorials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

/*

        //n! = n · (n – 1) · (n – 2) · … · 1
        int n=1;

        System.out.println("Enter a positive integer: ");
        n = input.nextInt();
        if (n>=0) {
            n = n;
        }else {

            System.err.println("Enter a positive integer!!!");
            n= input.nextInt();
        }
        int i=1;
        int factorial=1;

        while (i <=n) {
            factorial=factorial*i;
            i++;

        }
        System.out.print("Factorial=" +factorial);


    }
}*/


        //(B)  Write an application that estimates the value of the mathematical constant e by using
        // the following formula. Allow the user to enter the number of terms to calculate;

        /*System.out.println("Enter a number to calculate its mathematical constant (e) : ");
        int numberOfTerms = input.nextInt();
        int fact = 10;
        int i = 1;

        while (i <= numberOfTerms) {

            fact = 1+1 / (fact * i);
            i++;

        }
        System.out.print("e =" + fact);
    }
}*/



        System.out.println("Enter a number to calculate its mathematical constant (e) : ");
        int numberOfTerms= input.nextInt();
        int fact=1;
        int i=1;

        while(i<=numberOfTerms){

            numberOfTerms =(numberOfTerms*numberOfTerms)/(fact*numberOfTerms);
            i++;

        }
        System.out.printf("e = %d%n", numberOfTerms);


    }
}






