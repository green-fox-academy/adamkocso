import javax.print.attribute.HashAttributeSet;
import java.util.HashMap;

public class ProductDatabase {

    public static void main(String[] args) {

        HashMap<String, Integer> productHash = new HashMap<>();

        productHash.put("Eggs", 200);
        productHash.put("Milk", 200);
        productHash.put("Fish", 400);
        productHash.put("Apples", 150);
        productHash.put("Chicken", 550);

        howMuch(productHash, "Fish");
        System.out.println(mostExpensive(productHash));
        System.out.println(averagePrice(productHash));
        System.out.println(belowThePrice(productHash, 300));
        canIGetFor(productHash, 125);
        System.out.println(cheapestProduct(productHash));
    }

    public static void howMuch(HashMap<String, Integer> input, String product) {
        System.out.println(input.get(product));
    }

    public static int mostExpensive(HashMap<String, Integer> input) {
        int max = 0;
        for (String key : input.keySet()) {
            if (input.get(key) > max) {
                max = input.get(key);
            }
        }
        return max;
    }

    public static int averagePrice(HashMap<String, Integer> input) {
        int sum = 0;
        for (String key: input.keySet()) {
            sum += input.get(key);
        }
        int average = sum / input.size();
        return average;
    }

    public static int belowThePrice(HashMap<String, Integer> input, int number) {
        int counter = 0;
        for (String key: input.keySet()) {
            if (number > input.get(key)) {
                counter ++;
            }
        }
        return counter;
    }

    public static void canIGetFor(HashMap<String, Integer> input, int price) {
            if (input.containsValue(price)) {
                System.out.println("Yes we can.");
            } else {
                System.out.println("No we can't.");
            }
    }

    public static int cheapestProduct(HashMap<String, Integer> input) {
        if (input.isEmpty()) {
            return 0;
        }
        int cheapest = mostExpensive(input);
        for (String key : input.keySet()) {
            if(cheapest > input.get(key)) {
                cheapest = input.get(key);
            }
        }
        return cheapest;
    }

}
