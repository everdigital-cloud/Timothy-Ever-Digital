package Chapter10;

public class Circle extends TwoDimensionalShape {
    private double radius;
    public Circle(String shapeName, double radius){
        super(shapeName);
        if (radius<=0.0){
            throw new IllegalArgumentException("radius should be > 0.0");
        }
        this.radius =radius;
    }

    public void setRadius(double radius) {
        if (radius <=0.0){
            throw new IllegalArgumentException("radius should be > 0.0");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return Math.PI*(Math.pow(getRadius(), 2));
    }

    @Override
    public String toString() {
        return String.format("%s%s: %.2f%n%s: %.2f%n", super.toString(),"Length: ", getRadius(),"Area " ,area());
    }
}
