package Chapter7;

public class Array {
    public static void main(String[] args) {
        /*
        b) Declare an array with ARRAY_SIZE elements of type double, and initialize the elements
to 0.
c) Refer to array element 4.
d) Assign the value 1.667 to array element 9.
e) Assign the value 3.333 to array element 6.
f) Sum all the elements of the array, using a for statement. Declare the integer variable x
as a control variable for the loop.
         */
       final int ARRAY_SIZE=10;
       double[] array=new double[ARRAY_SIZE];
        System.out.println(array[4]);
        array[9]=1.667;
        array[6]=3.333;

        System.out.println("Array element 9 is "+ array[9]);
        System.out.println("Array element 6 is "+ array[6]);

        double total=0.0;
        for (int x =0; x<array.length;x++ ) {
            total += array[x];
        }
            System.out.printf("Sum of the element in the array is %.3f", + total);

    }
}
