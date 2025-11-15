package Chapter4;
public class While {
    public static void main(String[] args) {
        int i=1;
        while (i<=30){
            int j=1;
            while (j<=30){
                System.out.print(i*j+"\t");
                j++;
            }
            System.out.println();
            i++;
        }


    }
}
