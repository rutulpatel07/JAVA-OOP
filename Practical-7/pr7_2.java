/*2. Write a Java program to create multiple threads. */

// Shows two ways: (a) Runnable, (b) Extending Thread
class PrintJob implements Runnable {
    private final String label;
    PrintJob(String label) { this.label = label; }
    @Override public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(label + " (Runnable) -> " + i);
            try { Thread.sleep(200); } catch (InterruptedException e) {}
        }
    }
}

class MyThread extends Thread {
    MyThread(String name) { super(name); }
    @Override public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " (extends Thread) -> " + i);
            try { Thread.sleep(250); } catch (InterruptedException e) {}
        }
    }
}

public class pr7_2 {
    public static void main(String[] args) throws InterruptedException {
        Thread a = new Thread(new PrintJob("A"));
        Thread b = new Thread(new PrintJob("B"));
        MyThread c = new MyThread("C");
        MyThread d = new MyThread("D");

        a.start(); b.start(); c.start(); d.start();
        // Wait for all to finish (good practice)
        a.join(); b.join(); c.join(); d.join();
        System.out.println("All threads finished.");
    }
}
