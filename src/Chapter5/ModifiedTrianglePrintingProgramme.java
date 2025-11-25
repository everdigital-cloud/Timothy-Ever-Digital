package Chapter5;

public class ModifiedTrianglePrintingProgramme {
    public static void main(String[] args) {



                for (int g = 1; g<= 10; g++) {
                    for (int h = 1; h<= g; h++) {
                        System.out.print(" *");

                    }
                    System.out.print("           ");


                    for (int j = 10; j >= g; j--) {
                        System.out.print(" *");


                    }
                    System.out.print("  ");



                        for (int l = 1; l <= g; l++) {
                            System.out.print("  ");
                        }

                        for (int m = g; m <= 10; m++) {
                            System.out.print("* ");
                        }
                        System.out.print("  ");


                            for (int o = g; o <= 10; o++) {
                                System.out.print("  ");
                            }
                            for (int p = 1; p <= g; p++) {
                                System.out.print("* ");
                            }
                            System.out.println();

                        }
                    }
                }
