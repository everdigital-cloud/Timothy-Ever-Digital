package Chapter8;

public enum Food {
    APPLE("fruit", 95),
    BANANA("fruit",105),
    CARROT("vegetable",32);
 private final String foodType;
 private final int calories;
 Food(String foodType,int calories){
     this.foodType=foodType;
     this.calories=calories;
 }

    public String getFoodType(){
     return foodType;
 }
 public int getCalories(){
     return calories;
 }

}
