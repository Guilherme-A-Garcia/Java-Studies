// DateTime - Working with date and time

import java.time.Instant;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Class62 {
    public static void main(String[] args){
        // How to work with dates & times using Java
        // (LocalDate, LocalTime, LocalDateTime, UTC Timestamp)

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        // To retrieve both date and time, use LocalDateTime:
        LocalDateTime dateTime = LocalDateTime.now();

        // To use UTC time, use an Instant object:
        Instant instant = Instant.now();

        // System.out.println(date);
        // System.out.println(time);
        // System.out.println(dateTime);
        System.out.println(instant);

        // Custom format:
        // Since we already have a dateTime object, I'm not going to create a new one.
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newDateTime = dateTime.format(formatter);
        System.out.println(newDateTime);

        // Custom DateTime/LocalDateTime object
        // LocalDate localDate = LocalDate.of(2024, 12, 25);
        // System.out.println(localDate);
        LocalDateTime localDate1 = LocalDateTime.of(2025, 12, 25, 12, 0, 0);
        System.out.println(localDate1);
        LocalDateTime localDate2 = LocalDateTime.of(2025, 1, 1, 0, 0, 0);
        System.out.println(localDate2);

        // Comparing dates
        if(localDate1.isBefore(localDate2)){
            System.out.println(localDate1 + " is earlier than " + localDate2);
        }
        else if(localDate1.isAfter(localDate2)){
            System.out.println(localDate1 + " is later than " + localDate2);
        }
        else if(localDate1.isEqual(localDate2)){
            System.out.println(localDate1 + " is equal to " + localDate2);
        }
        
    }
}
