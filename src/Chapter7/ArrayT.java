package Chapter7;
import java.util.Scanner;

public class ArrayT {
    public static void main(String[] args) {
        /*
 Consider a two-by-three integer array t.
a) Write a statement that declares and creates t.
b) How many rows does t have?
c) How many columns does t have?
d) How many elements does t have?
e) Write access expressions for all the elements in row 1 of t.
f) Write access expressions for all the elements in column 2 of t.
g) Write a single statement that sets the element of t in row 0 and column 1 to zero.
h) Write individual statements to initialize each element of t to zero.
i)
Write a nested for statement that initializes each element of t to zero.
j)
Write a nested for statement that inputs the values for the elements of t from the user.
k) Write a series of statements that determines and displays the smallest value in t.
l)
Write a single printf statement that displays the elements of the first row of t.
m) Write a statement that totals the elements of the third column of t. Do not use iteration.
n) Write a series of statements that displays the contents of t in tabular format. List the
column indices as headings across the top, and list the row indices at the left of each row.
         */
        //a//
      // int[][] t=new int[2][3];
        //b// 2 rows
        //c// 3 columns
        //d// 6 elements
        //e// t[0][0],t[0][1],t[0][2]
        //f// t[0][1], t[1][1]
        //g// t[0][1]=0;
        //h//
//        t[0][0]=0;
//        t[0][1]=0;
//        t[0][2]=0;
//        t[1][0]=0;
//        t[1][1]=0;
//        t[1][2]=0;
        //i//
//        for (int row=0;row<t.length;row++){
//            for (int columns=0;columns<t[row].length; columns++){
//                t[row][columns]=0;
//                System.out.print(t[row][columns]+"  ");
//                if (columns==2){
//                    System.out.println();
//                }
//            }
//        }
        //Scanner input=new Scanner(System.in);
       int[][]t={{30,82,93},{4,58,7}};
//        int smallest=t[0][0];
//        for (int[] min : t) {
//            for (int anInt : min) {
//                // t[row][colums]= input.nextInt();
//                if (anInt < smallest) {
//                    smallest = anInt;
//                }
//            }
//
//        }
//        System.out.println("The smallest is "+smallest);

//        for (int row=0;row<t.length;row++){
//            for (int colums=0;colums<t[row].length;colums++){
//                System.out.print(t[row][colums]+"  ");
//                if (colums==2){
//                    System.out.println();
//                }
//            }
//        }
        //l//
      //  System.out.printf("%s%5d%5d%5d%n", "The first row elements:",t[0][0],t[0][1],t[0][2] );
       // System.out.printf("%s%5d", "The sum of the third colum is ", t[0][2]+t[1][2]);
        System.out.print("0   1    2");
       System.out.println();
        for (int row=0;row<t.length;row++){
            for (int columns=0;columns<t[row].length;columns++){
               // System.out.println(columns);
                System.out.print(t[row][columns]+"  ");
                if (columns==2){
                    System.out.println();
                }
            }
        }
    }
}
