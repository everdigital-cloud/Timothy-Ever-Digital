package Chapter10;

public abstract class ThreeDimensionalShape extends Shape{
    public ThreeDimensionalShape(String shapeName){
        super(shapeName);
    }
    public abstract double area();
    public abstract double volume();

}
