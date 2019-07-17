package Workshop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by aze on 2017.04.04..
 */
public class Extension {
    public int add(int a, int b) {
        return a + b;
    }

    public int maxOfThree(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > c){
            return b;
        } else {
            return c;
        }
    }

    public float median(List<Integer> pool) {
        Collections.sort(pool);
        if(pool.size() % 2 != 0) {
            return pool.get((pool.size() - 1) / 2);
        } else {
            return (float)(pool.get((pool.size() - 1) / 2) + pool.get(pool.size() / 2)) / 2;
        }


    }

    public boolean isVowel(char c) {
        return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(Character.toLowerCase(c));
    }

    public String translate(String hungarian) {
        String teve = hungarian;
        String[] r = teve.split("(?<=[aeiou])");
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < r.length; i++) {
            if(isVowel(r[i].charAt(r[i].length()-1))) {
                words.add(r[i] + "v" + r[i].charAt(r[i].length() - 1));
            }else{
                words.add(r[i]);
            }
        }
        String listString = "";
        for (String s : words) {
            listString += s;
        }
        return listString;
    }
}
