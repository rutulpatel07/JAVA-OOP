public class pr1_8 {
    public static void main(String[] args) {
        
        double celsius = Double.parseDouble(args[0]);

        double fahrenheit = (celsius*1.8) + 32;

        System.out.println("Fahrenheit: "+ fahrenheit);
    }
    
}
