package Chapter6;
import java.util.Scanner;
import java.security.SecureRandom;
public class ComputerAssistedInstruction {
    public static void main(String[] args) {
        /*
        (Computer-Assisted Instruction) The use of computers in education is referred to as com
puter-assisted instruction (CAI). Write a program that will help an elementary school student learn
multiplication. Use a SecureRandom object to produce two positive one-digit integers. The program
should then prompt the user with a question, such as
How much is 6 times 7?
The student then inputs the answer. Next, the program checks the student’s answer. If it’s correct,
display the message "Very good!" and ask another multiplication question. If the answer is wrong,
display the message "No. Please try again." and let the student try the same question repeatedly
until the student finally gets it right. A separate method should be used to generate each new ques
tion. This method should be called once when the application begins execution and each time the
user answers the question correctly.
         */
        SecureRandom randomNumber=new SecureRandom();
        Scanner input=new Scanner(System.in);


        int number1= randomNumber.nextInt(10);
        int number2= randomNumber.nextInt(10);
        int product=number1*number2;
        System.out.printf("%d times %d = ", number1,number2);
        int userAnswer= input.nextInt();
        while (product!=userAnswer){
            System.out.println("No. please try again");
            System.out.printf("%d times %d = ", number1,number2);
             userAnswer= input.nextInt();
        }
        while (product==userAnswer){
            System.out.println("Very good");
             number1= randomNumber.nextInt(10);
             number2= randomNumber.nextInt(10);
             product=number1*number2;
            System.out.printf("%d times %d = ", number1,number2);
            userAnswer= input.nextInt();

            while (product!=userAnswer){
                System.out.println("No. please try again");
                System.out.printf("%d times %d = ", number1,number2);
                userAnswer= input.nextInt();
                }
        }




    }

}
