package Chapter7;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Scanner;
public class GradeBook2Test {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter number of students :");
        int numberOfStudents=input.nextInt();
        System.out.println("Enter number of exams :");
        int numberOfExam=input.nextInt();
        int[][]gradeArray=new int[numberOfStudents][numberOfExam];
        for (int[] counter : gradeArray) {
            Arrays.fill(counter, -1);
        }
        System.out.println("Enter all the grade for each student row by row");
        for (int row=0;row<gradeArray.length;row++){
            for (int col=0;col<gradeArray[row].length;col++){
              gradeArray[row][col]=input.nextInt();
            }
        }
      // gradeArray[0][2]=100;
        GradeBook2 myGradeBook2 = new GradeBook2(
                "CS101 Introduction to Java Programming",gradeArray);
        System.out.printf("Welcome to the grade book for%n%s%n%n",
                myGradeBook2.getCourseName());
        //myGradeBook2.processGrades();
        myGradeBook2.outputGrades();
        System.out.println("Minimum grade is "+myGradeBook2.getMinimum());
        System.out.println("Maximum grade is "+myGradeBook2.getMaximum());
        System.out.printf("average grade is %.2f", myGradeBook2.getAverage());
        myGradeBook2.outputBarChart();
    }

}
