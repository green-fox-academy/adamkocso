import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TicTacToe {


    public static void main(String[] args) {
        System.out.println(ticTacResult("tictactoe.txt"));
    }


    public static List<String> readFile(String filename){
        try{
            Path filepath = Paths.get(filename);
            List<String> lines = Files.readAllLines(filepath);
            return lines;
        } catch (Exception ex) {
            System.out.println("Unable to read the file!");
        }
        return null;
    }

    public static String ticTacResult(String filename){
        List<String> lines = readFile(filename);
        if(counter(lines, 'O')){
            return "O";
        } else if(counter(lines, 'X')){
            return "X";
        } else {
            return "Draw";
        }
    }



    public static boolean counter(List<String> lines, char n){
        String match = "";
        for (int i = 0; i < lines.size(); i++) {
            match+= n;
        }
        int lineCounter = 0;
        int diagonalCounter = 0;
        int backDiagonalCounter = 0;
        for (int i = 0; i < lines.size(); i++) {
            for (int j = 0; j < lines.size(); j++) {
                if (lines.get(j).charAt(i) == n){
                    lineCounter++;
                    if(lineCounter == 3){
                        return true;
                    }
                }
                if(lines.get(j) == match){
                    return true;
                }
            }
            lineCounter = 0;
            if (lines.get(i).charAt(i) == n){
                diagonalCounter++;
            }
            if (lines.get(i).charAt(lines.size() -1 - i) == n){
                backDiagonalCounter++;
            }
            if(diagonalCounter == 3 || backDiagonalCounter == 3){
                return true;
            }
        }
        return false;
    }
}
