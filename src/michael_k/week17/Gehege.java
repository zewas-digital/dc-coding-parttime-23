package michael_k.week17;

import java.util.ArrayList;
import java.util.HashMap;

public class Gehege extends Object {

    protected String name;
    public ArrayList<Tiere> gehegeTiere = new ArrayList<Tiere>();

    //public HashMap<String,>


    public Gehege(String name){
        this.name = name;
    }


    public void tierHinzufuegen(String name, String futterArt, float futterMenge){

        this.gehegeTiere.add(new Tiere ( name, futterArt, futterMenge ));
    }
    public void tierEntfernen(int tierID){

        gehegeTiere.remove ( tierID-1 );

    };
    public String printTiereliste(){

        String ausgabe = "";
        int arraySize = gehegeTiere.size ( );

        for (int i = 0; i < arraySize; i++) {
            ausgabe = ausgabe + "|   |   |---" + "Tier" + (i+1)+": "+ gehegeTiere.get ( i ).name+"\n";

        }

        return ausgabe;
    }

}
