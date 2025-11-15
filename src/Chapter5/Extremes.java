package Chapter5;
import java.util.Scanner;
public class Extremes {
    public static void main(String[] args) {
        // Write an application that finds the minimum and maximum amongst several
        // integers and then computes the sum of the two extremes. The user will be prompted to input how
        // many values the application should ask the user to input.
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of input:");
        int numbers= input.nextInt();

        System.out.println("Enter "+numbers+" numbers, I will give you the minimum and " +
                "maximum numbers among them and the sum of the two");
        int counter=3;
        System.out.println("Enter a number:");
        int smallestNumber= input.nextInt();
        System.out.println("Enter the first number:");
        int biggestNumber= input.nextInt();
        while (counter<=numbers){
            System.out.println("Enter the next number:");
           int otherNumbers=input.nextInt();
            if (otherNumbers<smallestNumber){
                smallestNumber=otherNumbers;
            }
            if (otherNumbers>biggestNumber){
                biggestNumber=otherNumbers;
            }
           counter++;
        }
        System.out.printf("Minimum = %d%nMaximum = %d%nSum = %d", smallestNumber,biggestNumber,
                smallestNumber+biggestNumber);

    }
}
