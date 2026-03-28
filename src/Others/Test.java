package Others;

public class Test {
    public static void main(String[] args) {
moves(0);
    }
    private static void moves(int move){
        int newRow=3;
        int newColum=4;
        int []horizontal=new int[8];
        for (int counter=0;counter<horizontal.length;counter++) {
            horizontal[0] = 2;
            horizontal[1] = 1;
            horizontal[2] = -1;
            horizontal[3] = -2;
            horizontal[4] = -2;
            horizontal[5] = -1;
            horizontal[6] = 1;
            horizontal[7] = 2;

        int []vertical=new int[8];
        for (counter=0;counter<vertical.length;counter++) {
            vertical[0] = 2;
            vertical[1] = 1;
            vertical[2] = -1;
            vertical[3] = -2;
            vertical[4] = -2;
            vertical[5] = -1;
            vertical[6] = 1;
            vertical[7] = 2;
            System.out.println(vertical[counter]);
            System.out.println();
            System.out.println(horizontal[counter]);
        }

        }
    }

}
