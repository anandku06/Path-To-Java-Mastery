package AlarmClock;

import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class AlarmClock implements Runnable {
    private final LocalTime alarmTime;
    private final String filePath;
    private final Scanner sc;

    AlarmClock(LocalTime alarmTime, String filePath, Scanner sc) {
        this.alarmTime = alarmTime;
        this.filePath = filePath;
        this.sc = sc;
    }

    @Override
    public void run() {
        while (LocalTime.now().isBefore(this.alarmTime)) {
            try {
                LocalTime now = LocalTime.now();
                Thread.sleep(1000);

                int hours = now.getHour();
                int minutes = now.getMinute();
                int seconds = now.getSecond();

                System.out.printf("\r%02d:%02d:%02d", hours, minutes, seconds);
                // \r -> carriage return : moves the cursor back to the beginning
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted!!");
            }
        }

        System.out.println("\nAlarm NOISES!!");
        playSound(filePath);
    }

    private void playSound(String filePath) {
        File audioFile = new File(filePath);
        try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            clip.loop(5);

            System.out.print("Press *Enter* to stop the alarm: ");
            sc.nextLine();
            clip.stop();

            sc.close();

        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException e) {
            System.out.println(e);
        }
    }
}
