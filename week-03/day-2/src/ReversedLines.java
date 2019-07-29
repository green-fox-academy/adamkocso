import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {

    public static void main(String[] args) {
        writeFile("reversed-lines.txt");
    }

    public static List<String> decryption (String filename){
        ReadFile readFile = new ReadFile();
        List<String> lines = readFile.readFile(filename);
        List<String> decryptedLines = new ArrayList<>();
        String decryptedLine = "";

        for (int i = 0; i < lines.size(); i++) {
            for (int j = 0; j < lines.get(i).length(); j++) {
                decryptedLine += lines.get(i).charAt(lines.get(i).length() - 1 - j);
            }
            decryptedLines.add(decryptedLine);
            decryptedLine = "";
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
