package Chapter10;

public abstract class ThreeDimensionalShape extends Shape{
    public ThreeDimensionalShape(String shapeName){
        super(shapeName);
    }
    public abstract double getArea();
    public abstract double getVolume();

}
