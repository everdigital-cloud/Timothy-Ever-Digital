package Chapter10;

public class Tetrahedron extends ThreeDimensionalShape{
    private double length;
    public Tetrahedron(String shapeName, double length){
        super(shapeName);
        if (length<=0.0){
            throw new IllegalArgumentException("length should be > 0.0");
        }
        this.length=length;
    }

    public void setLength(double length) {
        if (length<=0.0){
            throw new IllegalArgumentException("length should be > 0.0");
        }
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double getArea() {
        return (Math.pow(3, 1.0/2))*(Math.pow(length,2));
    }

    @Override
    public double getVolume() {
        return (Math.pow(length, 3))/((6)*Math.pow(2.0, 1.0/2));
    }

    @Override
    public String toString() {
        return String.format("%s%s: %.2f%n%s: %.2f%n%s: %.2f%n",super.toString(), "Length", getLength(), "Area", getArea(), "Volume", getVolume());
    }
}
