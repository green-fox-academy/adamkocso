public class Reverse {
    public static void main(String[] args) {

        String a = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        System.out.println(a);
        System.out.println(reversedString(a));
    }


    public static String reversedString(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return reversed;
    }


}

