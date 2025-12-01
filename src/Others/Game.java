package Others;
import java.security.SecureRandom;
public class Game {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();
        int result = 1 +2* randomNumbers.nextInt(9);
        System.out.println(result);
    }
}
