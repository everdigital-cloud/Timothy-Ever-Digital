package Chapter8;

import java.util.Scanner;

import java.util.Scanner;
public class fancyTimeTest {
    public static void main(String[] args) {
        fancyTime time1 = new fancyTime(14, 30,20);
        displayTime2("Time 1 ",time1);

//        try {
//            fancyTime time3 = new fancyTime(27, 74, 99);
//        } catch (IllegalArgumentException e) {
//            System.out.printf("%nException while initializing time3: %s%n", e.getMessage());
//        }
    }
    private  static void displayTime(String header, fancyTime time1){
        System.out.printf("%s %s%n%16s%n%13s   ", header,time1.toString(), time1.toUniversalString(),time1.toHHMMUniversalString());
    }


    private  static void displayTime2(String header, fancyTime time1){
        Scanner input=new Scanner(System.in);
        System.out.println("""
                Select time format
                1. HH:MM:SS AM/PM
                2. HH:MM:SS
                3. HH:MM
                """);
        int option = input.nextInt();
        switch (option){
            case 1: System.out.printf("%s %13s   ", header,time1.toString());break;
            case 2: System.out.printf("%s %13s   ", header, time1.toUniversalString());break;
            case 3: System.out.printf("%s %13s   ", header,time1.toHHMMUniversalString());break;
        }
      //  System.out.printf("%s %s%n%16s%n%13s   ", header,time1.toString(), time1.toUniversalString(),time1.toHHMMUniversalString());
    }
}
