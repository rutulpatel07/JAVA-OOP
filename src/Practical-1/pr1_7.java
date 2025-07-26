public class pr1_7 {
    public static void main(String[] args) {
        //1. Area of Triangle
        double base = Double.parseDouble(args[0]);
        double height = Double.parseDouble(args[1]);

        double area = 0.5 *base*height;

        System.out.println("Area of Triangle: "+ area);

        //2. Perimeter of a rectangle

        double length = Double.parseDouble(args[2]);
        double breadth = Double.parseDouble(args[3]);

        double perimeter = 2*(length+breadth);

        System.out.println("Perimeter of a Rectangle: "+ perimeter);

    }
}
