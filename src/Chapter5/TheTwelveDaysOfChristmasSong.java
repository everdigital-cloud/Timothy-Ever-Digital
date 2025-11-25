package Chapter5;

import java.util.Scanner;

public class TheTwelveDaysOfChristmasSong {
    public static void main(String[] args) {

        //Write an application that uses iteration and switch
        // statements to print the song “The Twelve Days of Christmas.” One switch statement should be
        // used to print the day (“first,” “second,” and so on). A separate switch statement should be used to
        // print the remainder of each verse.

for (int counter=1; counter<=12;counter++){
    Scanner input=new Scanner(System.in);
    switch (counter){
        case 1:
            int u=input.nextInt();
            System.out.println("On the first day of christmas, my true love sent to me,");break;
        case 2:
            System.out.println("On the second day of Christmas, my true love sent to me,");break;
        case 3:
            System.out.println("On the third day of Christmas, my true love sent to me,");break;
        case 4:
            System.out.println("On the fourth day of Christmas, my true love sent to me,");break;
        case 5:
            System.out.println("On the fifth day of Christmas, my true love sent to me,");break;
        case 6:
            System.out.println("On the sixth day of Christmas, my true love sent to me,");break;
        case 7:
            System.out.println("On the seventh day of Christmas, my true love sent to me,");break;
        case 8:
            System.out.println("On the eighth day of Christmas, my true love sent to me,");break;
        case 9:
            System.out.println("On the ninth day of Christmas, my true love sent to me,");break;
        case 10:
            System.out.println("On the tenth day of Christmas, my true love sent to me,");break;
        case 11:
            System.out.println("On the eleventh day of Christmas, my true love sent to me,");break;
        case 12:
            System.out.println("On the twelveth day of Christmas, my true love sent to me,");break;
    }

    switch (counter){
        case 12:
            System.out.println("  Twelve drummers drumming");
        case 11:
            System.out.println("  Eleven pipers piping,");
        case 10:
            System.out.println("  Ten lords a-leaping,");
        case 9:
            System.out.println("  Nine ladies dancing,");
        case 8:
            System.out.println("  Eight maids a-milking,");
        case 7:
            System.out.println("  Seven swans a-swimming,");
        case 6:
            System.out.println("  Six geese a-laying,");
        case 5:
            System.out.println("  Five golden rings,");
        case 4:
            System.out.println("  Four calling birds,");
        case 3:
            System.out.println("  Three French hens,");
        case 2:
            System.out.println("  Two turtle doves,");
        case 1:
            System.out.println("  And a partridge in a pear tree.");

    }
}
    }
}
