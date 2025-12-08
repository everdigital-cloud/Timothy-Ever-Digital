package Chapter6;
import java.util.Locale;
import java.util.Scanner;
public class BeautifyingString {
    public static void main(String[] args) {
/*
(Beautifying Strings) Write methods that accomplish each of the following tasks:
 a) Check whether the string is terminated by a full stop, and if not, add a full stop.
 b) Check whether the string starts with a capital letter, and if not, capitalize the first letter.
 c) Use the methods developed in parts (a) and (b) and to write a method beautifyString
 that receives a string from the user, and then calls the methods in (a) and (b) to make
 sure that the string is properly formatted, in other words, the string has a full stop at
 the end, and a capitalized first letter. Make sure you output the string after it has been
 beautified!
 */
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String stringSample = input.next();
        putFullStop(stringSample);


    }
        
private static void putFullStop(String stringSample) {
if(stringSample.endsWith(".") == false) {
    System.out.println(stringSample+".");
}else {
    System.out.println(stringSample);
 }
}
}
