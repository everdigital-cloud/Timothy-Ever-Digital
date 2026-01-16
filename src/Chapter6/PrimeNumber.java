package Chapter6;

public class PrimeNumber {
    public static void main(String[] args) {
        /*
        (Prime Numbers) A positive integer is prime if it’s divisible by only 1 and itself. For exam
ple, 2, 3, 5 and 7 are prime, but 4, 6, 8 and 9 are not. The number 1, by definition, is not prime.
a) Write a method that determines whether a number is prime.
         */
        int testNumbers=0;
        for (int number=1;number<=10_000;number++) {
            if (isPrime(number)) {
                testNumbers++;
                System.out.println(number + " is a prime number");
            }
        }
        System.out.println("Test number is "+testNumbers);
    }
    private static boolean isPrime(int number) {
       int testNumbers=(int)Math.sqrt(number);
        //int testNumbers=number/2;
       for (int i=2;i<=testNumbers;i++) {
           if (number % i == 0) {
               return false;
           }
       }
        return true;
    }
}
