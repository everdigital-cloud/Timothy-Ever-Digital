package Chapter5;

public class DiamondPrinting {
    public static void main(String[] args) {
//        int numberOfMiddleLine = 9;
//        int halfOfMiddleLine = numberOfMiddleLine / 2;
//        for (int row = 0; row <= halfOfMiddleLine; row++) {
//            int spaces = halfOfMiddleLine - row;
//            int asteriks = 2 * row + 1;
//
//            for (int space = 0; space < spaces; space++)
//                System.out.print(" ");
//            for (int a = 0; a < asteriks; a++)
//                System.out.print("*");
//
//            System.out.println();
//        }
//
//        for (int row = halfOfMiddleLine - 1; row >= 0; row--) {
//            int spaces = halfOfMiddleLine - row;
//            int asteriks = 2 * row + 1;
//
//            for (int s = 0; s < spaces; s++)
//                System.out.print(" ");
//            for (int a = 0; a < asteriks; a++)
//                System.out.print("*");
//            System.out.println();
//
//        }

        int n=9;
        int m=n/2;
        int j=1;

        for (int i = 4; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print("s ");
            }
            System.out.println();
        }


        for (int b = 1; b <= 9 - 2; b += 2) {
            for (int c = 1; c <= b; c++) {
                System.out.print("* ");

                //System.out.println();
            }
            System.out.println();
        }

    }
}


