package Chapter6;
import java.util.Scanner;
public class SportsRecommender {
    public static void main(String[] args) {
        /*
        Write a method sportsRecommender that inputs a Celsius temperature and returns “It’s
lovely weather for sports today!” if it’s 20–30 °C, “It’s reasonable weather for sports today.” if it’s
10–40 °C, and “Please exercise with care today, watch out for the weather!” otherwise. Create an
application to test the method.
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a temperature in Celsius:");
        int temperature= input.nextInt();
        System.out.println( sportsRecommender(temperature));
    }
    private static String sportsRecommender (int temperature){
        if (temperature>=20&&temperature<=30) {
            return "It's a lovely weather for sports today";
        } if (temperature>=10&&temperature<=40){
            return "It's a reasonable weather for sports today!";
        }
        return "Please exercise with care today, watch out for the weather!";

    }
}
