import java.util.ArrayList;

public class ShoppingList {

    public static void main(String[] args) {

        ArrayList<String> shoppingList = new ArrayList<>();

        shoppingList.add("Eggs");
        shoppingList.add("Milk");
        shoppingList.add("Fish");
        shoppingList.add("Apples");
        shoppingList.add("Bread");
        shoppingList.add("Chicken");

        listSearch(shoppingList, "Milk");
        listSearch(shoppingList, "Banana");

    }

    public static void listSearch(ArrayList<String> input, String item) {
        boolean a = false;
        if (input.contains(item) != a) {
            System.out.println("You already added this item to the shopping list.");
        } else {
            System.out.println("You don't have this item in your shopping list.");
        }

    }
}
