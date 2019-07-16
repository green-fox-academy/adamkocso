package main.java.music;

public abstract class StringedInstrument extends Instrument {

    int numberOfStrings;

    public StringedInstrument() {
    }

    public StringedInstrument(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    abstract String sound();

    @Override
    public void play() {
        System.out.println(name + ", a " + numberOfStrings + "-stringed instrument that goes "
        + sound());
    }
}