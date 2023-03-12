class question01pt7 {
    public static void main(String[] args){

    //Chapter 1 Question 1.7

    /*
    objective:
    (Approximate pi)
    pi can be computed using the following formula:
    pi = 4 x (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ...)

    Write a program that displays the result of:
    4 x (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11) and 4 x (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13).

    Use 1.0 instead of 1 in your program.
    */

    double resultOne = (4 * (1.0 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11));
    System.out.println("4 * (1.0 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11) = " + resultOne);

    double resultTwo = (4 * (1.0 - 1.0/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13));
    System.out.println("4 * (1.0 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13) = " + resultTwo);

    }
}
