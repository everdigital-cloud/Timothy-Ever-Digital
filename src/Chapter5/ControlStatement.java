package Chapter5;

public class ControlStatement {
    public static void main(String[] args) {
        // Describe in general how you’d remove any continue statement from a loop in a program
        // and replace it with some structured equivalent. Use the technique you develop here to remove the
        // continue statement from the program in Fig.5.14.

        for (int count = 1; count <= 4; count++) {
            System.out.printf("%d ", count);
                //continue;
        }

            for (int count=6; count<=10; count++) {


                System.out.printf("%d ", count);
            }


        System.out.printf("%nUsed continue to skip printing 5%nBut now modified with structured statement");

    }
}
