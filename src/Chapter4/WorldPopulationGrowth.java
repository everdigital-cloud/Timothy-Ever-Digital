package Chapter4;

public class WorldPopulationGrowth {
    public static void main(String[] args) {

        /*
        Get estimates for the current world population and its growth rate (the percentage by
 which it’s likely to increase this year). Write a program that calculates world population growth
 each year for the next 75 years, using the simplifying assumption that the current growth rate will stay
 constant. Print the results in a table. The first column should display the year from year 1 to year
 75. The second column should display the anticipated world population at the end of that year.
 The third column should display the numerical increase in the world population that would occur
 that year. Using your results, determine the year in which the population would be double what it
 is today, if this year’s growth rate were to persist
         */

        double population = 8_249_000_000.0;
        double rate = 0.836;
        int totalPrint = 75;
        int year = 1;
        double populationGrowth=population;
        System.out.println("YEAR       WORLD POPULATION       POPULATION INCREACE" + "\t");

        while (year<= totalPrint) {

            population += population*rate;
            populationGrowth+=population;

//            if (population >= population * 2) {
//                System.out.print("*");
                System.out.printf("%d            %.2f               %.2f%n", year, population, populationGrowth);
                year++;
            }
        }
    }


