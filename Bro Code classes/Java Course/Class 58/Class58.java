// File Management - Writing files

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
// ("io" means input/output.)

public class Class58{
    public static void main(String[] args){
        // There are 4 popular options for writing files in Java:
        // FileWriter = Good for small or medium-sized text files;
        // BufferedWriter = Better performance for large amounts of text;
        // PrintWriter = Best for structured data, like reports or logs;
        // FileOutputStream = Best for binary files (e.g., images, audio files).

        String filePath = "test.txt";
        // String textContent = "I like pizza.\nIt's pretty good!"; 
        // Sure, you can separate lines with a new line character,
        // but it's better to do this for organization:
        String textContent = """ 
                I like pizza.
                It's really good.
                """;
        
        try(FileWriter writer = new FileWriter(filePath)){
            writer.write(textContent);
            System.out.println("File has been written.");
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file location.");
        }
        // General exception
        catch (IOException e) {
            System.out.println("Could not write file.");

        }
    }
}