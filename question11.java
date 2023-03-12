public class question11 {
    public static void main(String[] args){

    // Chapter 1 Question 1.11

    /*
    Objective:
    (Population projection)
    The U.S. Census Bureau projects population based on the following assumptions:
    -One birth every 7 seconds
    -One death every 13 seconds
    -One new immigrant every 45 seconds
    Write a program to display the population for each of the next five years.
    Assume that the current population is 312,032,486, and one year has 365 days.
    Hint: In Java, if two integers perform division, the result is an integer.
    The fractional part is truncated.
    For example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5).
    To get an accurate result with the fractional part, one of the values
    involved in the division must be a number with a decimal point.
    For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
    */

    long population = 312032486L;
    long secondsPerYr = 60L * 60L * 24L * 365L;
    long birthsPerYr = secondsPerYr / 7L;
    long deathsPerYr = secondsPerYr / 13L;
    long immigrantsPerYr = secondsPerYr / 45L;
    long calc = secondsPerYr - deathsPerYr + immigrantsPerYr;

    System.out.println("If the current population is " + population + "and there is one" +
            " birth every 7 seconds, one death every 13 seconds, and one immigrant" +
            " every 45 seconds the population will be:");
    System.out.println("After one year: " + (population + calc));

    //Help to figure out how to do the next 4 calculations

    System.out.println("After two years: " + (population + calc));
    System.out.println("After three years: " + (population + calc));
    System.out.println("After four years: " + (population + calc));
    System.out.println("After five years: " + (population + calc));


    }
}
