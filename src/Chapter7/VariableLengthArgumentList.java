package Chapter7;

public class VariableLengthArgumentList {
    public static void main(String[] args) {
        /*
        Variable-Length Argument List)Write an application that calculates the average of a series
of integers that are passed to method average using a variable-length argument list. Test your method
with several calls, each with a different number of arguments.
         */
        int number1=3;
        int number2=5;
        int number3=1;
        int number4=3;
        int number5=10;
        int number6=20;
       // int []number={3,5,1,3,10,20};

        System.out.printf("The average of %d and %d = %.1f%n", number1, number2, average(number1,number2));
        System.out.printf("The average of %d, %d and %d = %.1f%n", number1, number2, number3,
                average(number1,number2,number3));
       // System.out.printf("The average is = %.1f", average(number));

    }
    public static double average(int... numbers){
        int total=0;
        for (int number:numbers){
           total+=number;
        }
        return (double) total/numbers.length;
    }
}
