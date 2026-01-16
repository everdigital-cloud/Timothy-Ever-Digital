package Chapter6;
import java.util.Scanner;
public class CalculatingTheSumOfDigits {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

            System.out.println("Enter a 4 digits Number: ");
            int number= input.nextInt();
        while (number<1000||number>9999){
            System.err.println("Invalid number!!!");
            System.out.println("Enter a 4 digits Number: ");
             number= input.nextInt();
        }
            sumOfDigits(number);


        
    }
    private static void sumOfDigits(int number){

        int a=number/1000;
        //System.out.println(a);
        int b=(number/100)%10;
        //System.out.println(b);
        int c=(number%100)/10;
        //System.out.println(c);
        int d=number%10;
        //System.out.println(d);
        System.out.println("The sum of the digits in "+number+" is "+ (a+b+c+d));
    }

}
