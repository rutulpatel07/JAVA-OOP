public class pr2_2 {
    public static void main(String[] args) {
        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);
        
        double sum = num1 + num2;
        double diff = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;
        double modulo = num1 % num2;
        
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Modulo: " + modulo);
    }
    
}
