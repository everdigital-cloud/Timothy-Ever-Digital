package Chapter8;
import java.text.NumberFormat;
public class Rational {
    private int numerator;
    private int denominator;
    Rational(){}
    Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }


    public void display(){
        int hfactor=1;
        int numeratorFactor=1;
        for (int factor=1; factor<=numerator; factor++) {
            if (numerator % factor == 0) {
                numeratorFactor = factor;
            }

            int denominatorFactor = 1;
            for (int factor2 = 1; factor2 <=denominator; factor2++) {
                if (denominator % factor2 == 0) {
                    denominatorFactor = factor2;
                }

                if (numeratorFactor == denominatorFactor) {
                    hfactor = numeratorFactor;
                }
            }
        }
        System.out.println(hfactor);
        System.out.printf("%d/%d%n", numerator,denominator);
        System.out.printf("%d/%d%n", (numerator/hfactor),(denominator/hfactor));
    }





    public static void multiply(int a, int b, int c, int d){

        int numerator=a*c;
        int denominator=b*d;
        int hfactor=1;
        int numeratorFactor=1;
        for (int factor=1; factor<=numerator; factor++) {
            if (numerator % factor == 0) {
                numeratorFactor = factor;
            }

            int denominatorFactor = 1;
            for (int factor2 = 1; factor2 <=denominator; factor2++) {
                if (denominator % factor2 == 0) {
                    denominatorFactor = factor2;
                }

                if (numeratorFactor == denominatorFactor) {
                    hfactor = numeratorFactor;
                }
            }
        }

        System.out.printf("%d/%d%n", (numerator/hfactor),(denominator/hfactor));
    }
    public static void divide(int a, int b, int c, int d){

        int numerator=a*d;
        int denominator=b*c;
        int hfactor=1;
        int numeratorFactor=1;
        for (int factor=1; factor<=numerator; factor++) {
            if (numerator % factor == 0) {
                numeratorFactor = factor;
            }

            int denominatorFactor = 1;
            for (int factor2 = 1; factor2 <=denominator; factor2++) {
                if (denominator % factor2 == 0) {
                    denominatorFactor = factor2;
                }

                if (numeratorFactor == denominatorFactor) {
                    hfactor = numeratorFactor;
                }
            }
        }

        System.out.printf("%d/%d%n", (numerator/hfactor),(denominator/hfactor));
    }

}
