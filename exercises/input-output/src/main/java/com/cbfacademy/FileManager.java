package com.cbfacademy;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.io.Reader;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.LineNumberReader;



public class FileManager {

    //PART 1

    //returns a `List<String>` object, where each list item is a line from the specified file
    
    /*
    
    public List<String> readFile(String filename) throws IOException{

        List<String> lines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))){

            String line;

            while ((line = br.readLine()) != null) {

                lines.add(line);

            }
        }

        return lines;
    }



/*copies the contents of a text file at the path defined by 
`inputFile` to the path defined by `outputFile`. 
Creates `outputFile` if it doesn't exist and overwrites it, if it does */

/* 
    public void copy(String inputFile, String outputFile) throws IOException{

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;

            while ((line = reader.readLine()) != null) {

                writer.write(line);
                writer.newLine();
            }
        }
       

    }
END OF PART 1 */


//PART 2 WITH java.nio.* improvements 

    // Reads a file and returns a String list where each item is a line from the file
    public List<String> readFile(String filename) throws IOException {

        // Create a Path object for the file location
         Path filePath = Path.of(filename);

        // Read all lines from the file
        List<String> lines = Files.readAllLines(filePath);

        // Return the list containing lines from the file
        return lines;
    }

    // Copies the content of an input file to an output file
    public void copy(String inputFile, String outputFile) throws IOException {

        // Create Path objects for source (input) and destination (output) files
        Path sourcePath = Path.of(inputFile);
        Path destinationPath = Path.of(outputFile);

        // Create parent directories for the destination file if they don't exist
        if (!Files.exists(destinationPath.getParent())) {

            Files.createDirectories(destinationPath.getParent());
        }

        // Copy the content from source file to destination file
        Files.copy(sourcePath, destinationPath, java.nio.file.StandardCopyOption.REPLACE_EXISTING);
    }
}