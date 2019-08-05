import java.util.Arrays;


public class Exercise6 {

  public static void main(String[] args) {

    String word = "adfHldEdLsLssObj";
    String[] letters = word.split("");


    Arrays.stream(letters)
            .filter(w -> Character.isUpperCase(w.charAt(0)))
            .forEach(System.out::println);
  }
}
