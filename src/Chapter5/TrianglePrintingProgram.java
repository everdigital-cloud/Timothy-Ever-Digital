package Chapter5;

public class TrianglePrintingProgram {
    public static void main(String[] args) {
        //(Triangle Printing Program) Write an application that displays the following patterns sep
        //arately, one below the other. Use for loops to generate the patterns. All asterisks (*) should be print
        //ed by a single statement of the form System.out.print('*'); which causes the asterisks to print side
        // by side. A statement of the form System.out.println(); can be used to move to the next line. A
        // statement of the form System.out.print(' '); can be used to display a space for the last two pat
        //terns. There should be no other output statements in the program. [Hint: The last two patterns re
        //quire that each line begin with an appropriate number of blank spaces.]



        System.out.println("(A)");
        for (int g = 1; g<= 10; g++) {
            for (int h = 1; h<= g; h++) {
                System.out.print(" *");

            }
            System.out.println();
        }
        System.out.println("(B)");
        for (int i = 1; i <= 10; i++) {
            for (int j = 10; j >= i; j--) {
                System.out.print(" *");


            }
            System.out.println();
        }

        System.out.println("(C)");
        for (int k=1; k<=10; k++){
            for (int l=1; l<=k; l++){
                System.out.print("  ");
            }

            for (int m=k; m<=10; m++){
                System.out.print("* ");
            }

            System.out.println();


        }
        System.out.println("(D)");
        for (int n=1; n<=10; n++){
            for (int o=n; o<=10; o++){
                System.out.print("  ");
            }
            for (int p=1; p<=n; p++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
