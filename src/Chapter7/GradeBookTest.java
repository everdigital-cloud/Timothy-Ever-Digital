package Chapter7;

public class GradeBookTest {
    public static void main(String[] args) {
        // array of student grades
        int[] gradesArray = {2,3,4,5,6,7,8,9,10,11,12};
        Gradebook myGradeBook = new Gradebook(
                         "CS101 Introduction to Java Programming",gradesArray);
              System.out.printf("Welcome to the grade book for%n%s%n%n",
                         myGradeBook.getCourseName());
        myGradeBook.processGrades();
          }
 }


