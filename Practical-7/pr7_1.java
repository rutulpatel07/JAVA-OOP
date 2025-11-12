/* 1. Write a Java program to implement thread using a runnable interface */

// Aim: Create a thread using Runnable and show basic work + blocking (sleep)
class Task implements Runnable {
    @Override
    public void run() {
        // life-cycle: RUNNABLE -> RUNNING -> TIMED_WAITING (during sleep) -> TERMINATED
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " -> step " + i);
            try { Thread.sleep(300); } catch (InterruptedException e) { /* end early */ }
        }
        System.out.println(Thread.currentThread().getName() + " finished.");
    }
}

public class pr7_1 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Task(), "Worker-1"); // Creating thread from Runnable
        t.start();                                     // moves to RUNNABLE
        t.join();                                      // wait till it completes
        System.out.println("Main thread done.");
    }
}
