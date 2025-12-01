package Chapter6;
import java.util.Scanner;
public class ParkingCharges {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        /*
        (Parking Charges) A parking garage charges a $2.00 minimum fee to park for up to three
 hours. The garage charges an additional $0.50 per hour for each hour or part thereof in excess of three
 hours. The maximum charge for any given 24-hour period is $10.00. Assume that no car parks for
 longer than 24 hours at a time. Write an application that calculates and displays the parking charges
 for each customer who parked in the garage yesterday. You should enter the hours parked for each
 customer. The program should display the charge for the current customer and should calculate and
 display the running total of yesterday’s receipts. It should use the method calculateCharges to de
termine the charge for each customer.
         */
        System.out.println("Enter parking hour: ");
        int hour= input.nextInt();
        System.out.println("The garage parking charges is $"+calculateCharges(hour));
    }
    private static double calculateCharges(int hour){
        double charges=0;
        if (hour<=3&&hour>0) {
            charges = 2;
            }

            if (hour >= 3 && hour <= 24) {
                charges = (hour - 3) * 0.5 + 2;
                if (charges > 10) {
                    charges = 10;
                }
            }
                if (hour>24){
                    System.err.println("The maximum park hour is 24 hours");

            }

        return charges;
    }
}
