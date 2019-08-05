package Pirates;

public class Main {


    public static void main(String[] args) {
        Pirate jack = new Pirate();
        Ship blackPearl = new Ship();

        jack.drinkSomeRum();
        jack.isCaptain();
        jack.die();

        blackPearl.fillShip(jack);

        System.out.println("He drunk " + jack.consumedRum + " rum.");
        System.out.println(blackPearl.captainInfo());
        System.out.println(blackPearl.crewInfo());

        blackPearl.pirates.get(2).die();


    }

}
