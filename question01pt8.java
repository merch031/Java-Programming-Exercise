public class question01pt8 {
    public static void main(String[] args){

    //Chapter 1 Question 1.8

    /*
    objective:
    (Area and perimeter of a circle)
    Write a program that displays the area and perimeter of a circle
    that has a radius of 5.5 using the following formulas:
    (perimeter = 2 * radius * pi) and (area = radius * radius * pi)
    */

    double pi = Math.PI;
    double radius = 5.5;

    double area = radius * radius * pi;
    double perim = 2 * radius * pi;

    System.out.println("area of the circle = " + area);
    System.out.println("perimeter of the circle = " + perim);

    }
}
