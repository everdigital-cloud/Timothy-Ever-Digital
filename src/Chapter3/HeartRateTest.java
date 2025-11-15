package Chapter3;
import java.util.Scanner;
public class HeartRateTest {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter your last name:         ");
        String lastName = input.nextLine();

        System.out.println("Enter your date of birth:");
        System.out.print("Month: ");
        String month = input.nextLine();

        System.out.print("Day: ");
        String day = input.nextLine();

        System.out.print("Year: ");
        int year = input.nextInt();

        HeartRate heart = new HeartRate(firstName, lastName, month, day, year);

        System.out.printf("%s%n%s%n%s%n%s%n%d%n%d%n%.2f%n%.2f %.2f%n", heart.getFirstName(), heart.getLastName(),
                heart.getMonth(),heart.getDay(),heart.getYear(), heart.age(), heart.maxHeartRate(), heart.lowerTargetHeartRate(), heart.upperTargetHeartRate());

    }
}
