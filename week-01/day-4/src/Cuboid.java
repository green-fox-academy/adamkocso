public class Cuboid {
    public static void main(String[] args) {

        double a = 8;
        double b = 6;
        double c = 10;

        double surefaceArea = 2 * (a * b + a * c + b * c);
        double volume = a * b * c;

        System.out.println("Surface area: " + surefaceArea);
        System.out.println("Volume: " + volume);

    }
}
