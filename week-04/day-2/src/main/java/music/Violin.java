package main.java.music;

public class Violin extends StringedInstrument {


    public Violin() {
        super();
        numberOfStrings = 4;
    }

    public Violin(int numberOfStrings) {
        super(numberOfStrings);

    }

    @Override
    String sound() {
        return "Screech";
    }


}
