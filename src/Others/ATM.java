package Others;

import java.security.SecureRandom;
import java.util.Objects;
import java.util.Scanner;

public class ATM {
    Scanner input=new Scanner(System.in);
    public String accountName;
    public String accountNumber;
    public double balance;
    private String password;

    public ATM(String accountName,String accountNumber,double balance,String password){
//        this.accountName=accountName;
//        this.accountNumber=accountNumber;
//        this.balance=balance;
//        this.password=password;
    }
public void setAccountName(){
    System.out.print("Enter your account name: ");
   // String accountName=input.next();
}

    public String getAccountName(){
        return accountName;
    }

    public String getAccountNumber(){
        if (accountNumber.length()==10){
            return accountNumber;
        }else {
            System.err.println("Invalid number!");
        }
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(){
        System.out.print("Enter amount to deposit: ");
        double depositAmount=input.nextDouble();
        balance+=depositAmount;
    }

    public void withdraw(){
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount=input.nextDouble();
        if (withdrawAmount>balance){
            System.err.println("Insuficient balance!");
        }else {
            balance -= withdrawAmount;
        }
    }
    public void transfer(){
        System.out.print("Enter amount to transfer: ");
        double transferAmount=input.nextDouble();
        if (transferAmount<=balance){
            balance-=transferAmount;
        }else {
            System.err.println("Insufficient balance!");
        }

    }
    public void setPassword(){
        System.out.print("Set a strong password for your account: ");
        String password=input.next();
        while (password.length()<5){
            System.err.println("Your password is week!");
            password=input.next();
        }
    }
    public void menu(){

        int menuOption;
        do {
            System.out.println("""
                ***WELCOME TO EVER BANK***
                Menu:   1. Sign up
                        2. Login
                        3. Forget Password
                        4. Deposit
                        5. Withdraw
                        6. Transfer
                        7. Buy Airtime
                        8. exit
               
                """);
            menuOption = input.nextInt();
            switch (menuOption) {
                case 1:
                    signUp();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    resetPassword();
                    break;
                case 4:
                    deposit();
                    break;
                case 5:
                    withdraw();
                    break;
                case 6:
                    transfer();
                    break;
                case 7:
                    airtime();
                    break;
                case 8:
                    exit();
                    break;
            }
        } while (menuOption!=8);

    }
    public void signUp(){
        System.out.print("""
                ****************HELLO! WELCOME TO EVER BANK*****************
                SIGN UP OR LOGIN
              Enter your firstName: """);
        String firstName= input.next();
        System.out.print("Surname: ");
        String surname=input.next();
        System.out.print("Other name: ");
        String otherName=input.next();
        System.out.print("Enter your phone number: ");
        String phoneNumbber=input.next();
        String accountNumber=phoneNumbber.substring(1);
        System.out.println("Set your password(not less than 8 characters): ");
        password=input.next();
    }
    public void login(){
        System.out.println("Enter your account number: ");
        String loginAccountNumber=input.next();
        System.out.println("Enter your password: ");
        String loginPassword=input.next();
        if (Objects.equals(loginPassword, password) && Objects.equals(loginAccountNumber, accountNumber)){
            System.out.println("Login Successful!");
        }else {
            System.err.println("Incorrect credentials");
        }
    }
    public void resetPassword(){
        System.out.println("Enter your phone number: ");
        SecureRandom random=new SecureRandom();
        int otp= random.nextInt(4);
        System.out.println("Enter "+otp+" to reset your password:");
        int otpInput=input.nextInt();

        if (otpInput==otp){
            System.out.println("Enter a new password(not less than 8 characters): ");
            String newPassword=input.next();
            if (newPassword.length()>=8) {
                password = newPassword;
                System.out.println("Password reset successfully");
            }else {
                System.err.println("Password too short");
            }
        }
        while (otpInput!=otp){
            System.err.println("Error! try again");
            otpInput=input.nextInt();
        }

    }
    public void airtime(){
        System.out.println("Phone number: ");
        String airtimePhoneNumber=input.next();
        System.out.println("Amount: ");
        double airtimeAmount=input.nextDouble();
        if (airtimeAmount>balance){
            System.err.println("Insufficient balance!");
            System.out.println("Your balance is "+balance);
        }if (airtimeAmount<0){
            System.err.println("Invalid amount");
        }else {
            balance-=airtimeAmount;
            System.out.println("***successful***");
            System.out.println("Your balance is "+balance);

        }
    }
    public void exit(){
        System.out.println("Thamks!");
    }
}
