package Chapter8;
import java.security.SecureRandom;
public class RandomNumberGenerator {



    public static void main(String[] args) {
        SecureRandom ramdomNumbers=new SecureRandom();

        for (int counter=0;counter<1000;counter++) {
            if (counter%5==0){
                System.out.println();
            }
            int random= 10+ramdomNumbers.nextInt(91);
            System.out.print(random+" ");

        }
    }
}
