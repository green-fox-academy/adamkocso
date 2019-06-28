import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Number of chickens: ");
        int chickens = sc.nextInt();

        System.out.println("Number of pigs: ");
        int pigs = sc.nextInt();

        System.out.println("Total animal legs in the farm: " + (chickens * 2 + pigs * 4));
    }
}
