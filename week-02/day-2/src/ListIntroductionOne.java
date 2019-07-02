import java.sql.SQLOutput;
import java.util.ArrayList;

public class ListIntroductionOne {
    public static void main(String[] args) {


//  Create an empty list which will contain names (strings)
        ArrayList<String> names = new ArrayList<>();

//  Print out the number of elements in the list
        System.out.println(names.size());

//  Add William to the list
        names.add("William");

//  Print out whether the list is empty or not
        System.out.println(names.isEmpty());

//  Add John to the list
        names.add("John");

//  Add Amanda to the list
        names.add("Amanda  ");

//  Print out the number of elements in the list
        System.out.println(names.size());

//  Print out the number of elements in the list
        System.out.println(names.get(2));

//  Iterate through the list and print out each name
        for (String n : names) {
            System.out.println(n);
        }

// Iterate through the list and print
        for (int i = 0; i < names.size(); i++) {
            System.out.println(i + 1 + ". ".concat(names.get(i)));
        }

//  Remove the 2nd element
        names.remove(1);

//  Iterate through the list in a reversed order and print out each name
        for (int i = names.size() - 1; i >= 0; i--) {
            System.out.println(names.get(i));
        }

//  Remove all elements
        names.clear();

    }

}
