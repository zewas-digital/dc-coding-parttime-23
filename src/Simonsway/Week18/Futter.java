package Simonsway.Week18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Futter {

    private String name;
    private String einheit;
    private float einheitsPreis;
    Tiere tiere;


    public Futter (String name, String einheit, float einheitsPreis){
        this.name = name;
        this.einheit = einheit;
        this.einheitsPreis = einheitsPreis;
    }

    // To String
    public String toString(){
        return "Futter: " + this.name;
    }



    // Setter
    public void setName(String name) {
        this.name = name;
    }
    public void setEinheit(String einheit) {
        this.einheit = einheit;
    }
    public void setEinheitsPreis(float einheitsPreis) {
        this.einheitsPreis = einheitsPreis;
    }


    // Getter
    public String getName() {
        return name;
    }
    public String getEinheit() {
        return einheit;
    }
    public float getEinheitsPreis() {
        return einheitsPreis;
    }
    public String getFutter() {
        return name;
    }
    public Tiere getTiere(){
        return tiere;
    }

}
