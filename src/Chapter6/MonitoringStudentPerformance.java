package Chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class MonitoringStudentPerformance {
    public static void main(String[] args) {
        /*
        Monitoring Student Performance) More sophisticated
computer-assisted instruction systems monitor the student’s performance over a period of time. The
decision to begin a new topic is often based on the student’s success with previous topics. Modify
the program of Exercise 6.36 to count the number of correct and incorrect responses typed by the
student. After the student types 10 answers, your program should calculate the percentage that are
correct. If the percentage is lower than 75%, display "Please ask your teacher for extra help.",
then reset the program so another student can try it. If the percentage is 75% or higher, display
"Congratulations, you are ready to go to the next level!", then reset the program so another
student can try it.
         */
          question();
    }
    public static void question(){
        int wrongScore=0;
        int rightScore=0;
        int numberOfQuestion=10;
         for (int counter=1;counter<=numberOfQuestion;counter++) {
             Scanner input = new Scanner(System.in);
             SecureRandom randomNumber = new SecureRandom();
             int number1 = randomNumber.nextInt(10);
             int number2 = randomNumber.nextInt(10);
             int product = number1 * number2;
             System.out.printf("%d times %d = ", number1, number2);
             int userAnswer = input.nextInt();

             if (userAnswer == product) {
                 rightComment();
                 rightScore++;
             }

             if (userAnswer != product) {
                 wrongComment();
                 wrongScore++;
             }

         }
         double percentage=(double)rightScore/numberOfQuestion*100;
         if (percentage<75){
            System.out.printf("You scored %d which is %.0f%s, Please ask your teacher for extra help.", rightScore, percentage, "%");
        }else {
             System.out.printf("You scored %d which is %.0f%s, Congratulations, you are ready to go to the next level!",
                     rightScore,percentage, "%");
         }



    }
    public static void rightComment(){
        SecureRandom random = new SecureRandom();
        int period = 1+random.nextInt(4);
        switch (period){
            case 1:System.out.println("Very good!");break;
            case 2:System.out.println("Excellent!");break;
            case 3:System.out.println("Nice work!");break;
            case 4:System.out.println("Keep up the good work!");break;
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

