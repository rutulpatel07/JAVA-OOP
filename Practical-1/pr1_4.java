public class pr1_4 {
    public static void main(String[] args){
        // 1. Speed
        double distance = Double.parseDouble(args[0]);
        double time = Double.parseDouble(args[1]);

        double speed = distance/time;
        System.out.println("Speed: " + speed);

        // 2.Simple Interest

        int p = Integer.parseInt(args[2]);
        int r = Integer.parseInt(args[3]);
        int t = Integer.parseInt(args[4]);

        int interest = (p*r*t) / 100;

        System.out.println("Interest: "+ interest);

        // 3. Volume of Cylinder

        double pi = 3.14159;
        double radius = Double.parseDouble(args[5]);
        double h = Double.parseDouble(args[6]);

        double volume = pi*radius*radius*h;
        System.out.println("Volume: "+ volume);


    }
}
