public class SumDigits {


    public static void main(String[] args) {
        System.out.println(SumDigit(126));

    }


    public static int SumDigit(int n){
        return SumDigit2(n);
    }

    public static int SumDigit2(int n){
        if (n == 0){
            return 0;
        }
        return n % 10 + SumDigit2(n / 10);
    }
}
