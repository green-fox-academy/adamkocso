package EncapsulationAndConstructor;

public class Sharpie {

    String color;
    float width;
    float inkAmount = 100;

    Sharpie(){}

    public void use() {
        inkAmount = width * 0.05f;
    }
}
