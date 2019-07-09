// Write a function that copies the contents of a file into another
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {

    public static void main(String[] args) {

        System.out.println(fileCopy("c:/Users/Hp i7 Pro/Desktop/my-file.txt", "c:/Users/Hp i7 Pro/Desktop/my-copy.txt"));

    }

    public static boolean fileCopy (String filename, String copiedFile) {
        try {
            Path filePath = Paths.get(filename);
            List<String> lines = Files.readAllLines(filePath);
            Path copyPath = Paths.get(copiedFile);
            Files.write(copyPath,lines);
            return true;
        } catch (Exception ex) {
            System.out.println("Unable to copy");
        }
        return false;
    }
}
