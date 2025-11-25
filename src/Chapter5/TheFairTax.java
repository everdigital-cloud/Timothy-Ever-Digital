package Chapter5;

import java.util.Scanner;

public class TheFairTax {
    public static void main(String[] args) {

        //There are many proposals to make taxation fairer.
        // Check out the FairTax initiative in the United States at http://www.fairtax.org. Research how
        // the proposed FairTax works. One suggestion is to eliminate income taxes and most other taxes in
        // favor of a 23% consumption tax on all products and services that you buy. Some FairTax opponents
        // question the 23% figure and say that because of the way the tax is calculated, it would be more ac
        //curate to say the rate is 30%—check this carefully. Write a program that prompts the user to enter
        // expenses in various expense categories they have (e.g., housing, food, clothing, transportation, edu
        //cation, health care, vacations), then prints the estimated FairTax that person would pay

        Scanner input=new Scanner(System.in);

        System.out.println("Enter your various expenses");
        System.out.println("Housing: ");double housing= input.nextDouble();
        System.out.println("Food: ");double food= input.nextDouble();
        System.out.println("Clothing: ");double clothing= input.nextDouble();
        System.out.println("Transportation: ");double transportation= input.nextDouble();
        System.out.println("Education: ");double education= input.nextDouble();
        System.out.println("HealthCare: ");double healthCare= input.nextDouble();
        System.out.println("Vacations: ");double vacation= input.nextDouble();
        double totalExpenses=housing+food+clothing+transportation+education+healthCare+vacation;

        int  amountInInteger=(int)(totalExpenses*100+0.5);
        int dollar=amountInInteger/100;
        int cents=amountInInteger%100;
        System.out.printf("%d:%02d",dollar, cents);

        double fairTax=23*(totalExpenses/100);
        int  taxInInteger=(int)(fairTax*100+0.5);
        int taxdollar=taxInInteger/100;
        int taxcents=taxInInteger%100;
        System.out.printf("%d:%02d",taxdollar, taxcents);


    }
}
