package Chapter10;

public abstract class  Shape {
    private final String shapeName;
    public Shape(String shapeName){
        this.shapeName=shapeName;
    }
    public String getShapeName(){
        return shapeName;
    }
    public String toString(){
        return String.format("%s: %s%n", "Shape name", getShapeName());
    }
}
