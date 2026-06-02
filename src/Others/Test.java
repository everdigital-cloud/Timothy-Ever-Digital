package Others;
import java.math.BigDecimal;
import java.text.NumberFormat;
public class Test {
    public static void main(String[] args) {
       BigDecimal amount=BigDecimal.valueOf(-4);

       if (amount.compareTo(BigDecimal.ZERO)>0){
           System.out.println("Good");
       }
    }
}