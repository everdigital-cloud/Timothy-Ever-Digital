package Chapter6;
import java.security.SecureRandom;
public class RandomNumber {
    public static void main(String[] args) {
        /*
        Write statements that will display a random number from each of the following sets:
 a) 0, 3, 6, 9, 12
  b) 1, 2, 4, 8, 16, 32.
 c) 10, 20, 30, 40.
         */
SecureRandom randomNumbers = new SecureRandom();
for (int counter=1;counter<=6;counter++) {
    int a =1+ 3 * randomNumbers.nextInt(6);
    System.out.print(a+" ");
}
    }
}
