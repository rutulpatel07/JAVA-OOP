/* 4. Write a Java program to display all running threads. */

// Shows how to list active threads using getAllStackTraces().keySet()
class ShortJob implements Runnable {
    @Override public void run() {
        try { Thread.sleep(500); } catch (InterruptedException e) {}
    }
}

public class pr7_4 {
    private static void printAllThreads() {
        System.out.println("---- All Running Threads ----");
        for (Thread t : Thread.getAllStackTraces().keySet()) {
            System.out.println("Name: " + t.getName()
                    + ", Id: " + t.getId()
                    + ", State: " + t.getState()
                    + ", Daemon: " + t.isDaemon());
        }
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) throws InterruptedException {
        // Start a couple of short jobs so there's something to list
        Thread t1 = new Thread(new ShortJob(), "Job-1");
        Thread t2 = new Thread(new ShortJob(), "Job-2");
        t1.start(); t2.start();

        printAllThreads(); // includes main thread, GC, and our jobs

        t1.join(); t2.join();
        System.out.println("Listing complete.");
    }
}
