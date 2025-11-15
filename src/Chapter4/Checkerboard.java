package Chapter4;

public class Checkerboard {
    public static void main(String[] args) {
        int i = 1;
        while (i <=8) {
            int j=1;
            while(j<=8) {
                System.out.print("*");
                System.out.print("  ");
                j++;
            }
            System.out.println();
            i++;
        }

    }
}

//        while(x==8){
//            System.out.print("* ");
//            while(x>8) {
//                System.out.print(" ");

//            System.out.println();




