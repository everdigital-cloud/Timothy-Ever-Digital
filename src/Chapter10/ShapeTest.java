package Chapter10;

public class ShapeTest {
    public static void main(String[] args) {
        Circle circle=new Circle("Circle",5);
       // System.out.println(circle);

        Square square=new Square("Square", 5,6);
       // System.out.println(square);

        Triangle triangle=new Triangle("Triangle", 5, 6);
       // System.out.println(triangle);

        Sphere sphere=new Sphere("Shere",6);
       // System.out.println(sphere);

        Cube cube=new Cube("Cube", 6);
       // System.out.println(cube);

        Tetrahedron tetrahedron=new Tetrahedron("Tetrahedron",6);
        //System.out.println(tetrahedron);

        Shape[] shapes=new Shape[6];
        shapes[0]=circle;
        shapes[1]=square;
        shapes[2]=triangle;
        shapes[3]=sphere;
        shapes[4]=cube;
        shapes[5]=tetrahedron;
        System.out.printf("Shapes processed polymorphically:%n%n");
        for (Shape currentShape:shapes){
           // System.out.println(currentShape);
            if (currentShape instanceof TwoDimensionalShape){
                System.out.println(currentShape);
            }else {
                System.out.println(currentShape);
            }

        }
        for (int j=0;j<shapes.length;j++){
            System.out.printf("Shapes %d is a %s%n", j, shapes[j].getClass().getName());
        }
    }
}
