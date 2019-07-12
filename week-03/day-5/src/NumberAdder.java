public class NumberAdder {

//    static int sum = 0;

    public static void main(String[] args) {

        System.out.println(Addnumber(3));

        System.out.println(1 % 10);
    }

//    public static int numberAdd(int n){
//        if(n > 0){
//            sum += n;
//            n--;
//            return numberAdd((n));
//        } else {
//            return sum;
//        }
//    }

    public static int Addnumber(int n){
        return Addnumber2(n, 0);
    }

    public static int Addnumber2(int n, int sum){
        if (n == 0){
            return 0;
        }
        return n + Addnumber2(n - 1, n + sum);
    }

}
