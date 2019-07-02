import java.util.ArrayList;
import java.util.Arrays;

public class ListIntroductionTwo {

    public static void main(String[] args) {

        ArrayList<String> listA = new ArrayList<>();

        listA.add("Apple");
        listA.add("Avocado");
        listA.add("Blueberries");
        listA.add("Durian");
        listA.add("Lychee");

        ArrayList<String> listB = new ArrayList<>(listA);

        System.out.println(listA.contains("Durian"));

        listB.remove("Durian");

        listA.add(4, "Kiwifruit");

        System.out.println(listA.size() == listB.size());

        System.out.println(listA.indexOf("Avocado"));

        System.out.println(listB.indexOf("Durian"));

        listB.addAll(Arrays.asList("Passion fruit", "Pomelo"));

        System.out.println(listA.get(2));

    }
}
