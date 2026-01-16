package Chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class VaryingTheTypesOfProblems {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        Varying the Types of Problems) Modify the program of
Exercise 6.38 to allow the user to pick a type of arithmetic problem to study. An option of 1 means
addition problems only, 2 means subtraction problems only, 3 means multiplication problems only,
4means division problems only and 5 means a random mixture of all these types   1`q m,
         */
        System.out.println("""
                         WELCOME TO THE QUIZ COMPETITION
                
                Pick any option:
                1. Addition Quiz
                2. Subtraction Quiz
                3. Multiplication Quiz
                4. Division Quiz
                5. Random Question
                
                """);
        int level = input.nextInt();
        switch (level) {case 1: option1();break;case 2:
            option2();break;case 3:
            option3();break; case 4:
            option4();break; case 5: option5();break;}
    }

    public static void option1() {
        int rightScore = 0;
        int numberOfQuestion = 10;
        for (int counter = 1; counter <= numberOfQuestion; counter++) {
            Scanner input = new Scanner(System.in);
            SecureRandom randomNumber = new SecureRandom();
            int number1 = randomNumber.nextInt(10);
            int number2 = 1+randomNumber.nextInt(10);
            int sum = number1+number2;
            System.out.printf("%d + %d = ", number1, number2);
            int userAnswer = input.nextInt();
            if (userAnswer == sum) {
                rightComment();
                rightScore++;
            }
            if (userAnswer != sum) {
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
    public static void option2() {
        int rightScore = 0;
        int numberOfQuestion = 10;
        for (int counter = 1; counter <= numberOfQuestion; counter++) {
            Scanner input = new Scanner(System.in);
            SecureRandom randomNumber = new SecureRandom();
            int number1 = randomNumber.nextInt(10);
            int number2 = randomNumber.nextInt(10);
            int difference  = number1 - number2;
            System.out.printf("%d - %d = ", number1, number2);
            int userAnswer = input.nextInt();
            if (userAnswer == difference) {
                rightComment();
                rightScore++;
            }
            if (userAnswer != difference) {
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
    public static void option3() {
        int rightScore = 0;
        int numberOfQuestion = 10;
        for (int counter = 1; counter <= numberOfQuestion; counter++) {
            Scanner input = new Scanner(System.in);
            SecureRandom randomNumber = new SecureRandom();
            int number1 =randomNumber.nextInt(10);
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
    public static void option4() {
        int rightScore = 0;
        int numberOfQuestion = 10;
        for (int counter = 1; counter <= numberOfQuestion; counter++) {
            Scanner input = new Scanner(System.in);
            SecureRandom randomNumber = new SecureRandom();
            double number1 = randomNumber.nextInt(10);
            double number2 = randomNumber.nextInt(10);
            double division = number1 / number2;
            System.out.printf("%.2f divides %.2f = ", number1, number2);
            int userAnswer = input.nextInt();
            if (userAnswer == division) {
                rightComment();
                rightScore++;
            }
            if (userAnswer != division) {
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
    public static void option5() {
        int numberOfQuestion = 10;
        int totalScore = 0;
        for (int counter = 1; counter <= numberOfQuestion; counter++) {
            SecureRandom random = new SecureRandom();
            int periods = 1 + random.nextInt(4);

            switch (periods) {

                case 1:
                    totalScore+=randomOption1();
                    break;
                case 2:
                    totalScore+=randomOption2();
                    break;
                case 3:
                    totalScore+=randomOption3();
                    break;
                case 4:
                    totalScore+=randomOption4();
                    break;
            }

        }

        double percentage = (double) totalScore / numberOfQuestion * 100;
        if (percentage < 75) {
            System.out.printf("You scored %d which is %.0f%s, Please ask your teacher for extra help.", totalScore, percentage, "%");
        } else {
            System.out.printf("You scored %d which is %.0f%s, Congratulations, you are ready to go to the next level!",
                    totalScore, percentage, "%");
        }

    }
    public static int randomOption1() {
        SecureRandom random = new SecureRandom();
        Scanner input = new Scanner(System.in);
        int number1 = random.nextInt(10);
        int number2 = random.nextInt(10);
        int sum = number1 + number2;
        System.out.printf("%d + %d = ", number1, number2);
        int userAnswer = input.nextInt();
        int score=0;
        if (userAnswer == sum) {
            score = 1;
            rightComment();
        }else wrongComment();
        return score;
    }
    public static int randomOption2() {
        SecureRandom random = new SecureRandom();
        Scanner input = new Scanner(System.in);
        int number1 = random.nextInt(10);
        int number2 = random.nextInt(10);
        int difference = number1 - number2;
        System.out.printf("%d - %d = ", number1, number2);
        int userAnswer = input.nextInt();
        int score=0;
        if (userAnswer == difference) {
            score =1;
            rightComment();
        }else wrongComment();
        return score;
    }
    public static int randomOption3() {
        SecureRandom random = new SecureRandom();
        Scanner input = new Scanner(System.in);
        int number1 = random.nextInt(10);
        int number2 = random.nextInt(10);
        int product = number1 * number2;
        System.out.printf("%d times %d = ", number1, number2);
        int userAnswer = input.nextInt();
        int score=0;
        if (userAnswer == product) {
            score =1;
            rightComment();
        }else wrongComment();
        return score;
    }
    public static int randomOption4() {
        SecureRandom random = new SecureRandom();
        Scanner input = new Scanner(System.in);
        double number1 = random.nextInt(10);
        double number2 = random.nextInt(10);
        double division = number1/number2;
        System.out.printf("%.0f divides %.0f = ", number1, number2);
        int userAnswer = input.nextInt();
        int score=0;
        if (userAnswer == division) {
            score = 1;
            rightComment();
        }else wrongComment();
        return score;
    }
}