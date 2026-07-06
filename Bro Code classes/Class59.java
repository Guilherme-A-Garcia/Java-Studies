// File Management - Reading files

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Class59{
    public static void main(String[] args){
        // There are 3 popular options for reading files in Java:
        // BufferedReader + FileReader: Best for reading text files line-by-line;
        // FileInputStream: Best for binary files (e.g., images, audio files);
        // RandomAccessFile: Best for read/write specific portions of a large file.

        String filepath = "test.txt";

        // We can't create a BufferedReader object without first passing in a reader object.
        try(BufferedReader reader = new BufferedReader(new FileReader(filepath))){
            String line;
            // After all valid iterations, BufferedReader returns null when there's nothing left to be read.
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("The file was not found!");
        }
        catch(IOException e){
            System.out.println("Something went wrong!");
        }
    }
}