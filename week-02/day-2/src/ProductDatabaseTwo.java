import java.util.HashMap;

public class ProductDatabaseTwo {

    public static void main(String[] args) {

        HashMap<String, Integer> productHash = new HashMap<>();

        productHash.put("Eggs", 200);
        productHash.put("Milk", 200);
        productHash.put("Fish", 400);
        productHash.put("Apples", 150);
        productHash.put("Chicken", 550);

        lessThan(productHash, 201);
        moreThan(productHash, 150);

    }

    public static void lessThan(HashMap<String, Integer> input, int price) {
        for (String key : input.keySet()){
            if (price > input.get(key)) {
                System.out.println(key);
            }
        }
    }

    public static void moreThan(HashMap<String, Integer> input, int price) {
        for (String key : input.keySet()){
            if (price < input.get(key)) {
                System.out.println(key + " : " + input.get(key));
            }
        }
    }
}
