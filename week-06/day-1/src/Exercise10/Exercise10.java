package Exercise10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise10 {

  public static void main(String[] args) {
    List<Fox> foxes = new ArrayList<Fox>();

    foxes.add(new Fox("Vuk", "Green", 4));
    foxes.add(new Fox("Karak", "Red", 12));
    foxes.add(new Fox("Kag", "Red", 10));
    foxes.add(new Fox("Csele", "Green", 5));
    foxes.add(new Fox("Sut", "Yellow", 11));

    System.out.println("Green fox(es):");
    foxes.stream()
            .filter(f -> f.color == "Green")
            .forEach(f -> System.out.println(f.name));

    System.out.println("Less than 5 years old green fox(es):");
    foxes.stream()
            .filter(f -> f.color == "Green" && f.age < 5)
            .forEach(f -> System.out.println(f.name));

    System.out.println("Frequency of foxes by color:");
    System.out.println(
    foxes.stream()
            .collect(Collectors.groupingBy((Fox f) ->f.color, Collectors.counting())));

  }

}
