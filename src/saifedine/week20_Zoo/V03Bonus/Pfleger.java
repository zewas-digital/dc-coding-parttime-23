package saifedine.week20_Zoo.V03Bonus;

// Objekt_9_Pfleger

import java.util.Vector;

public class Pfleger {

    // Attribute
    private String name;

    public Vector<Gehege> gehegeZustaendigkeit;


    // Konstruktor
    public Pfleger(String name){
        this.name = name;
        this.gehegeZustaendigkeit = new Vector<>();
    }


    // alle Methoden, wobei toString immer der erste sein soll
    @Override
    public String toString(){
        return "Pfleger: " + this.name;
    }

    public String getName() {
        return "Pfleger " + this.name;
    }
}