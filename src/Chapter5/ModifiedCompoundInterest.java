package Chapter5;

public class ModifiedCompoundInterest {
    public static void main(String[] args) {

        // 5.18 (Modified Compound-Interest Program) Modify the application in Fig.5.6 to use only in
        //tegers to calculate the compound interest. [Hint: Treat all monetary amounts as integral numbers
        // of pennies. Then break the result into its dollars and cents portions by using the division and re
        //mainder operations, respectively. Insert a period between the dollars and the cents portions.]

        double principal = 1000.0;
        double rate = 0.05;
        System.out.printf("  %s         %20s%n", "Year", "Amount on deposit");
        for (int year=1; rate<=1; rate += 0.01){
            for (year = 1; year <= 10; ++year) {

                double amount = principal * Math.pow(1.0 + rate, year);
                int amountInInteger=(int)amount*100;

                int dollar=amountInInteger/100;
                int cent=amountInInteger%100;
                System.out.printf("%4d                         %d : %02d", year, dollar, cent);

                //System.out.printf("%4d%,20d", year, amountInInteger);
                System.out.print("    ");
                System.out.println();
            }
            System.out.println();

        }
    }
}
