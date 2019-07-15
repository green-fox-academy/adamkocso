package GardenApplication;

public class Main {

    public static void main(String[] args) {

        Garden myGarden = new Garden("myGarden");

        Plant yellow = new Flower("yellow");
        Plant blue = new Flower("blue");
        Plant purple = new Tree("purple");
        Plant orange = new Tree("orange");

        myGarden.addPlants(yellow);
        myGarden.addPlants(blue);
        myGarden.addPlants(purple);
        myGarden.addPlants(orange);

        myGarden.info();

        myGarden.wateringWith(40);

        myGarden.info();

        myGarden.wateringWith(70);

        myGarden.info();


    }
}
