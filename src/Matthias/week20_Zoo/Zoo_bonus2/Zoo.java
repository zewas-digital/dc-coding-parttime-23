package Matthias.week20_Zoo.Zoo_bonus2;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

public class Zoo  {
    private  String zooname;
    private int builddate;
    private HashMap<Futter.Futtersorten, Futter> futterSortimentListe;
    private HashMap<Futter.Futtersorten, Integer> futterbedarslisteTiere;
    private Vector<Gehege> gehegeVListe = new Vector<>( );
    private ArrayList<Pfleger> pflegerVListe =new ArrayList<>(  );
    public Zoo(String zooName,int gruendungsDatum ){
        this.zooname =zooName;
        this.builddate=gruendungsDatum;
        this.futterbedarslisteTiere =new HashMap<>(  );
        this.futterSortimentListe =new HashMap<>(  );
    }
    public ArrayList<Pfleger> getPflegerVListe() {
        return pflegerVListe;
    }
    public Vector<Gehege> getGehegeVListe() {
        return gehegeVListe;
    }
    // Getter 1: Kann den Zoo Namen über das erzeugte Objekt ausgeben
    public String getZooName() {
        return this.zooname;
    }

    // Getter 2: Kann den Gründungsnamen über das erzeugte Objekt ausgeben
    public int getBuilddate() {
        return this.builddate;
    }

    //Methode 1: Eigenschaft: öffentlich zugänglich durch public, erzugt ein neues Gehege und fügt es in die Liste der Gehege
    public Gehege addGehege( String Standort) {
        Gehege neuesGehege=new Gehege( Standort);
        this.gehegeVListe.add( neuesGehege);
        return neuesGehege;
    }
    //Methode 2:  Eigenschaft: öffentlich zugänglich durch public, erzugt ein neues Gehege und fügt es in die Liste der Gehege
    public void removeGehege( Gehege gehegeObjekt) {
        this.gehegeVListe.remove( gehegeObjekt);}
    public void neuerPfleger( Pfleger pfleger) {
        this.pflegerVListe.add(pfleger);
    }
    public void verantwortlichFuerGehege( Pfleger pfleger, Gehege gehege) {
        if (this.pflegerVListe.contains(pfleger) && this.gehegeVListe.contains(gehege)) {

            pfleger.verantworlichFuerGehege( gehege);
        }else {
            System.out.println("Pfleger oder Gehege nicht existent!" );
        }
    }
    private void fillFutterlagerListe() {
        futterSortimentListe.put( Futter.Futtersorten.FISCH, new Futter("Fisch", "kg",0.5  ) );
        futterSortimentListe.put( Futter.Futtersorten.FLEISCH,new Futter( "Fleisch", "kg",0.5 ) );
        futterSortimentListe.put( Futter.Futtersorten.HEU,new Futter( "Heu", "kg",0.5 ) );

    }
    private void fillFutterbedarsliste() {
        for (Gehege gehege: gehegeVListe) {
            for (Tier tier : gehege.getTierListe( )) {
                if ( futterbedarslisteTiere.get(tier.futtersorte)!=null ) {
                    this.futterbedarslisteTiere.replace( tier.futtersorte,tier.getFutterbedarf( ).getFuttermenge( )+ futterbedarslisteTiere.get( tier.futtersorte));
                }else {
                    this.futterbedarslisteTiere.put(tier.futtersorte,tier.getFutterbedarf().getFuttermenge());
                }
            }
        }
    }
    public void printFutterbedarfsliteZoo(){
        System.out.println( "Zoo Futterbedarfsliste:" );
        fillFutterbedarsliste();
        fillFutterlagerListe();
        System.out.println( "*************************************" );
        double Gesampreis=0;
        for (Futter.Futtersorten Futtersorte: futterbedarslisteTiere.keySet()) {
            double zwischensummepreis= futterbedarslisteTiere.get( Futtersorte ) *  futterSortimentListe.get( Futtersorte ).getEinheitpreis();
            Gesampreis=Gesampreis+zwischensummepreis;
            System.out.println( futterbedarslisteTiere.get( Futtersorte ) +" "+ futterSortimentListe.get( Futtersorte ).getEinheit()+" " + Futtersorte + " " +"Preis pro Menge: "+zwischensummepreis + " Euro" );;
        }
        System.out.println( "Zoo Gesamtkosten: " + Gesampreis );
        System.out.println( "*************************************" );

    }
    public void printFormated(){
            System.out.println( "|--"+this.toString()); // Zeiger auf den Zoo Konstruktor der das neue Objekt Zoo erstellt

            for (Gehege gehege : this.gehegeVListe) {
                System.out.print( "|" );
                System.out.println( "\t|--" + gehege.toString( ) );

                for (Tier t : gehege.getTierListe( )) {
                    System.out.print( "|" );
                    System.out.println( "\t\t|--" + t.toString( ) );
                    System.out.println( "\t\t\t|--" + "Futtermenge: " + t.getFutterbedarf( ).getFuttermenge( ) + " Futtername: " + t.getFuttersorte( ) );
                }
            }
            System.out.println( "*************************************" );
            System.out.println("Zuständigkeitsliste:" );
            for (Pfleger pfleger: pflegerVListe) {

                for (Gehege gehege:pfleger.getZustaendigFuerGehege()) {
                    System.out.println( "Zuständigkeit: "+pfleger.getName( ) + "  Gehegename:" + gehege.getStandort( ) );
                }
            }
            System.out.println( "*************************************" );
    }
    @Override
    public String toString(){
        return "Zoo: " + this.zooname + ", gegründet " + this.builddate;
    }
}
