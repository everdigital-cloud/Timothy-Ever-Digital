package Chapter10;

public class ShapeTest {
    public static void main(String[] args) {
        Square square=new Square("Square", 5,6);
        System.out.println(square);
        Circle circle=new Circle("Circle",5);
        System.out.println(circle);
        Triangle triangle=new Triangle("Triangle", 5, 6);
        System.out.println(triangle);
        Cube cube=new Cube("Cube", 6);
        System.out.println(cube);
        Tetrahedron tetrahedron=new Tetrahedron("Tetrahedron",6);
        System.out.println(tetrahedron);

        Shape[] shapes=new Shape[]
    }
}
