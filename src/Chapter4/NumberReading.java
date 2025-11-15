package Chapter4;
import java.util.Scanner;
public class NumberReading {
    public static void main(String[] args) {

//(Reading numbers until a specified sum) Write an application that asks for a number from
//the user and then keeps reading integer values from the user until the sum of those integers equals
//or becomes greater than the value that was input in the beginning.
Scanner input=new Scanner(System.in);
int sum=0;
int count=1;
System.out.println("Enter a number: ");
int limit=input.nextInt();

while(count<=limit){

    System.out.println("Enter another number: ");
    int number=input.nextInt();
     sum+=number;
     count++;
}
System.out.println("The total sum is " +sum);
    }
}