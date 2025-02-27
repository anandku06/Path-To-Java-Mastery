import java.util.TimerTask;
import java.util.Timer;
public class TimerExample {
    public static void main(String[] args) {
        // Timer -> class that schedules tasks at specific times or periodically
        // useful for: sending notifications, scheduled updates, repetitive actions
        // TimerTask -> represents the task that will be executed by the Timer
        // you will extend the TimerTask class to define your task
        // create a subclass of TimerTask and @Override run()

        // created the Timer class
        Timer timer = new Timer(); 

        // creating the TimerTask class and using the anonymous class we override the run method
        TimerTask task = new TimerTask() {
            int count = 3;

            @Override
            public void run(){
                System.out.println("Hello after every 2 seconds!!");
                count--;

                if(count <= 0){
                    System.out.println("Task is completed!!");
                    timer.cancel(); // Terminates this timer, discarding any currently scheduled tasks
                }
            }
        };

        // timer.schedule(task, 2000); // scheduling this task to execute after 3 seconds
        // takes three params -> one is the task to perform, second is the delay and third is the period after which the task is repeated forever
        timer.schedule(task, 1000, 2000); // scheduling this task to execute after every 2 seconds periodically
    }
}
