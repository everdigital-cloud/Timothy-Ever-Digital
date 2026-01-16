package Chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class DificultyLevels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        (Computer-Assisted Instruction: Difficulty Levels) Exercises 6.35–6.37 developed a com
puter-assisted instruction program to help teach an elementary school student multiplication. Mod
ify the program to allow the user to enter a difficulty level. At a difficulty level of 1, the program
should use only single-digit numbers in the problems; at a difficulty level of 2, numbers as large as
two digits, and so on.
         */
        System.out.println("""
                         WELCOME TO THE MULTIPLICATION QUIZ COMPETITION
                
                Pick any level of your choice:
                1. Level 1
                2. Level 2
                3. Level 3
                4. Level 4 
                5. Level 5
                
                """);
        int level = input.nextInt();
        switch (level) {
            case 1:
                question1();
                break;
            case 2:
                question2();
                break;
            case 3:
                question3();
                break;
            case 4:
                question4();
                break;
            case 5:
                question5();
                break;
        }
    }

    public static void question1() {
        int rightScore = 0;
        int numberOfQuestion = 10;
        for (int counter = 1; counter <= numberOfQuestion; counter++) {
            Scanner input = new Scanner(System.in);
            SecureRandom randomNumber = new SecureRandom();
            int number1 = randomNumber.nextInt(10);
            int number2 = 1+randomNumber.nextInt(10);
            int product = number1 * number2;
            System.out.printf("%d times %d = ", number1, number2);
            int userAnswer = input.nextInt();
            if (userAnswer == product) {
                rightComment();
                rightScore++;
            }
            if (userAnswer != product) {
                wrongComment();
            }
        }
        double percentage = (double) rightScore / numberOfQuestion * 100;
        if (percentage < 75) {
            System.out.printf("You scored %d which is %.0f%s, Please ask your teacher for extra help.", rightScore, percentage, "%");
        } else {
            System.out.printf("You scored %d which is %.0f%s, Congratulations, you are ready to go to the next level!",
                    rightScore, percentage, "%");
        }
    }
    public static void question2() {
        int rightScore = 0;
        int numberOfQuestion = 10;
        for (int counter = 1; counter <= numberOfQuestion; counter++) {
            Scanner input = new Scanner(System.in);
            SecureRandom randomNumber = new SecureRandom();
            int number1 = randomNumber.nextInt(20);
            int number2 = 2+randomNumber.nextInt(10);
            int product = number1 * number2;
            System.out.printf("%d times %d = ", number1, number2);
            int userAnswer = input.nextInt();
            if (userAnswer == product) {
                rightComment();
                rightScore++;
            }
            if (userAnswer != product) {
                wrongComment();
            }
        }
        double percentage = (double) rightScore / numberOfQuestion * 100;
        if (percentage < 75) {
            System.out.printf("You scored %d which is %.0f%s, Please ask your teacher for extra help.", rightScore, percentage, "%");
        } else {
            System.out.printf("You scored %d which is %.0f%s, Congratulations, you are ready to go to the next level!",
                    rightScore, percentage, "%");
        }
    }

    public static void rightComment() {
        SecureRandom random = new SecureRandom();
        int period = 1 + random.nextInt(4);
        switch (period) {
            case 1:
                System.out.println("Very good!");
                break;
            case 2:
                System.out.println("Excellent!");
                break;
            case 3:
                System.out.println("Nice work!");
                break;
            case 4:
                System.out.println("Keep up the good work!");
                break;
        }
    }

    public static void wrongComment() {
        SecureRandom random = new SecureRandom();
        int period = 1 + random.nextInt(4);
        switch (period) {
            case 1:
                System.out.println("No. Please try again.");
                break;
            case 2:
                System.out.println("Wrong. Try once more.");
                break;
            case 3:
                System.out.println("Don't give up!");
                break;
            case 4:
                System.out.println("No. Keep trying.");
                break;
        }
    }
    public static void question3() {
        int wrongScore = 0;
        int rightScore = 0;
        int numberOfQuestion = 10;
        for (int counter = 1; counter <= numberOfQuestion; counter++) {
            Scanner input = new Scanner(System.in);
            SecureRandom randomNumber = new SecureRandom();
            int number1 =2+ randomNumber.nextInt(30);
            int number2 = 10+randomNumber.nextInt(20);
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
        double percentage = (double) rightScore / numberOfQuestion * 100;
        if (percentage < 75) {
            System.out.printf("You scored %d which is %.0f%s, Please ask your teacher for extra help.", rightScore, percentage, "%");
        } else {
            System.out.printf("You scored %d which is %.0f%s, Congratulations, you are ready to go to the next level!",
                    rightScore, percentage, "%");
        }
    }
    public static void question4() {
        int wrongScore = 0;
        int rightScore = 0;
        int numberOfQuestion = 10;
        for (int counter = 1; counter <= numberOfQuestion; counter++) {
            Scanner input = new Scanner(System.in);
            SecureRandom randomNumber = new SecureRandom();
            int number1 = 10+randomNumber.nextInt(40);
            int number2 = 10+randomNumber.nextInt(30);
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
        double percentage = (double) rightScore / numberOfQuestion * 100;
        if (percentage < 75) {
            System.out.printf("You scored %d which is %.0f%s, Please ask your teacher for extra help.", rightScore, percentage, "%");
        } else {
            System.out.printf("You scored %d which is %.0f%s, Congratulations, you are ready to go to the next level!",
                    rightScore, percentage, "%");
        }
    }
    public static void question5() {
        int wrongScore = 0;
        int rightScore = 0;
        int numberOfQuestion = 10;
        for (int counter = 1; counter <= numberOfQuestion; counter++) {
            Scanner input = new Scanner(System.in);
            SecureRandom randomNumber = new SecureRandom();
            int number1 = 20+randomNumber.nextInt(50);
            int number2 = 20+randomNumber.nextInt(50);
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
        double percentage = (double) rightScore / numberOfQuestion * 100;
        if (percentage < 75) {
            System.out.printf("You scored %d which is %.0f%s, Please ask your teacher for extra help.", rightScore, percentage, "%");
        } else {
            System.out.printf("You scored %d which is %.0f%s, Congratulations, you are ready to go to the next level!",
                    rightScore, percentage, "%");
        }
    }
}
