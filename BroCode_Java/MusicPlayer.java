import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream; // represents a stream of audio data that can be read and processed.

import javax.sound.sampled.AudioSystem; // AudioSystem is a class that provides access to the system's audio resources.
// getAudioInputStream(File file) is a static method that takes an audio file (like WAV, AIFF, AU, or MP3) as input.

import javax.sound.sampled.Clip; // The Clip interface represents a special kind of data line whose audio data can be loaded prior to playback, instead of being streamed in real time.

import javax.sound.sampled.LineUnavailableException; // A LineUnavailableException is an exception indicating that a line cannot be opened because it is unavailable

import javax.sound.sampled.UnsupportedAudioFileException; // exception when the file's format is not supported

public class MusicPlayer {
    public static void main(String[] args) {
        // how to play audio files with Java (.wav, .au. aiff)

        String filePath = "sampleAudio.wav";

        File file = new File(filePath);

        try(AudioInputStream audio = AudioSystem.getAudioInputStream(file)) {
            // used to get the audio from the File object

            Clip clip = AudioSystem.getClip(); // Obtains a clip that can be used for playing back an audio file or an audio stream

            clip.open(audio); // load audio data from an AudioInputStream into a Clip so that it can be played.

            System.out.println("No problems till!!");

        } catch (LineUnavailableException | UnsupportedAudioFileException | IOException e) {
           System.out.println(e);
        }
    }
}
