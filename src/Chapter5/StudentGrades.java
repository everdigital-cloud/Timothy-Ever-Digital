package Chapter5;
import java.util.Scanner;
public class StudentGrades {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        //(Student Grades) A group of five students earned the following grades: Student 1, ‘A’; stu
        //dent 2, C’; student 3, ‘B’; student 4, ‘A’ and student 5, ‘B’. Write an application that reads a series
        // of pairs of numbers as follows:
        // a) student name
        // b) student letter grade
        // Your program should use a switch statement to determine how many students got a grade of ‘A’,
        // how many got a grade of ‘B’, how many got a grade of ‘C’, and how many got a grade of ‘D’. Use a
        // loop as needed to input the five student grades, and then finally display the results.
        int gradeCounter=0;
        int total=0;
        int aCount=0;
        int bCount=0;
        int cCount=0;
        int dCount=0;
        String A;
        String B;
        String C;
        String D;

        System.out.println("Enter the 5 students grades :");
        int counter=1;
        while (counter<=5) {
            String grades = input.next();
            counter++;

            switch (grades) {
                case "A":
                    aCount++;
                    break;
                case "B":
                    bCount++;
                    break;
                case "C":
                    cCount++;
                    break;
                case "D":
                    dCount++;
                    break;
            }
        }
        System.out.printf("Grades display %n" +
                "A = %d%n" +
                "B = %d%n" +
                "C = %d%n" +
                "D = %d%n", aCount,bCount,cCount,dCount);



    }
}
