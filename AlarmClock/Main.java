package AlarmClock;

import java.time.DateTimeException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        String filePath = "sampleAudio.wav";

        while (alarmTime == null) {
            try {
                System.out.print("Enter an alarm time (HH:mm:ss) -> ");
                String inputTime = sc.nextLine();

                alarmTime = LocalTime.parse(inputTime, formatter);
                System.out.println("Alarm set for " + alarmTime);
            } catch (DateTimeException e) {
                System.out.println("Please enter a valid date & time!!!");
            }
        }

        AlarmClock alarmClock = new AlarmClock(alarmTime, filePath, sc);
        Thread alarmThread = new Thread(alarmClock);
        alarmThread.start();
    }
}
