package Chapter3;

import java.util.Scanner;
public class CarApplication{
    public static void main(String[] args){

        Car car1=new Car("Tesla", "2025", 60_000.00);
        Car car2=new Car("Mercedes", "2024", 200_000.00);

        System.out.printf("%s %s Model, price is $%.2f%n", car1.getModel(), car1.getYear(), car1.getPrice());
        System.out.printf("%s %s Model, price is $%.2f%n ", car2.getModel(), car2.getYear(), car2.getPrice());


        System.out.println("DISCOUNT PRICE");

        System.out.printf("%s %s Model, discount price is $%.2f%n", car1.getModel(), car1.getYear(), car1.getDiscount1());
        System.out.printf("%s %s Model, discount price is $%.2f%n", car2.getModel(), car2.getYear(), car2.getDiscount2());


    }

}
