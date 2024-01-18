package Simonsway.Week18;

import java.util.ArrayList;
import java.util.HashMap;

public class Futter {

    private String name;
    private String einheit;
    private float einheitsPreis;

    public Futter (String name, String einheit, float einheitsPreis){
        this.name = name;
        this.einheit = einheit;
        this.einheitsPreis = einheitsPreis;
    }

    public String toString(){
        return "Futter: " + this.name;
    }

    public void fuettern (double futterMenge){
    }

}
