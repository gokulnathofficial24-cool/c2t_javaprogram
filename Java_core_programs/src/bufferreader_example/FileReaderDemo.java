package bufferreader_example;
import java.io.*;
import java.net.URL;
import java.nio.file.Paths;

public class FileReaderDemo {
    public static void main(String[] args) throws Exception {
        // Use the class loader to get the resource URL for the file in the same package
        URL resource = FileReaderDemo.class.getResource("data.txt");

        // Check if the resource URL is null (file not found)
        if (resource == null) {
            System.err.println("File not found");
            return;
        }

        // Convert URL safely to a File
        File file = Paths.get(resource.toURI()).toFile();

        // Create a FileReader object to read the file
        FileReader fileReader = new FileReader(file);

        // Create a BufferedReader object to wrap the FileReader
        BufferedReader reader = new BufferedReader(fileReader);

        // Variable to hold each line read from the file
        String line;

        // Read the file line by line
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        reader.close();
    }
}
