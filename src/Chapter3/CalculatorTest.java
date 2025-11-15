package Chapter3;
import java.util.Scanner;
public class CalculatorTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Calculator calculator1=new Calculator(5, 7 );


        System.out.printf("Sum =%d%nDifference = %d%nProduct =%d%nDIvision =%.2f%n",calculator1.getSum(),
                 calculator1.getDifference(), calculator1.getProduct(), calculator1.getDivision());
    }

}
