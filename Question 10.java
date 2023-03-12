public class question01pt10 {
    public static void main(String[] args){

    // Chapter 1 Question 10

    /*
    Objective:
    (Average speed in miles)
    Assume that a runner runs 14 kilometers in 45 minutes
    and 30 seconds. Write a program that displays the average
    speed in miles per hour.
    (Note 1 mile is equal to 1.6 kilometers.)
    */

    double distanceKm = 14;
    double distanceMi = distanceKm / 1.6;
    double timeRanInMin = 45.5;
    double timeRanInHrs = timeRanInMin / 60;
    double speedMph = distanceMi / timeRanInHrs;
    System.out.println("The average speed in miles per hour is = " + speedMph);

    }
}
