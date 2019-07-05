import java.util.ArrayList;

public class PalindromeSearcher {

    public static void main(String[] args) {

        System.out.println(palindrome("papir olo bab getoteg"));

    }


    public static ArrayList<String> palindrome (String words) {
        char[] letters = words.toCharArray();
        ArrayList<String> result = new ArrayList<>();
        String newWord = "";
        for (int i = 0; i < letters.length-2; i++) {
            newWord = "";
            if (letters[i] == letters[i + 2]) {
                for (int j = 0; j < 3 ; j++) {
                    newWord += letters[i + j];
                }
                result.add(newWord);
//                if(i > 0 && i < letters.length-3 && letters [i-1] == letters[i+3]) {
//                    for (int k = 0; k < 5 ; k++) {
//                        newWord += letters[i - 1 + k];
//                    }
//                    result.add(newWord);
//                    newWord = "";
//                }
                int countBack = 1;
                while(i-countBack >= 0 && i+2+countBack < letters.length){
                    if(letters[i-countBack] == letters[i+2+countBack]){
                        newWord = letters[i-countBack] + newWord + letters[i-countBack];
                        result.add(newWord);
                    }
                    countBack++;
                }
            }
        }
        return result;
    }
}
