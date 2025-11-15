package Chapter4;
import java.util.Scanner;
public class Cryptography {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       /* All the data is transmitted as four-digit integers. Your application should read a four-digit
 integer entered by the user and encrypt it as follows: Replace each digit with the result of adding 7
 to the digit and getting the remainder after dividing the new value by 10. Then swap the first digit
 with the third, and swap the second digit with the fourth. Then print the encrypted integer. Write
 a separate application that inputs an encrypted four-digit integer and decrypts it (by reversing the
 encryption scheme) to form the original number. [Optional reading project: Research “public key
 cryptography” in general and the PGP (Pretty Good Privacy) specific public key scheme. You may
 also want to investigate the RSA scheme, which is widely used in industrial-strength applicati*/
        System.out.println("Enter a 4-digit number: ");
        int number=input.nextInt();

        while (number<1000||number>=9999){
            System.err.println("Invalid");
            System.out.println("Enter a 4-digit number: ");
            number= input.nextInt();

        }
        int firstDigit=number/1000;
        int secondDigit=(number%1000)/100;
        int thirdDigit=(number%100)/10;
        int forthDigit=number%10;

        int first=(thirdDigit+7)%10;
        int second=(forthDigit+7)%10;
        int third=(firstDigit+7)%10;
        int forth=(secondDigit+7)%10;
        int encryptedNumber=(first*1000)+(second*100)+(third*10)+(forth);

        System.out.printf("Encrypted number is %d%n", encryptedNumber);
    }
}

        /*System.out.println("Enter the encrypted number: ");
        int number = input.nextInt();

        while (number >= 9999) {
            System.err.println("Invalid");
            System.out.println("Enter a valid encrypted number: ");
            number = input.nextInt();
        }

        int first=number/1000;
        int second=(number%1000)/100;
        int third=(number%100)/10;
        int forth=number%10;

        int firstNumber=(third+10)-7;
        int secondNumber=(forth+10)-7;
        int thirdNumber=(first+10)-7;
        int forthNumber=(second+10)-7;

        int originalNumber=(firstNumber*1000)+(secondNumber*100)+(thirdNumber*10)+(forthNumber);
        System.out.printf("Original number is %d%n", originalNumber );



    }
}*/
