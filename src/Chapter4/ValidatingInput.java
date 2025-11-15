package Chapter4;
import java.util.Scanner;
public class ValidatingInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter number 1 0r 2: ");
        int number = input.nextInt();
        while (number != 1 && number != 2) {

            System.out.println("Enter a number (1 0r 2): ");
            number = input.nextInt();
        }

            if (number == 1 && number == 2) {
                System.out.println("Invalid input!!!");

            } else {

                System.out.println("Correct!!!");
                System.out.println("Enter a number (1 0r 2): ");
                number = input.nextInt();
            }

    }
}
