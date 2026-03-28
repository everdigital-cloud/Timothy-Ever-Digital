package Chapter7;
import java.util.Scanner;
import java.util.Arrays;
import java.security.SecureRandom;
public class DuplicateElimination {
    public static void main(String[] args) {
        /*
        (Duplicate Elimination)  Use a one-dimensional array to solve the following problem:
Write an application that inputs ten numbers, each between 10 and 100, both inclusive. Save
each number that was read in an array that was initialized to a value of -1 for all elements. Assume
a value of -1 indicates an array element is empty. You are then to process the array, and remove
duplicate elements from the array containing the numbers you input. Display the contents of the
array to demonstrate that the duplicate input values were actually removed. [Note: do not display
the array elements where the value is -1.]
         */


        Scanner input=new Scanner(System.in);
        SecureRandom random=new SecureRandom();

        int[]array1=new int[200];
        Arrays.fill(array1, -1);

        System.out.println("Enter 5 integers: ");
        for (int row=1;row<array1.length;row++){
            array1[row]= 10+random.nextInt(91);
        }
        for (int row=0;row<array1.length;row++){

            if (row%10==0){
                System.out.println();
            }
            if (array1[row]==array1[row+1]){
                System.out.print("-1  ");
            }else {
                System.out.print(array1[row]+"  ");
            }

        }

    }

}
