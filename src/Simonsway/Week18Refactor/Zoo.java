package Simonsway.Week18Refactor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Zoo {

    private String name;
    private String jahr;
    HashMap<Futter, Double> futterliste = new HashMap<>();
    public ArrayList <Gehege> gehege;



    public Zoo (String name, String jahr){
        this.name = name;
        this.jahr = jahr;
        this.gehege = new ArrayList<>();
    }

    public Gehege neuesGehege (String name){
        Gehege gehege = new Gehege(name);
        this.gehege.add(gehege);

        return gehege;
    }



    public String toString(){
        return "Zoo: " + this.name + " Gründungsjahr " + this.jahr;
    }



    public void zooDisplayOutput(){
        String zooDisplayOutput = toString();
        System.out.println("\n├── " + zooDisplayOutput);

        for (int i = 0; i < this.gehege.size(); i++) {
            System.out.println("│   ├── " + this.gehege.get(i));

            List<Tiere> tiere = this.gehege.get(i).getTiere();

            for (int j = 0; j < tiere.size(); j++) {
                System.out.println("│       ├── " + tiere.get(j));
            }
        }
    }
}
