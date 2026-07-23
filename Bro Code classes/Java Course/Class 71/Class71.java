// Final Project - Building an alarm clock

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Class71{
    public static void main(String[] args){

        // Important! Check "AlarmClock.java" for context!

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        String filepath = "alarm sound.wav";

        while(alarmTime == null){
            try{
                System.out.print("Enter an alarm time (hours:minutes:seconds): ");
                String inputTime = scanner.nextLine();

                alarmTime = LocalTime.parse(inputTime, formatter);
                System.out.println("Alarm set for " + alarmTime);
            }
            catch(DateTimeParseException e){
                System.out.println("Invalid format. Please use HH:MM:SS.");
            }
        }

        AlarmClock alarmClock = new AlarmClock(alarmTime, filepath, scanner);

        Thread alarmThread = new Thread(alarmClock);
        alarmThread.start();
        
    }
}