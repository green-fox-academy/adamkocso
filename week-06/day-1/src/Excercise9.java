import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Excercise9 {

  public static void main(String[] args) {
    String word = "hello";
    String[] letters = word.split("");

//    Arrays.stream(letters).collect(Collectors.groupingBy(l -> l.charAt(0), Collectors.counting()));

    System.out.println(Arrays.stream(letters).collect(Collectors.groupingBy(l -> l.charAt(0), Collectors.counting())));
  }
}
