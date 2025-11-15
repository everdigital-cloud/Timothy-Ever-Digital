package Chapter5;

public class SelfReviewExercises {
    public static void main(String[] args) {
        /*
        5.3(a) Sum the odd integers between 1 and 99, using a for statement. Assume that the integer
 variables sum and count have been declared.
         */

/*
        int sum=0;
        int count;

        for (count=1;count<=100;count++){
            if (count%2!=0)
                sum+=count;
        }
        System.out.println(sum);
         */

        /*
        5.3(b) Calculate the value of 2.5 raised to the power of 3, using the pow method.
        */

//        5.3(c) Print the integers from 1 to 20, using a while loop and the counter variable i. Assume
//        that the variable i has been declared, but not initialized. Print only five integers per line.
// [Hint: Use the calculation i % 5. When the value of this expression is 0, print a newline
//        character; otherwise, print a tab character. Assume that this code is an application. Use
//        the System.out.println() method to output the newline character, and use the Sys
//        tem.out.print('\t') method to output the tab character.]
/*
int i=1;
while(i<=20){
    System.out.print(i+"\t");
    if (i%5==0){
        System.out.println();
    }
i++;
}
*/
        // d) Repeat part (c), using a for statement.
        int i;

        for (i = 1; i <= 20; i++) {
               System.out.print(i);

               if (i % 5 == 0) {
                      System.out.println();
                   }
               else {
                      System.out.print('\t');
                   }
             }

        /*

        for (int i=1; i<=20; i++){
            System.out.print(i+"\t");
            if (i%5==0){
                System.out.println();
            }
        }

         */
      //  Find the error in each of the following code segments, and explain how to correct it:
        //a)
       /* int i = 1;
         while (i <= 10){
             System.out.println(i);
             ++i;
             }
         */
      //  b)
       /*   for (double k = 0.1; k <= 1.0; k+=0.1) {

            System.out.printf("%,.1f%n",k);
             }

        */
        /*
        //int n=10;
         switch ("n") {
               case "a":
                      System.out.println("The number is 1");
                      break;
                   case "n":
                      System.out.println("The number is 2");
                     break;
               default:
                      System.out.println("The number is not 1 or 2");
                      break;
             }

         */


 /*

        double x=2.5;
        int y=3;
        System.out.printf("%.2f",Math.pow(2.5,3));
*/

       // b) The following code should print whether an integer value is negative or zero:
       /*
        switch (value) {
            Case value < 0:
            System.out.println("Negative");
            case 0:
                System.out.println("Zero");
        }
*/

        //Find and correct the error(s) in each of the following segments of code:
 /*(a)
       int i;
        for (i = 1; i <= 10; i++){
            System.out.println(i);
        }

  */
//b) The following code should print whether an integer value is negative or zero:
/* switch (value) {
  Case value < 0:
   System.out.println("Negative");
  case 0:
   System.out.println("Zero");
   }

 */

    }
}
