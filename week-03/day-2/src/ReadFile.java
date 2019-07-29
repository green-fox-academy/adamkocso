import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadFile {

    public List<String> readFile(String filename){
        try {
            Path filepath = Paths.get(filename);
            List<String> lines = Files.readAllLines(filepath);
            return lines;
        } catch (Exception ex){
            System.out.println("File does not exist!");
        }
        return null;
    }
}
