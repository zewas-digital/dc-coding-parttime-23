package saifedine.week20_Zoo.V01;

// Objekt_9_Pfleger

import java.util.Vector;

public class Pfleger {

    private String name;

    public Vector<Gehege> gehegeZustaendigkeit;


    public Pfleger(String name){
        this.name = name;
        this.gehegeZustaendigkeit = new Vector<>();
    }
    @Override
    public String toString(){
        return "Pfleger: " + this.name;
    }

    public String getName() {
        return name;
    }
}