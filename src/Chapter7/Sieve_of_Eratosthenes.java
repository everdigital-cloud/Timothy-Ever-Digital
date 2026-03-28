package Chapter7;

public class Sieve_of_Eratosthenes {
    public static void main(String[] args) {
boolean []array=new boolean[100];
for (int counter=10;counter<array.length;counter++){
    array[counter]=true;
}
        for (boolean counter : array) {
            System.out.print(counter+"  ");
        }
        
    }
}
