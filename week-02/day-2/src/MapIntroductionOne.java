import java.util.HashMap;

public class MapIntroductionOne {

    public static void main(String[] args) {

//  Create an empty map where the keys are integers and the values are characters
        HashMap<Integer, Character> hashMap = new HashMap<>();


//  Print out whether the map is empty or not
        System.out.println(hashMap.isEmpty());

//  Add the following key-value pairs to the map
        hashMap.put(97, 'a');
        hashMap.put(98, 'b');
        hashMap.put(99, 'c');
        hashMap.put(65, 'A');
        hashMap.put(66, 'B');
        hashMap.put(67, 'C');

//  Print all the keys
        for (int key : hashMap.keySet()) {
            System.out.println(key);
        }

//  Print all the values
        for (Character values : hashMap.values()) {
            System.out.println(values);
        }

//  Add value D with the key 68
        hashMap.put(68, 'D');

//Print how many key-value pairs are in the map
        System.out.println(hashMap.size());

//  Print the value that is associated with key 99
        System.out.println(hashMap.get(99));

//  Remove the key-value pair where with key 97
        hashMap.remove(97);

//  Print whether there is an associated value with key 100 or not
        System.out.println(hashMap.containsKey(100));

//  Remove all the key-value pairs
        hashMap.clear();




    }
}
