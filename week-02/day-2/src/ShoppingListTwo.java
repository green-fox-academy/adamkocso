import com.sun.org.apache.xpath.internal.axes.HasPositionalPredChecker;
import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.HashMap;

public class ShoppingListTwo {

    public static void main(String[] args) {

        HashMap<String, Double> productPrices = new HashMap<>();
        HashMap<String, Integer> bobsList = new HashMap<>();
        HashMap<String, Integer> alicesList = new HashMap<>();

        productPrices.put("Milk", 1.07);
        productPrices.put("Rice", 1.59);
        productPrices.put("Eggs", 3.14);
        productPrices.put("Cheese", 12.60);
        productPrices.put("Chicken Breasts", 9.40);
        productPrices.put("Apples", 2.31);
        productPrices.put("Tomato", 2.58);
        productPrices.put("Potato", 1.75);
        productPrices.put("Onion", 1.10);

        bobsList.put("Milk", 3);
        bobsList.put("Rice", 2);
        bobsList.put("Eggs", 2);
        bobsList.put("Cheese", 1);
        bobsList.put("Chicken Breasts", 4);
        bobsList.put("Apples", 1);
        bobsList.put("Tomato", 2);
        bobsList.put("Potato", 1);

        alicesList.put("Rice", 1);
        alicesList.put("Eggs", 5);
        alicesList.put("Chicken Breasts", 2);
        alicesList.put("Apples", 1);
        alicesList.put("Tomato", 10);

        System.out.println("Bob's shopping list total costs: " + bobTotalPay(productPrices, bobsList));
        System.out.println("Alice's shopping list total costs: " + bobTotalPay(productPrices, alicesList));

        whoBuysMore(alicesList, bobsList, "Rice");
        whoBuysMore(alicesList, bobsList, "Potato");

        differentProducts(alicesList, bobsList);

        moreProducts(alicesList, bobsList);


    }

    public static double bobTotalPay (HashMap<String, Double> productsList, HashMap<String, Integer> personalList) {
        double sum = 0.0;
        for (String key : productsList.keySet()) {
            if (productsList.containsKey(key) == personalList.containsKey(key)) {
                sum += productsList.get(key) * personalList.get(key);
            }

        }
        return sum;
    }

    public static void whoBuysMore (HashMap<String, Integer> aliceList, HashMap<String, Integer> bobList, String item) {

        if (aliceList.containsKey(item) != false && bobList.containsKey(item) != false) {
            if (aliceList.get(item) > bobList.get(item)) {
                System.out.println("Alice buys more " + item.toLowerCase() + '.');
            } else if (aliceList.get(item) < bobList.get(item)) {
                System.out.println("Bob buys more " + item.toLowerCase() + '.');
            }
        } else {
            System.out.println(item + " can't be found on both list.");
        }
    }

    public static void differentProducts (HashMap<String, Integer> aliceList, HashMap<String, Integer> bobList) {
        if (aliceList.size() > bobList.size()) {
            System.out.println("Alice has more different items on her list.");
        } else {
            System.out.println("Bob has more different items on his list.");
        }
    }

    public static void moreProducts (HashMap<String, Integer> aliceList, HashMap<String, Integer> bobList) {
        int sumAlice = 0;
        int sumBob = 0;
        for (String keyAlice : aliceList.keySet()) {
            sumAlice += aliceList.get(keyAlice);
        }
        for (String keyBob : bobList.keySet()) {
            sumBob += bobList.get(keyBob);
        }
        if (sumAlice > sumBob) {
            System.out.println("Alice has more piece of items.");
        } else {
            System.out.println("Bob has more piece of items.");
        }

    }
}
