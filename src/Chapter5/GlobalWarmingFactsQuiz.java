package Chapter5;

import java.util.Scanner;


public class GlobalWarmingFactsQuiz {
    public static void main(String[] args) throws InterruptedException {
        int pass=0;
        int failed=0;

        System.out.println("""
                *******************
                GLOBAL WARMING QUIZ
                *******************""");
        System.out.println("""
                Read this passage carefully to know some facts about global warming.
                
                                The world’s average surface temperature has increased by around 0.74°C over the past 100 years (1906 - 2005).
                                 A warming of about 0.2°C is projected for each of the next two decades.
                                The best estimates for sea-level rise due to ocean expansion and glacier melt by the end of the century
                                 (compared to 1989 – 1999 levels) have narrowed to 28 - 58 cm, versus 9 - 88 cm in the 2001 report, due to
                                 improved understanding. However, larger values of up to 1 m by 2100 cannot be ruled out if ice sheets
                                 continue to melt as temperature rises.
                                Sea ice is projected to shrink in both the Arctic and Antarctic regions. Large areas of the Arctic Ocean
                                 could lose year-round ice cover by the end of the 21st century if human emissions reach the higher end of
                                 current estimates. The extent of Arctic sea ice has already shrunk by about 2.7 per cent per decade
                                 since 1978, with the summer minimum declining by about 7.1 per cent per decade.
                                Snow cover has decreased in most regions, especially in spring. The maximum extent of frozen ground in the
                                 winter/spring season decreased by about 7 per cent in the Northern Hemisphere over the latter half of the
                                 20th century. The average freezing date for rivers and lakes in the Northern Hemisphere over the past
                                 150 years has arrived later by some 5.8 days per century, while the average break-up date has arrived
                                 earlier by 6.5 days per century.
                                It is “very likely” that precipitation will increase at high latitudes and “likely” it will decrease over
                                most subtropical land regions. The pattern of these changes is similar to what has been observed during the
                                20th century.
                                It is “very likely” that the upward trend in hot extremes and heat waves will continue. The duration and
                                 intensity of drought has increased over wider areas since the 1970s, particularly in the tropics and
                                 subtropics. The Sahel, the Mediterranean, southern Africa and parts of southern Asia have already become
                                drier during the 20th century.
                                The number of tropical cyclones (typhoons and hurricanes) per year is projected to decline. However,
                                the intensity of these storms is expected to increase, with higher peak wind speeds and more intense
                                precipitation, due to warmer ocean waters.
                
                                you can visit this site for more knownledge about Global Warming. https://news.un.org/en/story/2007/02/207742#:~:text=The%20report%20describes%20an%20accelerating%20transition%20to%20a,Arctic%20ice%2C%20and%20rising%20global%20average%20sea%20levels.
                """);
        Thread.sleep(8000);
        System.out.println();
            Scanner input=new Scanner(System.in);

            System.out.println("""
                    Question 1.
                    The world’s average surface temperature has increased by around ________ over the past 100 years (1906 - 2005) 
                    1. 100°C
                    2. 0.74°C
                    3. 700°C
                    4. 0.50°C
                    """);
        System.out.print("Option: ");
            int a=input.nextInt();
            if (a==2){pass++;}else {failed++;}

        System.out.println("""
                    Question 2.
                    The best estimates for sea-level ______ due to ocean expansion and glacier melt by the end of the century
                    1. Rises
                    2. drops
                    3. stable
                    4. falls
                    """);
        System.out.print("Option: ");
        int b=input.nextInt();
        if (b==1){pass++;}else {failed++;}

        System.out.println("""
                Question 3.
                The extent of Arctic sea ice has already shrunk by about 2.7 per cent per decade since ________, with the summer minimum declining by about 7.1 per cent per decade.
                    1. 1966
                    2. 1990
                    3. 2000
                    4. 1978
                """);
        System.out.print("Option: ");
        int c=input.nextInt();
        if (c==4){pass++;}else {failed++;}

        System.out.println("""
                Question 4.
                The average freezing date for rivers and lakes in the Northern Hemisphere over the past 150 years has
                 arrived later by some __________, while the average break-up date has arrived earlier by 6.5 days per century.
                    1. 5 days per century
                    2. 5.8 days per century
                    3. 2 days per decades
                    4. 10.5 days per century
                """);
        System.out.print("Option: ");
        int d=input.nextInt();
        if (d==2){pass++;}else {failed++;}


        System.out.println("""
                Question 5.
                It is “very likely” that the upward trend in hot extremes and heat waves will continue. The duration and
                intensity of drought has increased over wider areas since the _______, particularly in the tropics and subtropics.
                    1. 2024s
                    2. 1860s
                    3. 2000s
                    4. 1970s
                """);
        System.out.print("Option: ");
        int e=input.nextInt();
        if (e==4){pass++;}else {failed++;}

        Thread.sleep(2500);

        System.out.println("You have come to the end of the quiz. This is your result");
        System.out.println();
        switch (pass){
            case 5:
                System.out.println("""
                        Excellent 🥳🥳🥳
                        
                        You score"""+" "+pass);break;

            case 4:
                System.out.println("""
                        Very good
                        
                        You score"""+" "+pass);break;
            default:
                System.out.println("""
                        Time to brush up on your knowledge of global warming
                        
                        You score"""+" "+pass);break;
        }

    }
}
