// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {

    public static void main(String[] args) {

        System.out.println(countLines("c:/Users/Hp i7 Pro/Desktop/my-file.txt"));

    }

    public static int countLines(String filename) {
        try {
            Path filepath = Paths.get(filename);
            List<String> numberOfLines = Files.readAllLines(filepath);
            return numberOfLines.size();
        } catch (Exception ex) {
            return 0;
        }
    }
}
