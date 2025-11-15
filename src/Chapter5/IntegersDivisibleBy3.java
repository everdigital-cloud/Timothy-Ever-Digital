package Chapter5;

public class IntegersDivisibleBy3 {
    public static void main(String[] args) {
        //Write an application that calculates the sum of those integers between
        // 1 and 30 that are divisible by 3.
        int counter=1;
        int sum=0;
        System.out.println("These are the integers divisible by 3 between 1 and 30");
        while (counter<=30) {
            if (counter%3==0){
                sum+=counter;
                System.out.print(" "+counter);
            }

            counter++;
        }
        System.out.println();
        System.out.print("Sum = "+sum);
    }
}
