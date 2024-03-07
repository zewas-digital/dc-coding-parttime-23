package saifedine.week22_weekend6.CarsimExtended;

public class Engine {

    // Attribute
    private String name;
    private int kw;


    // Konstruktoren
    public Engine(String name,int kw){
        this.name = name;
        this.kw = kw;
    }


    @Override
    // Methoden
    public String toString(){
        return  "Motorname: " + this.name +
                ",\tLeistung: " + this.kw;
    }
}
