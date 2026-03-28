package Chapter7;
import java.util.Arrays;
import java.util.Scanner;
public class AirlineReservationsSystem {
    public static void main(String[] args) {
        /*
        A small airline has just purchased a computer for its new au
tomated reservations system. You’ve been asked to develop the new system. You’re to write an ap
plication to assign seats on each flight of the airline’s only plane (capacity: 10 seats).
Your application should display the following alternatives: Please type 1 for First Class and
Please type 2 for Economy. If the user types 1, your application should assign a seat in the first
class section (seats 1–5). If the user types 2, your application should assign a seat in the economy
section (seats 6–10). Your application should then display a boarding pass indicating the person’s
seat number and whether it’s in the first-class or economy section of the plane.
Use a one-dimensional array of primitive type boolean to represent the seating chart of the
plane. Initialize all the elements of the array to false to indicate that all the seats are empty. As
each seat is assigned, set the corresponding element of the array to true to indicate that the seat is
no longer available.
Your application should never assign a seat that has already been assigned. When the economy
section is full, your application should ask the person if it’s acceptable to be placed in the first-class
section (and vice versa). If yes, make the appropriate seat assignment. If no, display the message
"Next flight leaves in 3 hours."
         */
        System.out.println("********* AIRLINE RESERVATIONS SYSTEM*********");

        Scanner input = new Scanner(System.in);

        int[] seat = new int[10];
        int economyPosition = 1;
        int firstClassPosition = 1;
            for (int counter = 0; counter < seat.length/2; counter++) {

                System.out.println("Please type 1 for first class");
                System.out.println("Please type 2 for Economy");
                int choice = input.nextInt();
                if (choice == 1) {
                    System.out.println("...SEAT NUMBER " + (firstClassPosition) + "...");
                    System.out.println("...FIRST CLASS SECTION..." + "\n");
                    firstClassPosition++;
//                    if (firstClassPosition>=6){
//                        break;
//                    }
                } else if (choice == 2) {
                    System.out.println("...SEAT NUMBER " + (economyPosition) + "...");
                    System.out.println("...ECONOMY SECTION..." + "\n");
                    economyPosition++;
                    if (economyPosition>=6){
                        break;
                    }

                } else {
                    System.out.println("Wrong Option");
                }

                while (economyPosition > seat.length / 2) {
                    System.out.println("Economy section is full, will you go for first class section? type 1 for yes or 2 for no");
                    int secondChoice1 = input.nextInt();
                    if (secondChoice1 == 2) {
                        System.out.println("Next flight leaves in 3 hours.");
                    } else {
                        // if (firstClassPosition < 5) {
                        System.out.println("...SEAT NUMBER " + (firstClassPosition) + "...");
                        System.out.println("...FIRST CLASS SECTION..." + "\n");
                        firstClassPosition++;
                        if (firstClassPosition > 6) {
                            break;
                        }
                    }
                }

                while (firstClassPosition > seat.length / 2) {
                    System.out.println("First Class section is full, will you go for economy section? type 1 for yes or 2 for no");
                    int secondChoice2 = input.nextInt();
                    if (secondChoice2 == 2) {
                        System.out.println("Next flight leaves in 3 hours.");
                    } else {
                        // if (economyPosition < 5) {
                        System.out.println("...SEAT NUMBER " + (economyPosition) + "...");
                        System.out.println("...ECONOMY SECTION..." + "\n");
                        economyPosition++;
                        if (economyPosition > 5) {
                            break;
                        }


                    }
                }

            }
        System.out.println("No more space!");
    }
}