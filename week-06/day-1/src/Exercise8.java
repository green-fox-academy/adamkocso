import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise8 {

  public static void main(String[] args) {

    List<Character> characters = Arrays.asList('h', 'e', 'l', 'l', 'o');

    String word = characters.stream()
            .map(c -> c.toString())
            .collect(Collectors.joining());

    System.out.println(word);
  }
}
