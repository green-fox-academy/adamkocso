import java.util.Scanner;

public class MileToKmConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Miles: ");

        double miles = sc.nextDouble();

        System.out.println(miles + " miles is equal " + miles * 1.609344 + " km.");
    }
}
