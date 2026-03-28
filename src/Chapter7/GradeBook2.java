package Chapter7;

public class GradeBook2{
private String courseName;
 int[][] grades;

    public  GradeBook2(String courseName, int[][] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }
    public void outputBarChart() {
        System.out.println();
        System.out.println("Grade distribution:");

        // stores frequency of grades in each range of 10 grades
        int[] frequency = new int[11];
        // for each grade, increment the appropriate frequency
        for (int row=0; row<grades.length;row++) {
            for (int col=0;col<grades[row].length;col++) {
                ++frequency[grades[row][col] / 10];
            }
        }
        // for each grade frequency, print bar in chart
        for (int count = 0; count < frequency.length; count++) {
            // output bar label ("00-09: ", ..., "90-99: ", "100: ")
            if (count == 10) {
                System.out.printf("%5d: ", 100);
            } else {
                System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);
            }

            // print bar of asterisks
            for (int stars = 0; stars < frequency[count]; stars++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String getCourseName() {
        return courseName;
    }
    public int getMinimum(){
        int lowGrade=grades[0][0];
        for (int row=0;row<grades.length;row++){
            for (int col=0;col<grades[row].length;col++){
                if (grades[row][col]<lowGrade){
                 lowGrade=grades[row][col];
                }
            }
        }
        return lowGrade;
    }

    public int getMaximum(){
        int highGrade=grades[0][0];
        for (int row=0;row<grades.length;row++){
            for (int col=0;col<grades[row].length;col++){
                if (grades[row][col]>highGrade){
                    highGrade=grades[row][col];
                }
            }
        }
        return highGrade;
    }
    public double getAverage(){
        int total=0;
        int counter=0;
        for (int row=0;row<grades.length;row++){
            for (int col=0;col<grades[row].length;col++){
                total+=grades[row][col];
                counter++;
            }
        }
        return (double)total/counter;
    }

    public void outputGrades() {
        System.out.printf("The grades are:%n%n");
        System.out.printf("%25s%15s%15s%15s", "Exam1","Exam2","Exam3","Exam4");
        System.out.println();
        for (int row = 0; row < grades.length; row++) {
            System.out.printf("Student%d",row+1 );
            for (int col=0;col<grades[row].length;col++) {
                System.out.printf("%15d", grades[row][col]);
            }
            System.out.println();
        }
    }

}
