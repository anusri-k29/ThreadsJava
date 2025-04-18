// PrintingOperation.java
public class PrintingOperation extends Thread {

    // Thread logic to print letters A to E
    public void run() {
        for (char ch = 'A'; ch <= 'E'; ch++) {
            System.out.println("Printing: " + ch);
            try {
                Thread.sleep(500); // Pause for 500ms
            } catch (InterruptedException e) {
                System.out.println("PrintingOperation interrupted.");
            }
        }
    }
}
