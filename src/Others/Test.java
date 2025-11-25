package Others;

public class Test {
    public static void main(String[] args) {

        double amountInDouble=10.99;
        int  amountInInteger=(int)(amountInDouble*100+0.5);
        int dollar=amountInInteger/100;
        int cents=amountInInteger%100;
        System.out.printf("%d:%02d",dollar, cents);
    }
}