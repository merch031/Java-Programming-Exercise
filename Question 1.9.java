class question01pt9 {
    public static void main(String[] args){

    //Chapter 1 Question 1.9

    /*
    objective:
    (Area and perimeter of a rectangle)
    Write a program that displays the area and perimeter
    of a rectangle with a width of 4.5 and a height of 7.9
    using the following formula: (area = width * height)
    */

    double width = 4.5;
    double height = 7.9;

    double area = width * height;

    System.out.println("The area of a rectangle with a width of 4.5 and" +
            " a height of 7.9 = " + area);
        System.out.println("The perimeter of a rectangle with an area of " + area + " = " + (2 * area));
    }
}
