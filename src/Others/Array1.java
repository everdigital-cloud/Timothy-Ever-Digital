package Others;
public class Array1 {
    public static void main(String[] args) {

        int[][] numbers = {
                {1,2,3},
        {4,5,6}
        };
        for (int counter=0;counter<numbers.length;counter++){
            for (int counter2=0;counter2<numbers[counter].length;counter2++){
                System.out.print(numbers[counter][counter2]);
            }
            System.out.println();
        }


    }
}