package Simonsway.Week18.ZooRefactor;

import oliver.week18_Zoo.Futter;
import oliver.week18_Zoo.Tier;

import java.util.ArrayList;

public class Gehege {

    private String name;
    public ArrayList <Tiere> tiere;

    // Konstruktor
    public Gehege (String name){
        this.name = name;
        this.tiere = new ArrayList<>();
    }


    // Tiere
    //////////////////////////////////////////////////////////////////////////////////////////////////

    public Tier tiereAdd (String name, Futter futter, int taeglicherBedraf){
        Tier tier = new Tier(name, futter, taeglicherBedraf);
        //this.tiere.add(tier);

        return tier;
    }

}
