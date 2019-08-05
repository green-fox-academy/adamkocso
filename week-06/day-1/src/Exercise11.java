import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class Exercise11 {
  public static void main(String[] args) {
    String wiki = "src/wiki.txt";
    try {
      Arrays.stream(String.join(" ", Files.readAllLines(Paths.get(wiki))).split(" "))
              .map(word -> word.toLowerCase())
              .map(word -> (word.endsWith(".") || word.endsWith("-") || word.endsWith(",")) ?
                      word.substring(0, word.length() - 1) : word)
              .filter(w -> w.length() > 0)
              .collect(Collectors.groupingBy(word -> word, Collectors.counting()))
              .entrySet().stream()
              .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
              .limit(100)
              .forEach(System.out::println);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}