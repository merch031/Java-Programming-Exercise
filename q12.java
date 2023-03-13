public class Main {
    public static void main(String[] args){

    //Chapter 1 Question 1.12

    /*
    (Average speed in kilometers)
    Assume that a runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds.
    Write a program that displays the average speed in kilometers per hour.
    (Note 1 mile is equal to 1.6 kilometers.)
     */

        double distanceKm = 24 * 1.6;
        double timeHr = ((100*60+35)/3600);

        System.out.println("The runner's average speed in Km/Hour is: " + distanceKm/timeHr + " Km/Hr");

    /*
    // Method Below includes using inputs

    import java.util.Scanner;

        public class AverageSpeed {
            public static void main(String[] args) {


        // get input values
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in miles: ");
        double distanceMiles = input.nextDouble();

        System.out.print("Enter time in hours: ");
        int timeHours = input.nextInt();

        System.out.print("Enter time in minutes: ");
        int timeMinutes = input.nextInt();

        System.out.print("Enter time in seconds: ");
        int timeSeconds = input.nextInt();

        // calculate average speed in kilometers per hour
        double distanceKilometers = distanceMiles * 1.6;
        double totalTimeHours = timeHours + timeMinutes/60.0 + timeSeconds/3600.0;
        double averageSpeedKph = distanceKilometers / totalTimeHours;

        // output the result
        System.out.println("Average speed: " + averageSpeedKph + " kilometers per hour");
    */
        
    }
}