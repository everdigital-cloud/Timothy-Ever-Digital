package Chapter6;
public class PerfectNumbers {
    public static void main(String[] args) {
        /*
        (Perfect Numbers) An integer number is said to be a perfect number if its factors, including
 1 (but not the number itself), sum to the number. For example, 6 is a perfect number, because 6 =
 1 + 2 + 3. Write a method isPerfect that determines whether parameter number is a perfect number.
 Use this method in an application that displays all the perfect numbers between 1 and 1000. Display
 the factors of each perfect number to confirm that the number is indeed perfect. Challenge the com
puting power of your computer by testing numbers much larger than 1000. Display the results.
         */
        for (int number = 1; number <= 1000000000; number++) {
            if (isPerfect(number)) {
                for (int factor=1;factor<number;factor++) {
                    if (number % factor == 0) {
                        System.out.print(factor + " ");
                    }
                }
                System.out.println();
                System.out.println(number + " is a perfect number");
            }
        }
    }
        private static boolean isPerfect(int number){
            int sum = 0;
            for (int factor = 1; factor < number; factor++) {
                if (number % factor == 0) {

                     sum += factor;
                     sum += factor;
                }
            }
            return sum == number;
        }
    }
