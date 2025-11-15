package Chapter4;
public class TabularOutput {
    public static void main(String[] args) {
//        int rows = 5;
//        int columns = 4;
//
//        int number = 1;
//        System.out.println("N"\t"N2"\t"N3"\t"N4"\t"");
//        while (number <= rows) {
//            int multiplier = 1;
//            int multiple = number;
//            while (multiplier <= columns) {
//                System.out.print(multiple + "     ");
//                multiple = multiple * number;
//                multiplier++;
//            }
//            System.out.println();
//            number++;
//        }
        int rows=5;
        int columns =4;

        int number=1;
        System.out.println("N   N2  N3  N4");
        while(number<=rows){
            int multiplier=1;
            int multiple=number;
            while(multiplier<= columns) {
                System.out.print(multiple + "\t");
                multiple = multiple * number;
                multiplier++;
            }

                System.out.println();
                number++;
            }

    }
}




