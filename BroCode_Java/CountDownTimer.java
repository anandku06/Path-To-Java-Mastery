import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class CountDownTimer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Timer timer = new Timer();
        System.out.print("Enter the countdown timer: ");
        int time = sc.nextInt();
        TimerTask task = new TimerTask() {
            int count = time;
            @Override
            public void run(){
                System.out.println(count);
                count--;
                if(count < 0){
                    System.out.println("Happy New Year!!");
                    timer.cancel();
                }
            }
        };

        timer.scheduleAtFixedRate(task, 0, 1000); // Schedules the specified task for repeated fixed-rate execution, beginning after the specified delay
    }
}
