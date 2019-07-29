import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Births {

    public static void main(String[] args) {
        System.out.println(mostCommonBirth("births.csv"));
    }


    public static List<String> readFile(String filename) {
        try {
            Path filePath = Paths.get(filename);
            List<String> lines = Files.readAllLines(filePath);
            return lines;
        } catch (Exception ex) {
            System.out.println("File does not exist!");
        }
        return null;
    }


    public static HashMap<String, Integer> birthsYearsCounter(String filename) {
        List<String> lines = readFile(filename);
        HashMap<String, Integer> birthsFrequency = new HashMap<>();

        for (int i = 0; i < lines.size(); i++) {
            String[] splitedLines = lines.get(i).split(";");
            if (birthsFrequency.containsKey(splitedLines[1].substring(0, 4))) {
                birthsFrequency.put(splitedLines[1].substring(0, 4), birthsFrequency.get(splitedLines[1].substring(0, 4)) + 1);
            } else {
                birthsFrequency.put(splitedLines[1].substring(0, 4), 1);
            }
        }
        return birthsFrequency;
    }


    public static String mostCommonBirth(String filename){
        HashMap<String, Integer> birthsFrequency = birthsYearsCounter(filename);
        int max = 0;
        List<String> mostCommonYears = new ArrayList<>();
//        Random rnd = new Random();

        for (String year: birthsFrequency.keySet()) {
            if(max < birthsFrequency.get(year)){
                max = birthsFrequency.get(year);
            }
        }

        for (String year: birthsFrequency.keySet()) {
            if(max == birthsFrequency.get(year)){
                mostCommonYears.add(year);
            }
        }
//        return mostCommonYears.get(rnd.nextInt(mostCommonYears.size()));
        return mostCommonYears.get((int)(Math.random() * mostCommonYears.size()));
    }
}
