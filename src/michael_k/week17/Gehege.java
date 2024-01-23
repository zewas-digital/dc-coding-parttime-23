package michael_k.week17;

import java.util.ArrayList;
import java.util.HashMap;

public class Gehege extends Object {

    protected String name;
    public ArrayList<Tiere> gehegeTiere = new ArrayList<Tiere>();


    public Gehege(String name){
        this.name = name;
    }


    public void tierHinzufuegen(String name, String futterArt, float futterMenge){

        this.gehegeTiere.add(new Tiere ( name, futterArt, futterMenge ));
    }
    public void tierEntfernen(int tierNummer){

        gehegeTiere.remove ( tierNummer-1 );

    };
    public String printTiereliste(){

        String ausgabe = "";
        int arraySize = gehegeTiere.size ( );

        for (int i = 0; i < arraySize; i++) {
            ausgabe = ausgabe + "|   |---" + "Tier" + (i+1)+": "+ gehegeTiere.get ( i ).name+"\n";

        }
        ausgabe = ausgabe+futteruebersicht ( gehegeTiere );

        return ausgabe;
    }

    public static String futteruebersicht(ArrayList<Tiere> tiere){

        HashMap<String, Float> futteruebersicht = new HashMap<> ();
        String ausgabe = "";

        for (int i = 0; i < tiere.size ( ); i++) {

            String futterart = tiere.get(i).futterart;
            float futtermenge = tiere.get ( i ).futtermenge;

            if(futteruebersicht.get ( futterart ) == null){
                futteruebersicht.put(futterart, futtermenge);

            }else{
                float oldValue = futteruebersicht.get(futterart);
                futteruebersicht.replace ( futterart, futtermenge+oldValue );
            }
        }
        for (String str: futteruebersicht.keySet () ) {

            ausgabe = ausgabe + "|       |---" + str + ": "+ futteruebersicht.get(str) +"kg\n";
        }
        ausgabe = ausgabe + "|\n";
        return ausgabe;
    }
}
