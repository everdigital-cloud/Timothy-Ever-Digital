package Chapter6;
import java.util.Scanner;
public class DistanceBetweenPoints {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        /*
        (Distance Between Points) Write method distance to calculate the distance between two
points (x1, y1) and (x2, y2). All numbers and return values should be of type double. Incorporate
this method into an application that enables the user to enter the coordinates of the points.
         */
        System.out.print("""
                Enter the coordinate in this format, (x1 y1) and (x2 y2)
                """);
        int x1= input.nextInt();int y1= input.nextInt();int x2= input.nextInt();int y2= input.nextInt();
        System.out.println("The distance between them is "+distance(x1,y1,x2,y2));
    }
    private static double distance(int x1, int y1, int x2, int y2){
       double distance=Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
       return distance;
    }
}
