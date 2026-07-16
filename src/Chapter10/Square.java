package Chapter10;

public class Square extends TwoDimensionalShape{
    private double length;
    private double width;
    public Square(String shapeName, double length, double width){
        super(shapeName);
        if (length<=0.0){
            throw new IllegalArgumentException("length should be > 0.0");
        }
        this.length=length;
        if (width<=0.0){
          throw new IllegalArgumentException("width should be > 0.0");
        }
        this.width=width;
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

    public void setWidth(double width) {
        if (width<=0.0){
            throw new IllegalArgumentException("width should be > 0.0");
        }
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double area() {
        return getLength()*getWidth() ;
    }

    @Override
    public String toString() {
        return String.format("%s%s: %.2f%n%s: %.2f%n%s: %.2f%n", super.toString(),"Length ", getLength(),"Width ", getWidth(),"Area " ,area());
    }
}
