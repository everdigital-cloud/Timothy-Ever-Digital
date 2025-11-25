package Chapter5;

public class CalculatingTheValueOfPi {
    public static void main(String[] args) {
        // Print a table that shows the value of π approximated by computing the first 200,000 terms of this
        // series. How many terms do you have to use before you first get a value that begins with 3.14159?

        double numerator=4;
        double denumerator=3;
        double Pi;
        for (int counter=1; counter<=200000;counter++){
            Pi=numerator/denumerator++;
            denumerator+=2;
            System.out.printf("%.2f%n",Pi);
        }

    }
}
