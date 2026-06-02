package Chapter8;
import java.util.EnumSet;
public class FoodTest {
    public static void main(String[] args) {
        System.out.println("All food");

//
//        for (Food food:Food.valueOf()){
//            System.out.printf("%-10s %-45s%s%n",food, food.getFoodType(), food.getCalories());
//        }
        System.out.printf("%nDisplay a range of enum constants:%n");
        for (Food food: EnumSet.range(Food.APPLE, Food.CARROT)){
            System.out.printf("%-10s%-45%s%n", food, food.getFoodType(), food.getCalories());
        }
    }
}
