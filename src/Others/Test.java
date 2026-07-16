package Others;
import java.math.BigDecimal;
import java.text.NumberFormat;
public class Test {
    public static void main(String[] args) {
//       BigDecimal amount=BigDecimal.valueOf(-4);
//
//       if (amount.compareTo(BigDecimal.ZERO)>0){
//           System.out.println("Good");
//       }
        int num1=50;
        int num2=20;
        int hfactor=1;
        int num1f=1;
        for (int factor=1; factor<=num1; factor++) {
            if (num1 % factor == 0) {
                num1f = factor;
            }

            int num2f = 1;
            for (int factor2 = 1; factor2 <=num2; factor2++) {
                if (num2 % factor2 == 0) {
                    num2f = factor2;
                }

                if (num1f == num2f) {
                    hfactor = num1f;
                }
            }
        }
        System.out.println(hfactor);

    }
}