package Chapter5;

public class PythagoreanTriples {
    public static void main(String[] args) {

        // A right triangle can have sides whose lengths are all integers. The set
        // of three integer values for the lengths of the sides of a right triangle is called a Pythagorean triple.
        // The lengths of the three sides must satisfy the relationship that the sum of the squares of two of the
        // sides is equal to the square of the hypotenuse. Write an application that displays a table of the
        // Pythagorean triples for side1, side2 and the hypotenuse, all no larger than 500. Use a triple-nested
        // for loop that tries all possibilities. This method is an example of “brute-force” computing. You’ll
        // learn in more advanced computer-science courses that for many interesting problems there’s no
        // known algorithmic approach other than using sheer brute force.
     int side1=1;
     int side2=2;
     int hypotenuse=1;

     if  {

         for (side1 = 1; side1 <= 500; side1++) {
             side1 = (int) Math.pow(((hypotenuse * hypotenuse) - (side2 * side2)), (0.5));
             for (side2 = 1; side2 <= 500; side2++) {
                 side2 = (int) Math.pow(((hypotenuse * hypotenuse) - (side1 * side1)), (0.5));
                 for (hypotenuse = 1; hypotenuse <= 500; hypotenuse++) {
                     hypotenuse = (int) Math.pow(((side1 * side1) + (side2 * side2)), (0.5));
                 }
             }
         }
     }
            side1++;
        }



}
