/* 3. Write a Java program to set priorities of thread. */

// Note: Priority is a hint to the scheduler; output order is NOT guaranteed.
class PriorityTask implements Runnable {
    @Override public void run() {
        Thread t = Thread.currentThread();
        for (int i = 1; i <= 5; i++) {
            System.out.println(t.getName() + " [priority " + t.getPriority() + "] -> " + i);
            try { Thread.sleep(150); } catch (InterruptedException e) {}
        }
    }
}

public class pr7_3 {
    public static void main(String[] args) throws InterruptedException {
        Thread low  = new Thread(new PriorityTask(), "LOW");
        Thread norm = new Thread(new PriorityTask(), "NORM");
        Thread high = new Thread(new PriorityTask(), "HIGH");

        low.setPriority(Thread.MIN_PRIORITY);   // 1
        norm.setPriority(Thread.NORM_PRIORITY); // 5
        high.setPriority(Thread.MAX_PRIORITY);  // 10

        low.start(); norm.start(); high.start();
        low.join(); norm.join(); high.join();
        System.out.println("Priority demo done.");
    }
}
