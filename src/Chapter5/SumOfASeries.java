package Chapter5;

public class SumOfASeries {
    public static void main(String[] args) {
        //Find the summation of the sequence of numbers 1, 2, 3 … n, where
        // n ranges from 1 to 100. Use type long. Display the results in a tabular format that shows n and the
        // corresponding sum. If this were a product instead of a sum, what difficulty might you encounter
        // with the variable that accumulates the product?
        long n=1;
        long sum=0;
        while (n<=100){
            sum+=n;
            System.out.printf("%-3d          %-5d", n,sum);
            System.out.println();
            n++;
        }
    }
}
