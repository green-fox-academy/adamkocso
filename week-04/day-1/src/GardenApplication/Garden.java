package GardenApplication;

import java.util.ArrayList;

public class Garden {

    String name;
    ArrayList<Plant> myGarden;

    public Garden (String name){
        this.name = name;
        myGarden = new ArrayList<>();
    }

    public void addPlants(Plant plant){
        myGarden.add(plant);
    }

    public void info(){
        for (Plant plants: myGarden) {
            if (plants instanceof Flower && plants.waterAmount < plants.limit){
                System.out.println("The " + plants.color + " Flower needs water");
            } else if (plants instanceof Flower && plants.waterAmount > plants.limit){
                System.out.println("The " + plants.color + " Flower doesn't need water");
            } else if (plants instanceof Tree && plants.waterAmount < plants.limit) {
                System.out.println("The " + plants.color + " Tree needs water");
            } else if (plants instanceof Tree && plants.waterAmount > plants.limit) {
                System.out.println("The " + plants.color + " Tree doesn't need water");
            }
        }
        System.out.println();
    }




    public void wateringWith(int number){
    System.out.println("Watering with " + number);
    System.out.println();
        int mustBeWater = 0;
        for (Plant plant: myGarden) {
            if (plant instanceof Flower && plant.waterAmount < Flower.LIMIT){
                mustBeWater++;
            } else if (plant instanceof Tree && plant.waterAmount < Tree.LIMIT){
                mustBeWater++;
            }
        }
        watering(number / mustBeWater);
    }

    public void watering(float number){
        for (Plant plant: myGarden) {
            if (plant instanceof Flower && plant.waterAmount < plant.limit){
                plant.waterAmount += number * plant.absorb;
            } else if (plant instanceof Tree && plant.waterAmount < plant.limit){
                plant.waterAmount += number * plant.absorb;
            }
        }
    }






}
