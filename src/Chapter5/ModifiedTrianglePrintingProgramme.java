package Chapter5;

public class ModifiedTrianglePrintingProgramme {
    public static void main(String[] args) {


                System.out.println("(A)");
                for (int g = 1; g<= 10; g++) {
                    for (int h = 1; h<= g; h++) {
                        System.out.print(" *");

                    }
                    System.out.println();
                }
                System.out.println("(B)");
                for (int i = 1; i <= 10; i++) {
                    for (int j = 10; j >= i; j--) {
                        System.out.print(" *");


                    }
                    System.out.println();
                }

                System.out.println("(C)");
                for (int k=1; k<=10; k++){
                    for (int l=1; l<=k; l++){
                        System.out.print("  ");
                    }

                    for (int m=k; m<=10; m++){
                        System.out.print("* ");
                    }
                    System.out.println();
                }


                System.out.println("(D)");
                for (int n=1; n<=10; n++){
                    for (int o=n; o<=10; o++){
                        System.out.print("  ");
                    }
                    for (int p=1; p<=n; p++){
                        System.out.print("* ");
                    }
                    System.out.println();
                }
    }
}
