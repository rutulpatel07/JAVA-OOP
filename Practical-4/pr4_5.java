// 5. Create a class Shape with overloaded methods calculateArea() to find area of circle, square, and rectangle using different arguments.

class Shape {

    double calculateArea(double radius) {
        return 3.1416 * radius * radius;
    }

    double calculateArea(int side) {
        return side * side;
    }

    double calculateArea(double length, double breadth) {
        return length * breadth;
    }

}

public class pr4_5 {
    public static void main(String[] args) {

        Shape shape = new Shape();

        double circleRadius = 5;
        int squareSide = 4;
        double rectLength = 6;
        double rectBreadth = 3;

        System.out.println("Area of Circle (radius " + circleRadius + "): " + shape.calculateArea(circleRadius));
        System.out.println("Area of Square (side " + squareSide + "): " + shape.calculateArea(squareSide));
        System.out.println("Area of Rectangle (length " + rectLength + ", breadth " + rectBreadth + "): "+ shape.calculateArea(rectLength, rectBreadth));

    }
}