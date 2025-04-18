/*
Name: Anusri Kadam
PRN: 23070126016
Batch: SY AIML A1
*/

// Main.java
public class Main {
    public static void main(String[] args) {
        // Creating thread using Runnable
        Thread countingThread = new Thread(new CountingOperation());
        countingThread.start();

        // Creating thread using Thread subclass
        PrintingOperation printingThread = new PrintingOperation();
        printingThread.start();

        // Final message from main thread
        System.out.println("main thread started both threads successfully.");
    }
}
