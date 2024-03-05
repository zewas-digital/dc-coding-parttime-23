package Alpi.week18_pflege;

import java.util.ArrayList;

public class Pfleger {

    public String name;

    public ArrayList<Gehege> zustandigfurGehege;

    //public ArrayList <Pfleger> pflegerArrayList;

    public Pfleger(String name) {
        this.name = name;
        this.zustandigfurGehege = new ArrayList<>();
       // this.pflegerArrayList= new ArrayList<>();

        System.out.println("Pflegername: " + name );
    }
    public void verantwortlichfuerGehege (Gehege gehege){
        this.zustandigfurGehege.add(gehege);
    }

}
