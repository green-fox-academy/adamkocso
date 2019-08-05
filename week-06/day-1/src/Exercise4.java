import java.util.Arrays;
import java.util.List;


public class Exercise4 {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

   double average = numbers.stream()
           .filter(number -> number % 2 != 0)
           .mapToDouble(number -> number)
           .average()
           .getAsDouble();


    System.out.println(average);
  }
}
