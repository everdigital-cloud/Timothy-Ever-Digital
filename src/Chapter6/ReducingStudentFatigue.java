package Chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class ReducingStudentFatigue {
    public static void main(String[] args) {
        /*
        (Computer-Assisted Instruction: Reducing Student Fatigue) One problem in CAI environ
ments is student fatigue. This can be reduced by varying the computer’s responses to hold the stu
dent’s attention. Modify the program of Exercise 6.35 so that various comments are displayed for
each answer as follows:
Possible responses to a correct answer:
Very good!
Excellent!
Nice work!
Keep up the good work!
Possible responses to an incorrect answer:
No. Please try again.
Wrong. Try once more.
Don't give up!
No. Keep trying.
Use random-number generation to choose a number from 1 to 4 that will be used to select
one of the four appropriate responses to each correct or incorrect answer. Use a switch statement to
issue the responses.
         */

        SecureRandom randomNumber=new SecureRandom();
        Scanner input=new Scanner(System.in);


        int number1= randomNumber.nextInt(10);
        int number2= randomNumber.nextInt(10);
        int product=number1*number2;
        System.out.printf("%d times %d = ", number1,number2);
        int userAnswer= input.nextInt();
        while (product!=userAnswer){
            wrongComment();
            System.out.printf("%d times %d = ", number1,number2);
            userAnswer= input.nextInt();
        }
        while (product==userAnswer){
            rightComment();
            number1= randomNumber.nextInt(10);
            number2= randomNumber.nextInt(10);
            product=number1*number2;
            System.out.printf("%d times %d = ", number1,number2);
            userAnswer= input.nextInt();

            while (product!=userAnswer){
                wrongComment();
                System.out.printf("%d times %d = ", number1,number2);
                userAnswer= input.nextInt();
            }
        }




    }
    public static void rightComment(){
            SecureRandom random = new SecureRandom();
            int period = 1+random.nextInt(4);
           switch (period){
               case 1:System.out.println("Very good!");break;
               case 2:System.out.println("Excellent!");break;
               case 3:System.out.println("Nice work!");break;
               case 4:System.out.println("Keep up the good word!");break;
           }
        }

    public static void wrongComment(){
        SecureRandom random = new SecureRandom();
        int period = 1+random.nextInt(4);
        switch (period){
            case 1:System.out.println("No. Please try again.");break;
            case 2:System.out.println("Wrong. Try once more.");break;
            case 3:System.out.println("Don't give up!");break;
            case 4:System.out.println("No. Keep trying.");break;
        }
    }
}
