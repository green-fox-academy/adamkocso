import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many girls come to the party? Please enter: ");
        int girls = sc.nextInt();
        System.out.println("How many boys come to the party? Please enter: ");
        int boys = sc.nextInt();

        if (girls == boys && girls + boys >= 20){
            System.out.println("The party is excellent!");
        }
        else if (girls + boys >= 20 && girls > 0){
            System.out.println("Quite cool party!");
        }
        else if (girls + boys < 20 && girls > 0){
            System.out.println("Average party...");
        }
        else {
            System.out.println("Sausage party");
        }
    }
}
