package Chapter4;
import java.util.Scanner;
public class CreditLimitCalculator {
    public static void main (String[] args){

        Scanner input=new Scanner(System.in);

//        (Credit Limit Calculator) Develop a Java application that determines whether any of sev
//        eral department-store customers has exceeded the credit limit on a charge account. For each cus
//        tomer, the following facts are available:
//        a) account number
//        b) balance at the beginning of the month
//        c) total of all items charged by the customer this month
//        d) total of all credits applied to the customer’s account this month
//        e) allowed credit limit
//        The program should input all these facts as integers, calculate the new balance (= beginning balance
//                + charges – credits), display the new balance and determine whether the new balance exceeds the
//        customer’s credit limit. For those customers whose credit limit is exceeded, the program should dis
//        play the message "Credit limit exceeded".


        // Creating Credit Limit Calculator

        // Prompt User for account details

        //Initialize balance
        //Determine total amount

        String accountNumber;
        int beginingBalance=500_000;
        int totalCharges;
        int credit;
        int totalCredit;
        int creditLimit=2_000_000;

        System.out.println("Enter your account number:");
        accountNumber=input.nextLine();

        System.out.println("Enter total charges:");
        totalCharges=input.nextInt();
        System.out.println("Enter total credit:");
        totalCredit=input.nextInt();

        int newBalance= beginingBalance+totalCharges-totalCredit;

        if (newBalance<=creditLimit&newBalance<0) {
            System.out.printf("Account %s new balance is %d", accountNumber, newBalance);
        } else{
            System.out.println("Credit limit exceeded");
        }

    }
     
}
