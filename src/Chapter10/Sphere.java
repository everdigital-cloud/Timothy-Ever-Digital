package Chapter10;

public class Sphere extends ThreeDimensionalShape {
    private double radius;
    public Sphere(String shapeName, double radius){
        super(shapeName);
        if (radius<=0.0){
            throw new IllegalArgumentException("radius should be > 0.0");
        }
        this.radius=radius;
    }

    public void setRadius(double radius) {
        if (radius<=0.0){
            throw new IllegalArgumentException("radius should be > 0.0");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return 4*Math.PI*(Math.pow(getRadius(),2));
    }

    @Override
    public double volume() {
        return (4.0/3)*Math.PI*(Math.pow(getRadius(), 3));
    }

    @Override
    public String toString() {
        return String.format("%s%n%s: %.2f%n%s: %.2f%n%s: %.2f", super.toString(), "Radius", getRadius(), "Area", area(), "Volume", volume());
    }
}
