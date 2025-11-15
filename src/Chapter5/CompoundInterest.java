package Chapter5;

public class CompoundInterest {
    public static void main(String[] args) {
        //Modify the compound-interest application of
        // Fig.5.6 to repeat its steps for interest rates of 5%, 6%, 7%, 8%, 9% and 10%. Use a for loop to
        // vary the interest rate.
        double principal = 1000.0;
        double rate = 0.05;
        System.out.printf("  %s         %20s%n", "Year", "Amount on deposit");
        for (int year=1; rate<=1; rate += 0.01){
            for (year = 1; year <= 10; ++year) {
                double amount = principal * Math.pow(1.0 + rate, year);
                System.out.printf("%4d%,20.2f", year, amount);
                System.out.print("    ");
                System.out.println();
            }
            System.out.println();

        }

    }
}
