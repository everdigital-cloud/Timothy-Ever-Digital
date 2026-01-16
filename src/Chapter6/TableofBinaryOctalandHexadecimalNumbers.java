package Chapter6;
import java.util.Scanner;
public class TableofBinaryOctalandHexadecimalNumbers {
    public static void main(String[] args) {
        /*
        (Table of Binary, Octal and Hexadecimal Numbers) Write an application that displays a
table of the binary, octal and hexadecimal equivalents of the decimal numbers in the range 1
through 256. If you aren’t familiar with these number systems, read online Appendix J first.
         */
        Scanner input =new Scanner(System.in);
        System.out.printf("%s %10s %10s %15s%n", "Decimal", "Binary", "Octal", "Hexadecimal"+"\t");
        for (int decimal=1; decimal<=256;decimal++) {
           System.out.printf("   %-10d %-10s %-10s %-10s%n", decimal, binamry(decimal), octal(decimal), hexaDecimal(decimal)+"\t");
       }
    }
    private static String binamry(int decimal){
        String binary="";
        while (decimal>0){
            binary=decimal%2+binary;
            decimal=decimal/2;
        }
        return binary;
    }

    private static String octal(int decimal){
        String octal="";
        while (decimal>0){
            octal=decimal%8+octal;
            decimal=decimal/8;
        }
        return octal;
    }

    private static String hexaDecimal(int decimal){
        String hexaDecimal="";
        while (decimal>0){
                hexaDecimal = decimal % 16 + hexaDecimal;
                decimal = decimal / 16;

        }
        return hexaDecimal;
    }
}