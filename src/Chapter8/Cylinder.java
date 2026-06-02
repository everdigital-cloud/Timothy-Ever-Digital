package Chapter8;
public class Cylinder {
    private double radius=1;
    private  double height=1;
    public Cylinder(double radius, double height){
        this.radius=radius;
        this.height=height;
    }

    public void setRadius(double radius){
       if (radius<0){
throw new IllegalArgumentException(
   "radius was out of range");
       }
       this.radius=radius;
    }
    public void setHeight(double height){
        if (height<0){
            throw new IllegalArgumentException("height was out of range");
        }
        this.height=height;
    }
    public double getRadius(){return radius;}
    public double getHeight(){return height;}

    public double volume() {
        double volume=Math.PI*(radius*radius)*height;
        return volume;

    }


}

