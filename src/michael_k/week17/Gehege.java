package michael_k.week17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Gehege extends Object {

    protected String name;
    public boolean gehegeKontrolliert = false;
    public ArrayList<Tiere> gehegeTiere = new ArrayList<Tiere>();


    public Gehege(String name){
        this.name = name;
    }


    public void tierHinzufuegen(String name, String futterArt, float futterMenge, int gesundheit, int biss){

        this.gehegeTiere.add(new Tiere ( name, futterArt, futterMenge, gesundheit, biss ));
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
    public String zufallstierBeobachten(String lieblingstier){
        String tier = "keiner";
        Random zufall = new Random ();

        int anzahlTiere = gehegeTiere.size ();

        if(gehegeTiere.size () == 1){ tier = gehegeTiere.get (0).name;}
        else{ tier = gehegeTiere.get (zufall.nextInt (  0,anzahlTiere-1)).name;}

        for (Tiere t: gehegeTiere) {
            if (t.name.equals ( lieblingstier )){
                tier = "sein Lieblingstier \"" + t.name +"\"";
            }
        }
        return tier;
    }
    public void tiereStreiten(){

        for (Tiere tier: gehegeTiere){

            Tiere zufallstier = zufallstierStreiten ( tier );
            if (zufallstier == null){
                System.out.println ("keiner streitet." );
            }
            else {
                Random zufall = new Random ();
                int bisswahrscheinlichkeit = zufall.nextInt (0,101);

                if(bisswahrscheinlichkeit <=40) {
                    zufallstier.gesundheit = zufallstier.gesundheit - tier.biss;
                }
                System.out.println ( tier.name + " hat mit "+ zufallstier.name+ " gestritten." );
            }
        }
    }
    private Tiere zufallstierStreiten( Tiere tier){

        Random zufall = new Random ();
        int anzahlTiere = gehegeTiere.size ();
        boolean gleichartigeTiere = true;

        for (Tiere t: gehegeTiere) {
            if (!t.name.equals ( tier.name )){
                gleichartigeTiere = false;
            }
        }
        Tiere zufallstier= gehegeTiere.get ( zufall.nextInt ( 0, anzahlTiere  ) );
        if(gehegeTiere.size () == 1 || gleichartigeTiere){zufallstier = null;}
        else {
            while ( zufallstier.name.equals ( tier.name ) ) {
                zufallstier = gehegeTiere.get ( zufall.nextInt ( 0, anzahlTiere  ) );
            }
        }
        return zufallstier;
    }
}
