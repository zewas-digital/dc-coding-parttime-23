package saifedine.week18_Zoo.V02;

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
}