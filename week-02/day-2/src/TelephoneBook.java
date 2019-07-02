import com.sun.xml.internal.ws.api.ha.StickyFeature;

import javax.print.attribute.HashAttributeSet;
import java.util.ArrayList;
import java.util.HashMap;

public class TelephoneBook {

    public static void main(String[] args) {

        HashMap<String, String> telephoneBook = new HashMap<>();

        telephoneBook.put("William A. Lathan", "405-709-1865");
        telephoneBook.put("John K. Miller", "402-247-8568");
        telephoneBook.put("Hortensia E. Foster", "606-481-6467");
        telephoneBook.put("Amanda D. Newland", "319-243-5613");
        telephoneBook.put("Brooke P. Askew", "307-687-2982");

        System.out.println(needPhoneNumber(telephoneBook, "John K. Miller"));
        System.out.println(needName(telephoneBook, "307-687-2982"));
        numberList(telephoneBook, "Chris E. Myers");
    }

    public static String needPhoneNumber(HashMap<String, String> input, String name) {
        String a = "";
        a = input.get(name);
        return a;
    }

    public static String needName (HashMap<String, String> input, String number) {
        String a = "";
        for (String b : input.keySet()){
            if (number == input.get(b)) {
                a = b;
            }
        }
        return a;
    }

    public static void numberList (HashMap<String, String> input, String name) {
        boolean a = false;
        if (input.containsKey(name) == a) {
            System.out.println("You don't have this contact's number.");
        }
        }

    }


