import java.util.HashMap;

public class MapIntroductionTwo {

    public static void main(String[] args) {


        HashMap<String, String> bookHash = new HashMap<>();

        bookHash.put("978-1-60309-452-8", "A Letter to Jo");
        bookHash.put("978-1-60309-459-7", "Lupus");
        bookHash.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        bookHash.put("978-1-60309-461-0", "The Lab");

        for (String key : bookHash.keySet()) {
            System.out.println(bookHash.get(key) + " (ISBN: " + key + ")");
        }

        bookHash.remove("978-1-60309-444-3");

        bookHash.values().remove("Tha Lab");


        bookHash.put("978-1-60309-450-4", "They Called Us Enemy");
        bookHash.put("978-1-60309-453-5", "Why Did We Trust Him?");

        System.out.println(bookHash.containsKey("478-0-61159-424-8"));
        System.out.println(bookHash.get("978-1-60309-453-5"));

    }
}
