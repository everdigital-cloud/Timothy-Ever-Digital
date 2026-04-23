package Others;
import java.util.Scanner;

//💳 Java Exercise: Build a Simple ATM App
//🎯 Objective
//Create a console-based ATM simulation that lets users perform simple banking actions using loops and conditionals.
//This project will help you practice:
//- Loops (while, do-while)
//- ⁠Conditionals (if-else, switch)
//- ⁠Working with methods and multiple classes
//- ⁠Input handling with Scanner
//- ⁠Updating variables (like account balance)

//🧩 Description
//
//You are to build a Simple ATM App that behaves like a real ATM, allowing a user to log in, check balance, deposit, and withdraw money.
//
//The app should have a menu system that keeps showing until the user chooses to exit.


public class AtmApp {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String accountName="Awe";
        String accountNumber="0000000000";
        String password="000000000";





        double balance=0.00;
        ATM account1=new ATM(accountName,accountNumber,balance,password);
account1.menu();
    }

}
