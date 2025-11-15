package Chapter3;
import java.util.Scanner;
public class Calculator {

    Scanner input=new Scanner(System.in);
private int x;
private int y;

public Calculator(int x, int y){
    this.x=x;
    this.y=y;
}
public int getSum(){
    return x+y;
}
public int getDifference(){
    return x-y;
}
public int getProduct(){
    return x*y;
}
public double getDivision(){
    return (double) x/y;
}



}
