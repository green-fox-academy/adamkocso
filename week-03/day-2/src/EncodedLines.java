import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EncodedLines {

    public static void main(String[] args) {
        writeFiles("encoded-lines.txt");
    }

    public static List<String> decryption(String filename){
        ReadFile readFile = new ReadFile();
        List<String> lines = readFile.readFile(filename);
        List<String> unicodeChars = decryptionKey();
        List<String> decryptedLines = new ArrayList<>();
        String decryptedLine = "";

        for (int i = 0; i < lines.size(); i++) {
            for (int j = 0; j < lines.get(i).length(); j++) {
                if(lines.get(i).charAt(j) == ' '){
                    decryptedLine += lines.get(i).charAt(j);
                } else if (unicodeChars.contains(lines.get(i).substring(j, j+1))){
                    decryptedLine += unicodeChars.get(unicodeChars.indexOf(lines.get(i).substring(j,j+1)) - 1);
                }
            }
            decryptedLines.add(decryptedLine);
            decryptedLine = "";
        }
        return decryptedLines;
    }

    public static List<String> decryptionKey(){
        ReadFile readFile = new ReadFile();
        List<String> unicode = readFile.readFile("unicode.txt");
        List<String> unicodeChars = new ArrayList<>();
        for (int i = 0; i < unicode.size(); i++) {
            unicodeChars.add(unicode.get(i).substring(unicode.get(i).length() - 1));
        }
        return unicodeChars;
    }

    public static void writeFiles(String filename){
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
