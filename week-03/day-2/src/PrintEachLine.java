// Write a program that opens a file called "my-file.txt", then prints
// each line from the file.
// If the program is unable to read the file (for example it does not exist),
// then it should print the following error message: "Unable to read file: my-file.txt"

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args) {
        try {
            Path filepath = Paths.get("c:/Users/Hp i7 Pro/Desktop/my-file.txt");
            List<String> lines = Files.readAllLines(filepath);
            System.out.println(lines.get(0));
        } catch (Exception ex) {
            System.out.println("Unable to read file: my-file.txt");
        }
    }



}
