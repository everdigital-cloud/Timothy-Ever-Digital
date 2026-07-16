package Chapter10;

public class Triangle extends TwoDimensionalShape{
    private double base;
    private double hight;
    public Triangle(String shapeName, double base, double hight){
        super(shapeName);

        if (base<=0.0){
            throw new IllegalArgumentException("base should be > 0.0");
        }
        this.base =base;
        if (hight<=0.0){
            throw new IllegalArgumentException("hight should be > 0.0");
        }
        this.hight =hight;
    }

    public void setBase(double base) {
        if (base <=0.0){
            throw new IllegalArgumentException("base should be > 0.0");
        }
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setHight(double hight) {
        if (hight <=0.0){
            throw new IllegalArgumentException("hight should be > 0.0");
        }
        this.hight = hight;
    }

    public double getHight() {
        return hight;
    }

    @Override
    public double getArea() {
        return (getBase()/2)* getHight() ;
    }

    @Override
    public String toString() {
        return String.format("%s%s: %.2f%n%s: %.2f%n%s: %.2f%n", super.toString(),"Base: ", getBase(),"Hight: ", getHight(),"Area " , getArea());
    }
}


