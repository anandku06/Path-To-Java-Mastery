public class MultiThreading {
    public static void main(String[] args) {
        // multithreading -> enables a program to run multiple threads concurrently
        // (Thread = A set of instructions that run independently)
        // useful for background tasks or time-consuming operations

        RunningThread2 task = new RunningThread2("Ping"); // this or direct passing this to the Thread constructor
        Thread thread = new Thread(task);
        Thread thread2 = new Thread(new RunningThread2("Pong"));
        // here both the thread runs simultaneously , so it will print the count together
        System.out.println("Game Starts!!");

        thread.start();
        thread2.start();

        try {
            thread.join(); // Waits for this thread to terminate.
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread is interrupted!!!");
        }

        System.out.println("Game Ends!!");
        // here the main thread executes immediately not waiting for the other threads to complete, so using the join method of each thread
        // joining make the thread to wait for the other threads to execute first
    }
}
