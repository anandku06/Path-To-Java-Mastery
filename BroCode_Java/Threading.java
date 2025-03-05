import java.util.Scanner;

public class Threading {
    public static void main(String[] args) {
        // Threading -> allows program to run multiple tasks simultaneously
        // helps improve performance with time-consuming operations
        // (File I/O, network communications, or any background tasks)

        // how to create a Thread
        // Opt1 -> Extend the Thread class
        // Opt2 -> Implement the Runnable interface

        // now the program is on Main Thread
        Scanner sc = new Scanner(System.in);

        // making the instance of the counting class
        RunningThread counting = new RunningThread();

        Thread thread = new Thread(counting);
        thread.setDaemon(true); // Marks this thread as either a daemon or non-daemon thread. when main thread ends this thread ends as well
        thread.start(); // Schedules this thread to begin execution. The thread will execute
        // independently of the current thread.

        // for(int i = 0; i < 5; i++){
        // try {
        // Thread.sleep(1000);
        // } catch (InterruptedException e) {
        // System.out.println("Thread is interrupted!!");
        // }

        // if(i == 5){
        // System.out.println("Time's Up!!");
        // }
        // }
        // transferring this to another thread

        System.out.println("You have 5 seconds to enter your name!!");
        System.out.print("Enter your name -> ");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
        // here the problem is that the 5 seconds count is going on the Main thread so,
        // Java is waiting for completion of the loop then its executing the name prompt
        // solution is to make a seperate thread for counting

        sc.close();
    }
}
