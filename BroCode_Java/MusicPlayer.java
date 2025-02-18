import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream; // represents a stream of audio data that can be read and processed.

import javax.sound.sampled.AudioSystem; // AudioSystem is a class that provides access to the system's audio resources.
// getAudioInputStream(File file) is a static method that takes an audio file (like WAV, AIFF, AU, or MP3) as input.

import javax.sound.sampled.Clip; // The Clip interface represents a special kind of data line whose audio data can be loaded prior to playback, instead of being streamed in real time.
import javax.sound.sampled.Line;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineUnavailableException; // A LineUnavailableException is an exception indicating that a line cannot be opened because it is unavailable

import javax.sound.sampled.UnsupportedAudioFileException; // exception when the file's format is not supported

public class MusicPlayer {
    public static void main(String[] args) {
        // how to play audio files with Java (.wav, .au. aiff)

        String filePath = "sampleAudio.wav";

        File file = new File(filePath);

        // try...resources can accept multiple resources
        try (Clip clip = AudioSystem.getClip();
                Scanner sc = new Scanner(System.in);
                AudioInputStream audio = AudioSystem.getAudioInputStream(file)) {
            // used to get the audio from the File object
            // only supports .wav, .au, .aiff files

            // Clip clip = AudioSystem.getClip(); // Obtains a clip that can be used for
            // playing back an audio file or an
            // audio stream

            clip.open(audio); // load audio data from an AudioInputStream into a Clip so that it can be
                              // played.
            System.out.println("Audio is Playing...");
            String res = "";

            while (!res.equals("Q")) {
                System.out.println("P: Play");
                System.out.println("S: Stop");
                System.out.println("R: Reset");
                System.out.println("Q: Quit");

                System.out.print("Enter your choice -> ");
                res = sc.next().toUpperCase();

                switch(res){
                    case "P" -> clip.start(); // used to start the playing of the audio
                    case "S" -> clip.stop(); // used to stop the audio
                    case "R" -> clip.setMicrosecondPosition(0); // sets the position of the elapsed audio time to the desired microseconds
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice!!");
                }
            }

            // using the event Listeners approach
            // clip.addLineListener(event -> {
            // if (event.getType() == LineEvent.Type.STOP) {
            // System.out.println("Audio is finished!!");
            // clip.close();
            // }
            // });

            // using the Thread approach
            // Thread.sleep(clip.getMicrosecondLength() / 1000); // pauses the execution of the main program till the audio
                                                              // is playing

        } catch (LineUnavailableException | UnsupportedAudioFileException | IOException e) {
            System.out.println(e);
        } finally {
            System.out.println("Now playing!!");
        }
    }
}
