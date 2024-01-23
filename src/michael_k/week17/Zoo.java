package michael_k.week17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
public class Zoo extends Object{

    private String name;
    private int gruendungsjahr;
    public ArrayList<Gehege> zoogehege = new ArrayList<Gehege>();
    public ArrayList<Pfleger> pfleger = new ArrayList<Pfleger>();
    public HashMap<String, Float> futteruebersicht = new HashMap<> ();
    private float gesamtpreis;
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
    public void tierHinzufuegen(int gehegeNummer, String tiername, String futterart, float futtermenge){

        zoogehege.get(gehegeNummer-1).tierHinzufuegen ( tiername, futterart,futtermenge );

        if(futteruebersicht.get ( futterart ) == null){
            futteruebersicht.put(futterart, futtermenge);

        }else{
            float oldValue = futteruebersicht.get(futterart);
            futteruebersicht.replace ( futterart, futtermenge+oldValue );
        }

    }
    public void tierEntfernen(int gehegeNummer, int tierNummer){

        Tiere tier = zoogehege.get(gehegeNummer-1).gehegeTiere.get ( tierNummer-1 );
        zoogehege.get(gehegeNummer-1).tierEntfernen ( tierNummer);


        if(futteruebersicht.get ( tier.futterart ) > tier.futtermenge){
            float oldValue = futteruebersicht.get(tier.futterart);
            futteruebersicht.replace ( tier.futterart, oldValue-tier.futtermenge );

        }else{
            futteruebersicht.remove ( tier.futterart);
        }

    }
    public void pflegerZuordnen(Pfleger pfleger){
        this.pfleger.add ( pfleger );
    }
    public void pflegerAbziehen(Pfleger pfleger){
        int i = 0;
        for(Pfleger x : this.pfleger){
            if(x.equals(pfleger)) {
                this.pfleger.remove ( i );
            }
            i++;
        }

    }
    /*private void gehegeZuordnung(){
        // Gehegezuständigkeit der Pfleger löschen
        for (Pfleger pfleger:pfleger) {
            pfleger.resetGehege ();
        }


        // Ein Array erstellen und zufällig mit Gehege befüllt
        Random random = new Random();
        // Array Kopie erstellen
        Gehege[] gehege = new Gehege[zoogehege.size ()];
        int l = 0;
        for (Gehege g:zoogehege) {
            gehege[l] =g;
            l++;
        }
        // Arraykopie mischen
        for (int i = 0; i < random.nextInt ( 5); i++) {
            int index1 = random.nextInt(gehege.length - 1);
            int index2 = random.nextInt(gehege.length - 1);

            Gehege temp = gehege[index1];
            gehege[index1] = gehege[index2];
            gehege[index2] = temp;
        }
        // Gehege den Pfleger wieder zuordnen
        int k = 0;
        for (Gehege i:gehege) {
            int j = pfleger.size ();
            pfleger.get ( k ).gehegeHinzufuegen ( i );
            k++;
            if (k == pfleger.size ()){
                k=0;
            }
        }
    }*/
    public String printuebersicht(){
        //gehegeZuordnung ();
        HashMap<String, Float> futterpreis = preisliste ();

        String ausgabe = "|---Zoo: " + this.name + ", gegründet " + this.gruendungsjahr+"\n";
        ausgabe = ausgabe + "|\n";
        //Preisübersicht Futterkosten Zoogesamt
        ausgabe = ausgabe + "|---Futter Tagesbedarf\n";
        for (String str: futteruebersicht.keySet () ) {
            float preis = futterpreis.get (str) * futteruebersicht.get(str);
            String Preis = String.format ( "%.2f", preis );
            ausgabe = ausgabe + "|   |---" + str + ": "+ futteruebersicht.get(str) +"kg -->"+ Preis + "€\n";
        }
        //Ausgabe Gesamtpreis
        gesamtpreis = 0;
        for (String futter:futteruebersicht.keySet ()) {

            float preis = futterpreis.get (futter) * futteruebersicht.get(futter);
            gesamtpreis = gesamtpreis+preis;
        }
        String Preis = String.format ( "%.2f", gesamtpreis );
        ausgabe = ausgabe + "|   |---Gesamtpreis = "+Preis+"€\n";
        ausgabe = ausgabe + "|\n";
        //Ausgabe Personal
        ausgabe = ausgabe +"|---Personaleinteilung\n";
        for (int i = 0; i < pfleger.size (); i++) {
            ausgabe = ausgabe + "|   |---Personal"+(i+1)+": "+ pfleger.get ( i ).name+"\n";
            for (int j = 0; j < pfleger.get ( i ).gehege.size (); j++) {
                ausgabe = ausgabe +"|   |   |---"+pfleger.get ( i ).gehege.get(j).name+"\n";
            }
        }
        ausgabe = ausgabe + "|\n";
        //Ausgabe Gehege mit Tieren
        int arraySize = zoogehege.size ( );

        for (int i = 0; i < arraySize; i++) {
           ausgabe = ausgabe + "|---" + "Gehege" + (i+1)+": "+ zoogehege.get ( i ).name+"\n";
           ausgabe = ausgabe + zoogehege.get(i).printTiereliste ();
        }

        return ausgabe;
    }
    private HashMap<String, Float> preisliste(){
        HashMap<String, Float> futterpreis= new HashMap<> ();
        futterpreis.put ( "Fleisch", 9.8F );
        futterpreis.put ( "Insekten", 1.6F );
        futterpreis.put ( "Heu", 1.2F );
        futterpreis.put ( "Fischfutter", 4.7F );
        futterpreis.put ( "Mais", 3.9F );
        return futterpreis;
    }
}

//public String[][] futterliste = {{" "," "," "}, {"Fleisch", "10","kg"}, {"Heu", "1","kg"}, {"Insekten", "2","kg"}, {"Fischfutter", "5","kg"},};