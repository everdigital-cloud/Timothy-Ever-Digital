package Chapter4;

public class JavaStatement {
    public static void main(String[] args){
//        (Write a Java statement) What will be the value of x after executing the following Java
//        statement? Assume that value of x is 5 before the execution.

        int x=5;

        x += x++ - 5;
        System.out.println(x);

    }
}
