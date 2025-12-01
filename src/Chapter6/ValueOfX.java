package Chapter6;

public class ValueOfX {
    public static void main(String[] args) {

        /*6.7 What is the value of x after each of the following statements is executed?
 a) x = Math.abs(-7.5);
 b) x = Math.floor(5 + 2.5);
c) x = Math.abs(9) + Math.ceil(2.2);
d) x = Math.ceil(-5.2);
e) x = Math.abs(-5) + Math.abs(4);
f) x = Math.ceil(-6.4) - Math.floor(5.2);
g) x = Math.ceil(-Math.abs(-3 + Math.floor(-2.5)));*/

        double x=Math.abs(-7.5);System.out.printf("Math.abs(-7.5) = %.1f%n ",x);
        x= Math.floor(5+2.5); System.out.printf("Math.floor(5+2.5) = %.1f%n ",x);
        x= Math.abs(9) + Math.ceil(2.2); System.out.printf("Math.abs(9) + Math.ceil(2.2) = %.1f%n ",x);
        x= Math.ceil(-5.2); System.out.printf("Math.ceil(-5.2) = %.1f%n ",x);
        x= Math.abs(-5) + Math.abs(4); System.out.printf("Math.abs(-5) + Math.abs(4) = %.1f%n ",x);
        x= Math.ceil(-6.4) - Math.floor(5.2); System.out.printf("Math.ceil(-6.4) - Math.floor(5.2) = %.1f%n ",x);
        x= Math.ceil(-Math.abs(-3 + Math.floor(-2.5))); System.out.printf("Math.ceil(-Math.abs(-3 + Math.floor(-2.5))) = %.1f%n ",x);

    }
}
