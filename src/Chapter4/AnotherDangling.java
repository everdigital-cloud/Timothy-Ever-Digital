package Chapter4;

public class AnotherDangling {
    public static void main(String[] args) {
//        int x =1;
//        int y=1;
//
//        if (x < 10) {
//            if (y > 10) {
//                System.out.println("*****");
//            } else {
//                System.out.println("#####");
//                System.out.println("$$$$$");
//            }
//        }

//        if (x < 10) {
//            if (y > 10) {
//                System.out.println("*****");
//            } else {
//                System.out.println("#####");
//                System.out.println("$$$$$");
//            }
//        }
//        //(a)
//        int x=5;
//        int y=8;
//        if (y == 8) {
//            if (x == 5)
//                System.out.println("@@@@@");
//        }else {
//            System.out.println("#####");
//        }
//            System.out.println("$$$$$");
//
//        System.out.println("&&&&&");

        //(b)
//        int x=5;
//        int y=8;
//        if (y == 8) {
//            if (x == 5) {
//                System.out.println("@@@@@");
//            }
//        }else {
//            System.out.println("#####");
//
//            System.out.println("$$$$$");
//
//            System.out.println("&&&&&");
//        }
//        //(c)
//        int x = 5;
//        int y = 8;
//        if (y == 8) {
//            if (x == 5) {
//                System.out.println("@@@@@");
//            }
//        } else {
//            System.out.println("#####");
//        System.out.println("$$$$$");
//    }
//
//        System.out.println("&&&&&");

        //(d)
        int x = 5;
        int y = 7;
        if (y == 8) {
            if (x == 5) {
                System.out.println("@@@@@");
            }
        } else {
            System.out.println("#####");
            System.out.println("$$$$$");
            System.out.println("&&&&&");
        }
    }
}
