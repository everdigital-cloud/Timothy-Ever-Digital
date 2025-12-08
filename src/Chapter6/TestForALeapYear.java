package Chapter6;
import java.util.Scanner;
import java.time.Year;
public class TestForALeapYear {
    public static void main(String[] args) {
        /*
        (Test for Leap Year) Write an application that prompts the user to enter an year and uses a
 method called isLeapYear to check whether it is a leap year.
         */
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year= input.nextInt();
        boolean yearTest= Year.isLeap(year);
        //System.out.println(yearTest);
        if (yearTest==true) {
            System.out.println("Year "+year+" is a leap year");
        }else {
            System.out.println("Year "+year+" is not a leap year");
        }
    }
}
