package Chapter4;

import javax.sound.midi.Soundbank;
import java.net.SocketOption;
import java.util.Scanner;
public class If {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a digit: ");
        int x=input.nextInt();

        if(x<10) {
            System.out.println("Number less than 10");
        }else
                if(x>10){
                        System.out.println("Number greater than 10");
                    }else {
                    System.out.print("Number is 10");
                }


    }
}
