import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {

    public static void main(String[] args) {
        writeFile("reversed-order.txt");
    }


    public static List<String> decryption(String filename){
        ReadFile readfile = new ReadFile();
        List<String> lines = readfile.readFile(filename);
        List<String> decryptedLines = new ArrayList<>();

        for (int i = 0; i < lines.size(); i++) {
            decryptedLines.add(0,lines.get(i));
        }
        return decryptedLines;
    }

    public static void writeFile(String filename){
        List<String> decryptedLines = decryption(filename);

        try{
            Path filePath = Paths.get(filename);
            if(Files.exists(filePath)){
                Files.write(filePath,decryptedLines);
                System.out.println("The decryption was successful!");
            } else {
                throw new Exception();
            }
        } catch (Exception ex){
            System.out.println("Unable to write the file: " + filename);
        }
    }
}
