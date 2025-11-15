package Chapter5;
import java.util.Scanner;
public class BarChatPrintingProgramme {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       // (Bar-Chart Printing Program) One interesting application of computers is to display
        // graphs and bar charts. Write an application that reads five numbers between 1 and 30. For each
        // number that’s read, your program should display the same number of adjacent asterisks. For exam
        //ple, if your program reads the number 7, it should display *******. Display the bars of asterisks after
        // you read all five numbers.

        System.out.println("Enter five integers between 1 and 30");
        int a= input.nextInt();
        System.out.print("Enter the second integer:");
        int b= input.nextInt();
        System.out.print("Enter the third integer:");
        int c= input.nextInt();
        System.out.print("Enter the fourth integer:");
        int d= input.nextInt();
        System.out.print("Enter the fifth integer:");
        int e= input.nextInt();
        if (a>30||b>30||c>30||d>30||e>30){
            System.err.println("Integer entered exceed 30. Enter integers between 1 and 30");
             a= input.nextInt();
            System.out.print("Enter the second integer:");
             b= input.nextInt();
            System.out.print("Enter the third integer:");
             c= input.nextInt();
            System.out.print("Enter the fourth integer:");
             d= input.nextInt();
            System.out.print("Enter the fifth integer:");
             e= input.nextInt();

        }
        System.out.println("""
                
                
                """);

        int counter=1;
        System.out.printf("%2d: ", a);
        while (counter<=a){

            System.out.print("* ");
            counter++;
        }
        System.out.println();

        counter=1;
        System.out.printf("%2d: ", b);
        while (counter<=b){

            System.out.print("* ");
            counter++;
        }
        System.out.println();

        counter=1;
        System.out.printf("%2d: ", c);
        while (counter<=c){

            System.out.print("* ");
            counter++;
        }
        System.out.println();

        counter=1;
        System.out.printf("%2d: ", d);
        while (counter<=d){

            System.out.print("* ");
            counter++;
        }
        System.out.println();

        counter=1;
        System.out.printf("%2d: ", e);
        while (counter<=e){

            System.out.print("* ");
            counter++;
        }
        System.out.println();

    }
}
