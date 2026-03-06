package Chapter7;
import java.util.Arrays;

public class JavaStatements {
    public static void main(String[] args) {
        /*
        Write Java statements to accomplish each of the following tasks:
         a) Display the value of the tenth element of array r.
b) Initialize each of the six elements of one-dimensional integer array g to -1.
c) Find the maximum of the first one-hundred elements of floating-point array c.
d) Copy a hundred-element array a into a hundred-element array b, but in reverse order.
e) Compute the product of the third to the tenth elements, both inclusive, in a hundred
element integer array w.
         */
//final int ARRAY_LENGHT=10;
//int[] g =new int[6];
      //  System.out.println(r[9]);
        //for (int counter=0; counter< g.length;counter++){
           //g[counter]=-1;
//Arrays.fill(g,-1);
            //System.out.println(Arrays.toString(g));
           // System.out.println(g[counter]);
       // int[]a=new int[100];
//        for (int counter=0; counter< a.length;counter++){
//            a[counter]=counter+1;
//        }
       // int[]b=new int[100];

//        for (int counter=0;counter<a.length;counter++){
//            int c=1;
//            b[counter]=a[a.length-1-counter];
//            System.out.print(b[counter] +" ");
//        }
        int[]w=new int[100];
        int product=1;
        for (int counter=2;counter<9;counter++) {
            product *=w[counter];
        }
        System.out.println("The product of the third to the tenth element is "+product);

        }
        /*
        double[] c=new double[100];
        for (int counter=0; counter< c.length;counter++){
            c[counter]=counter+1;
        }
        double maximum=c[0];
        for (double max:c){
            if (max>maximum){
                maximum=max;
            }
        }
        System.out.println(maximum);

         */



    }

