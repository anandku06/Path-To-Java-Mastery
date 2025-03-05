public class MultiThreading {
    public static void main(String[] args) {
        // multithreading -> enables a program to run multiple threads concurrently
        // (Thread = A set of instructions that run independently)
        // useful for background tasks or time-consuming operations

        RunningThread2 task = new RunningThread2(); // this or direct passing this to the Thread constructor
        Thread thread = new Thread(task);
        Thread thread2 = new Thread(new RunningThread2());
        // here both the thread runs simultaneously , so it will print the count together
        thread.start();
        thread2.start();
    }
}
