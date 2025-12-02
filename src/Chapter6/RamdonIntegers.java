package Chapter6;
import java.security.SecureRandom;
public class RamdonIntegers {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        /*
        Write statements that assign random integers to the variable n in the following ranges:
 a) 2 ≤ n ≤ 6.
 b) 4 ≤ n ≤ 50.
 c) 0 ≤ n ≤ 7.
 d) 1000 ≤ n ≤ 1030.
 e)–5 ≤ n ≤ 1.
 f)–2 ≤ n ≤ 9.
         */
        for (int counter = 1; counter <= 20; counter++) {
          //  int n = 1 + random.nextInt(6);
           // int n=4+random.nextInt(50);
            //int n=random.nextInt(8);
            //int n=1000+random.nextInt(1030);
            //int n=1-random.nextInt(7);
            int n=-2+random.nextInt(12);
            System.out.print(n +"   "+'\t');
            if (counter%5==0){
                System.out.println();
            }

        }
    }
}
