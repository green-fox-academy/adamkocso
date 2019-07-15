package AirCraft;

public class Main {

    public static void main(String[] args) {

        F16 aircraft1 = new F16();
        F35 aircraft2 = new F35();


        // getType Test
        aircraft1.getType();
        aircraft2.getType();

        // refill Test
        System.out.println(aircraft1.getAmmoStorage());
        aircraft1.setAmmoStorage(3);
        System.out.println(aircraft1.refill(100));
        System.out.println(aircraft1.getAmmoStorage());
        

    }
}
