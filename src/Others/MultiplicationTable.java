package Others;

public class MultiplicationTable {
    public static void main(String[] args) {

        int number=1;
        int multiplier=1;
        int row=1;
        int col=1;
        System.out.println("========================================================================START======================================================================");

            while (col <= 12) {
                row = 1;
                number=1;

                while (row <= 12) {
                   System.out.printf("%d x%2d =%3d| ", number, multiplier, number * multiplier);
                    //System.out.print("|  ");
                    number++;
                    row++;
                }
                System.out.println("    ");

                col++;
                multiplier++;
            }
        System.out.print("==========================================================================END======================================================================");
        }

    }

