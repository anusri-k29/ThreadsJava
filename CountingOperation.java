// CountingOperation.java
public class CountingOperation implements Runnable {

    // Thread logic to count from 1 to 5
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Counting: " + i);
            try {
                Thread.sleep(400); // Pause for 400ms
            } catch (InterruptedException e) {
                System.out.println("CountingOperation interrupted.");
            }
        }
    }
}
