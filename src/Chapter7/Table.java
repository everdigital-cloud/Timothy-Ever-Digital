package Chapter7;

public class Table {
    public static void main(String[] args) {
        /*
        Perform the following tasks for an array called table:
a) Declare and create the array as an integer array that has three rows and three columns.
Assume that the constant ARRAY_SIZE has been declared to be 3.
b) How many elements does the array contain?
c) Use a for statement to initialize each element of the array to the sum of its indices. As
sume that the integer variables x and y are declared as control variables.
         */
        final int ARRAY_SIZE=3;
        int[][] table = new int[ARRAY_SIZE][ARRAY_SIZE];
        //(b) (9 elements)
        for (int x =0; x<table.length; x++){
            for (int y=0; y < table[x].length;y++) {
                table[x][y] = x + y;
                System.out.printf("%5d", table[x][y]);
            }
        }
    }
}
