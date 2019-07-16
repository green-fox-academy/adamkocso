package main.java.music;

public abstract  class Instrument {
    protected String  name;

    public Instrument() {
        name = createInstrumentName();
    }

    public abstract void play();

    private String createInstrumentName() {
        String[] r = this.getClass().getSimpleName().split("(?=\\p{Upper})");
        return String.join( " ", r);

    }
}
