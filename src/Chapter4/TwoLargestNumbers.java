package Chapter4;
import java.util.Scanner;
public class TwoLargestNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int counter=0;
        int numbers;
        int largestNumber=0;
        int secondLargestNumber = 0;



        while (counter < 10) {
            System.out.println("Enter a number: ");
            numbers = input.nextInt();

            if (numbers > largestNumber) {
                secondLargestNumber = largestNumber;
                largestNumber = numbers;

            }
            counter++;
        }
            System.out.printf("The largest number is: %d%n", largestNumber);
            System.out.printf("The second largest number is: %d%n", secondLargestNumber);

        }
    }



