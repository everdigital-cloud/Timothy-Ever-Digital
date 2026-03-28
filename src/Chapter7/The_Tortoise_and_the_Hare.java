package Chapter7;
import java.security.SecureRandom;
public class The_Tortoise_and_the_Hare {
    public static void main(String[] args) {

        System.out.println("!!! WELCOME TO THE TORTOISE AND THE HARE RACE SIMULATION!!!");
        System.out.println();
        System.out.println("BANG !!!!! "+"\n"+"AND THEY'RE OFF !!!!!");
        System.out.println();
SecureRandom random=new SecureRandom();
int []track=new int[20];
int tortoiseNextPosition=0;
int hareNextPosition=0;
while (tortoiseNextPosition<70&&hareNextPosition<70){
    int tortoisePosition = 1 + random.nextInt(9);
    tortoiseNextPosition+=tortoisePosition;
    int harePosition = 1 + random.nextInt(9);
    hareNextPosition+=harePosition;
    position(tortoiseNextPosition, hareNextPosition);
    if (tortoiseNextPosition>=70){
        System.out.println("TORTOISE WINS!!! YAY!!! ");
    }if (hareNextPosition>=70){
        System.out.println("Hare wins. Yuch.");
    } if (hareNextPosition==tortoiseNextPosition){
        System.out.println(" OUCH!!!  ");
    }
}
    }
private static void position(int tortoisePosition,int harePosition){
    String []track=new String[70];
    for (int row=0;row<track.length;row++) {

        if (row+1  == tortoisePosition) {
            System.out.print("T ");
        } else {

            track[row] = ", ";
            System.out.print(track[row]);
        }

    }
    System.out.println();
    for (int row=0;row<track.length;row++) {

        if (row+1  == harePosition) {
            System.out.print("H ");
        } else {

            track[row] = ", ";
            System.out.print(track[row]);
        }


    }
    System.out.println();
    System.out.println();
    }

}