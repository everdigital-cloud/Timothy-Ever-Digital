package Chapter4;
import java.util.Scanner;
public class TaxCalculator {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

//        (Tax Calculator)  Develop a Java application that determines the total tax for each of three
//        citizens. The tax rate is 15% for earnings up to 30,000 USD earned by each citizen and 20% for all
//        earnings in excess of that ceiling. You are given a list with the citizens’ names and their earnings in
//        a given year. Your program should input this information for each citizen, then determine and dis
//        play the citizen’s total tax. Use class Scanner to input the data.

        double earning;
        double taxOfEarningUpToThirtyThousand=0;
        double taxAboveThirtyThousand=0;
        double totalTax;


        System.out.println("Enter earning or -1 to quit: ");
        earning=input.nextDouble();

        while(earning!=-1){
            if (earning <= 30_000) {
                taxOfEarningUpToThirtyThousand = +earning;
            } else {
                taxAboveThirtyThousand = +earning;
            }

            System.out.println("Enter another earning or -1 to quit: ");
            earning=input.nextDouble();
        }
        totalTax=(taxOfEarningUpToThirtyThousand*15/100)+(taxAboveThirtyThousand*20/100);
        if(totalTax<=0){
            System.out.println("No data found");
        }else {
            System.out.printf("Citizen's total tax: %.2f", totalTax);
        }

    }

}
