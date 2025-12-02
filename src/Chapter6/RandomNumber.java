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
//for (int counter=1;counter<=6;counter++) {
    //int a =3 * randomNumbers.nextInt(5);
    int scale =6;
    int random=1+randomNumbers.nextInt(1);
    int nextNumber=random;

    for (int number=1;number<=scale;number++){

        System.out.print(nextNumber+" ");
        nextNumber*=2;
    }
        /*int scale =4;
        int random=0+randomNumbers.nextInt(1);
        int nextNumber=random;

        for (int number=1;number<=scale;number++){
            nextNumber+=10;
            System.out.print(nextNumber+" ");
        }*/


}
    }
//}
