package main.java.music;

public class BassGuitar extends StringedInstrument {


    public BassGuitar(){
        super();
        numberOfStrings = 4;

    }

    public BassGuitar(int numberOfStings){
        super(numberOfStings);
    }




    @Override
    String sound() {
       return "Duum-duum-duum";
    }


}
