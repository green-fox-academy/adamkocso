package Farm;

public class Main {

    public static void main(String[] args) {

        Farm joe = new Farm(30);

        Animal cat = new Animal("cat", 50);

        joe.add(new Animal("Cow",50));
        joe.add(new Animal("Chicken",50));
        joe.add(new Animal("Pig",40));
        joe.add(new Animal("Horse",50));



        joe.breed(new Animal("Sheep", 60));

        joe.slaughter();



    }

}
