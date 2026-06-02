package Chapter8;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;
public class AccountTest {
    public static void main(String[] args) {
        Account account1=new Account("Jane Green", BigDecimal.valueOf(1000000.6789) );
        System.out.printf("%s balance: %.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s Balance: %s%n", account1.getName(), NumberFormat.getCurrencyInstance().format(account1.getBalance()));

    }
}
