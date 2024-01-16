package michael_k.week17;

import java.util.ArrayList;

public class Zoo extends Object{

    private String name;
    private int gruendungsjahr;
    public ArrayList<Gehege> zoogehege = new ArrayList<Gehege>();


    public Zoo (String name, int gruendungsjahr){
        this.name = name;
        this.gruendungsjahr = gruendungsjahr;
    }


    public void gehegeHinzufuegen(String gehegename){
        this.zoogehege.add(new Gehege ( gehegename ));
    }
    public void gehegeEntfernen(int gehegeNummer){

        zoogehege.remove ( gehegeNummer-1 );

    };

    public void tierHinzufuegen(int gehegeNummer, String tiername, String futterart, int futtermenge){

        zoogehege.get(gehegeNummer-1).tierHinzufuegen ( tiername, futterart,futtermenge );

    }
    public String printuebersicht(){
        String ausgabe = "|---Zoo: " + this.name + ", gegründet " + this.gruendungsjahr+"\n";
        int arraySize = zoogehege.size ( );

        for (int i = 0; i < arraySize; i++) {
           ausgabe = ausgabe + "|   |---" + "Gehege" + (i+1)+": "+ zoogehege.get ( i ).name+"\n";
           ausgabe = ausgabe + zoogehege.get(i).printTiereliste ();
        }

        return ausgabe;
    }
    public String Futterstatisik(){
        String ausgabe = "";



        return ausgabe;
    }
}

//public String[][] futterliste = {{" "," "," "}, {"Fleisch", "10","kg"}, {"Heu", "1","kg"}, {"Insekten", "2","kg"}, {"Fischfutter", "5","kg"},};