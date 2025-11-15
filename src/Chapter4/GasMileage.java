package Chapter4;
import java.util.Scanner;
public class GasMileage {
    public static void main(String[] args) {
        // Creating Gas mileage Application

        // Prompt the user to enter mile
        // Prompt the user to enter gallon

        //While the user has not yet entered the sentinel
        //Calculate miles per gallon
        //Prompt the user to enter the next mile and gallon or sentinel

        //Calculate total mile per gallon

        Scanner input = new Scanner(System.in);

        int mile;
        int gallon;
        double mpg;
        int totalMile=0;
        int totalGallon=0;

        System.out.println("Enter mile covered or -1 to quit:" );
        mile = input.nextInt();

        while(mile !=-1){
System.out.println("Enter amount of gallon used or:");
gallon = input.nextInt();

mpg=(double)mile/(double)gallon;
totalMile+=mile;
totalGallon+=gallon;

System.out.printf("Mile per gallon  (mpg): %.2f%n", mpg);

System.out.println("Enter another mile covered or -1 to quit:");
mile=input.nextInt();

        }
        double totalMpg=(double)totalMile/(double)totalGallon;
        if (totalMpg!=0){
            System.out.printf("Overall mile per gallon (mpg): %.2f%n", totalMpg);
        } else{
            System.out.println("No trip recorded");
        }

    }
}
