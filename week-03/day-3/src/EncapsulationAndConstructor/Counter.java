package EncapsulationAndConstructor;

public class Counter {

    int counter;
    int cc;

    Counter(){
        this(0);
    }

    public Counter(int counter){
        this.counter = counter;
        this.cc = counter;
    }

    public void add(int number){
        counter += number;
    }

    public void add(){
        counter ++;
    }

    public int get(){
        return counter;
    }

    public void reset(){
        counter = cc;
    }

}
