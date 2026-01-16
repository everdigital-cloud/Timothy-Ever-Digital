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
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String stringSample = input.next();
        System.out.println(beautifyString(stringSample));
    }

    public static String putFullStop(String stringSample) {

        if (stringSample.endsWith(".") == false) {
            stringSample=stringSample+".";
        } else {
            return stringSample;
        }
        return stringSample;
    }
    public static String capitalize( String stringSample){
        String capitalizedWord=stringSample.substring(0,1).toUpperCase()+stringSample.substring(1);
        return capitalizedWord;
    }

    private static String beautifyString(String stringSample){
        return capitalize(putFullStop(stringSample));
    }
}