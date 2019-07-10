package EncapsulationAndConstructor;

public class Main {

    public static void main(String[] args) {

//  Animal
        Animal fox = new Animal();
        fox.eat();
        System.out.println(fox.hunger);


//  Sharpie

        Sharpie pen = new Sharpie();
        pen.color = "blue";
        pen.width = 10.2f;
        pen.use();
        System.out.println(pen.inkAmount);


//  Counter

        Counter c = new Counter();
        c.add(4);
        System.out.println(c.get());

    }
}
