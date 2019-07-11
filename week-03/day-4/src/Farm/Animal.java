package Farm;

public class Animal {
    String name;
    int hunger = 50;
    int thirst = 50;


    Animal(String name, int hunger){
        this.name = name;
        this.hunger = hunger;
    }

    public void eat(){
        hunger--;
    }

    public void drink(){
        thirst--;
    }

    public void play(){
        hunger++;
        thirst++;
    }
}