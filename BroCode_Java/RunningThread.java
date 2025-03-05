public class RunningThread implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread is interrupted!!");
            }

            if (i == 5) {
                System.out.println("Time's Up!!");
                System.exit(0); // Initiates the Runtime##shutdown shutdown sequence of the Java Virtual Machine
            }
        }
    } // Runs this operation
    // runs any operation on a seperate thread
}