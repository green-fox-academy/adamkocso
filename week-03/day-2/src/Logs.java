// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Logs {
    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();
        try {
            Path filePath = Paths.get("c:/Users/Hp i7 Pro/Desktop/log.txt");
            lines = Files.readAllLines(filePath);
        } catch (Exception ex) {
        }

        System.out.println(Arrays.toString(uniqeIpAddress(lines)));

        getPostRatio(lines);

    }

    public static String[] uniqeIpAddress(List<String> lines) {
        HashSet<String> uniqIp = new HashSet<>();
        for (int i = 0; i < lines.size(); i++) {
            String[] split = lines.get(i).split("   ");
            uniqIp.add(split[1]);
        }

        String[] stringArray = uniqIp.toArray(new String[uniqIp.size()]);
        return stringArray;
    }

    public static void getPostRatio(List<String> lines) {
        int get = 0;
        int post = 0;

        for (int i = 0; i < lines.size(); i++) {
            if (lines.get(i).contains("GET")) {
                get++;
            } else {
                post++;
            }

        }


        double getratio = (double) get / lines.size() * 100;
        double postratio = (double) post / lines.size() * 100;

        System.out.println("Get ratio is " + getratio);
        System.out.println("Post ratio is " + postratio);
    }
}

