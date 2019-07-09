// Write a function that is able to manipulate a file
// By writing your name into it as a single line
// The file should be named "my-file.txt"
// In case the program is unable to write the file,
// It should print the following error message: "Unable to write file: my-file.txt"

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {

    public static void main(String[] args) {

        fileWriting("c:/Users/Hp i7 Pro/Desktop/my-fle.txt");

    }

    public static void fileWriting (String filename) {
        List<String> content = new ArrayList<>();
        content.add("Kocso Adam");
        try {
            Path filePath = Paths.get(filename);
            if (Files.exists(filePath)) {
                Files.write(filePath, content);
            } else {
                throw new Exception("fails");
            }
        } catch (Exception ex) {
            System.out.println("Unable to write file: my-file.txt");
        }
    }

}
