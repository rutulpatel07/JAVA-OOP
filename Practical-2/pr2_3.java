//3. Write a Java program using switch to display the day of the week when a number (1 to 7) is entered. Example: 1 → Monday, 2 → Tuesday, etc.
public class pr2_3 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);

        switch(a){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
    
}
