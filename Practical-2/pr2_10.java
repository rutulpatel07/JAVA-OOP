// 10. Write a Java program to show widening and narrowing typecasting between int, float, and double.
public class pr2_10 {
    public static void main(String[] args) {
        
        // Widening Typecasting (Implicit Casting)
        int iVal = 100;
        float fVal = iVal;       // int → float
        double dVal = fVal;   // float → double
        
        System.out.println("Widening Typecasting:");
        System.out.println("int value: " + iVal);
        System.out.println("float value (from int): " + fVal);
        System.out.println("double value (from float): " + dVal);
        
        // Narrowing Typecasting (Explicit Casting)
        double dNum = 99.99;
        float fNum = (float) dNum; // double → float
        int iNum = (int) fNum;        // float → int
        
        System.out.println("\nNarrowing Typecasting:");
        System.out.println("double value: " + dNum);
        System.out.println("float value (from double): " + fNum);
        System.out.println("int value (from float): " + iNum);
    }
}
