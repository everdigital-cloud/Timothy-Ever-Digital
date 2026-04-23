package Chapter7;
import java.util.Objects;
import java.util.Scanner;
public class Polling {
    public static void main(String[] args) {

        String[] topics = {"Climate change   ", "Deforestation    ", "Water Issue      ", "Waste pollution  ", "Biodiversity loss"};
        int[][] responses = new int[5][10];


       Scanner input=new Scanner(System.in);
        System.out.println("Type stop to stop the survey or any word to continue ");
        String option=input.next();
        System.out.println("Rate these five global environmental issues in relation to social-consciousness from 1 (least important) to 10 (most important)");


        while (!Objects.equals(option, "stop")){
            for (int count = 0; count < topics.length; count++) {
                System.out.print(topics[count] + ": ");
                //Scanner input = new Scanner(System.in);
                int rate = input.nextInt();
                for (int row = 0; row < 1; row++) {
                    for (int column = 0; column < responses[row].length; column++) {
                        if (rate == column + 1) {
                            responses[count][column]++;
                        }
                    }
                }

            }
            System.out.println("Type stop to stop the survey or any word to continue ");
            option=input.next();
        }
        System.out.println();
        System.out.println("---------------------TABULAR REPORT---------------------");
        int index = 0;
        System.out.print("                 ");
        while (index < 10) {
            System.out.printf("%5d", (index + 1));
            index++;
        }
        System.out.println();
for (int row=0;row<responses.length;row++){
    for (row=0;row<topics.length;row++) {
        System.out.printf("%-10s",topics[row]);

        for (int column = 0; column < responses[row].length; column++) {
            System.out.printf("%5d",responses[row][column]);
        }
        System.out.println();
    }

}

    }

}