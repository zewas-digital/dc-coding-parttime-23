package Simonsway.Week18Refactor;

public class Futter {

    private String name;
    private String einheit;
    private int preisProEinheit;

    public Futter(String name, String einheit, int preisProEinheit){
        this.name = name;
        this.einheit = einheit;
        this.preisProEinheit = preisProEinheit;
    }


    public String toString(){
        return this.name + " Einheit " + this.einheit + " Preis pro Einheit " + this.preisProEinheit;
    }

    public String getName() {
        return name;
    }

    public String getEinheit() {
        return einheit;
    }

    public int getPreisProEinheit() {
        return preisProEinheit;
    }


}
