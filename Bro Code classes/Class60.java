// File Management - Building a music player

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Class60 {
    public static void main(String[] args){
        // (Works with .wav, .au and .aiff)

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the file path to your song of choice: ");
        String filePath = scanner.nextLine();

        File file = new File(filePath);

        // AudioInputStream has a .close() method much like Scanner has one, but try-with-resources
        // does the job just as well.
        try(AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){
            // In simple terms, a Clip is like a music or sound player, it allows you to play
            // and command the audio file as you wish.
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = "";
            while(!response.equals("Q")){
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.print("Enter your choice: ");
                response = scanner.next().toUpperCase();

                switch(response){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice!");
                }
            }
        }
        catch(FileNotFoundException e){
            System.out.println("This file was not found!");
        }
        catch(LineUnavailableException e){
            System.out.println("Unable to access audio resource!");
        }
        catch(UnsupportedAudioFileException e){
            System.out.println("This audio file is not supported!");
        }
        catch(IOException e){
            System.out.println("Something went wrong!");
        }
        finally{
            System.out.println("Closing...");
            scanner.close();
        }
    }
}
