package Chapter4;
import java.util.Scanner;
public class SalesComissionCalculator {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);

//        Develop a Java application that inputs one salesperson’s items
//        sold for last week and calculates and displays that salesperson’s earnings. There’s no limit to the num
//        ber of items that can be sold

        double itemValue;
        double totalSales=0;

        System.out.println("Enter item value or -1 to quit: ");
        itemValue=input.nextDouble();

        while(itemValue!=-1){
            totalSales+=itemValue;
            System.out.println("Enter another item value or -1 to quit: ");
            itemValue=input.nextDouble();

        }
        double earnings=(totalSales*9/100)+200;
        if (earnings!=0){
            System.out.printf("Total sales: %.2f%nSalesperson's earnings: %.2f", totalSales, earnings );
        }else {
            System.out.print("No record found");
        }





    }
}
