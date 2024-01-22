package Matthias.week18_Zoo.Zoo4_Personal;

import java.util.ArrayList;
import java.util.HashMap;

public class Zoo {
    private  String zooname;
    private int builddate;
    private HashMap<Futter.Futtersorten, Futter> Futterlager;
    private HashMap<Futter.Futtersorten, Integer> FutterbedarslisteTier;
    private ArrayList<Gehege> gehegeArrayList = new ArrayList<>( );
    public Zoo(String zooname,int builddate ){
        this.zooname =zooname;
        this.builddate=builddate;
        this.FutterbedarslisteTier =new HashMap<>(  );
        this.Futterlager=new HashMap<>(  );
    }

    public void printFutterbedarfsliteZoo(){
        System.out.println( "Zoo Futterbedarfsliste:" );
        fillFutterbedarsliste();
        fillFutterlagerListe();
        System.out.println( "*************************************" );
        double Gesampreis=0;
        for (Futter.Futtersorten Futtersorte: FutterbedarslisteTier.keySet()) {
            double zwischensummepreis= FutterbedarslisteTier.get( Futtersorte ) *  Futterlager.get( Futtersorte ).getEinheitpreis();
           Gesampreis=Gesampreis+zwischensummepreis;
            System.out.println(FutterbedarslisteTier.get( Futtersorte ) +" "+ Futterlager.get( Futtersorte ).getEinheit()+" " + Futtersorte + " " +"Preis pro Menge: "+zwischensummepreis);;
        }
        System.out.println( "Zoo Gesamtkosten: " + Gesampreis );
        System.out.println( "*************************************" );

    }

    private void fillFutterlagerListe() {
        Futterlager.put( Futter.Futtersorten.Fisch, new Futter("Fisch", "kg",0.5  ) );
        Futterlager.put( Futter.Futtersorten.Fleisch,new Futter( "Fleisch", "kg",0.5 ) );
        Futterlager.put( Futter.Futtersorten.Heu,new Futter( "Heu", "kg",0.5 ) );

    }

    private void fillFutterbedarsliste() {
        for (Gehege gehege: gehegeArrayList) {
            for (Tiere Tier : gehege.getTierListe( )) {
                if ( FutterbedarslisteTier.get(Tier.futtersorte)!=null ) {
                    this.FutterbedarslisteTier.replace( Tier.futtersorte,Tier.getFutterbedarf( ).getFuttermenge( ));
                }else {
                    this.FutterbedarslisteTier.put(Tier.futtersorte,Tier.getFutterbedarf().getFuttermenge());
                }
            }
        }
    }


    // Getter 1: Kann den Zoo Namen über das erzeugte Objekt ausgeben
    public String getZooname() {
        return this.zooname;
    }

    // Getter 2: Kann den Gründungsnamen über das erzeugte Objekt ausgeben
    public int getBuilddate() {
        return this.builddate;
    }

    //Methode 1: Eigenschaft: öffentlich zugänglich durch public, erzugt ein neues Gehege und fügt es in die Liste der Gehege
    public void addGehege( Gehege gehege ) {
       gehegeArrayList.add( gehege);
    }

    //Methode 2:  Eigenschaft: öffentlich zugänglich durch public, erzugt ein neues Gehege und fügt es in die Liste der Gehege
    public void removeGehege( Gehege gehegeObjekt) {
        gehegeArrayList.remove( gehegeObjekt);}
    public void printFormated(){
            System.out.println( "|--"+this.toString()); // Zeiger auf den Zoo Konstruktor der das neue Objekt Zoo erstellt
            for (Gehege gehege: gehegeArrayList) {
                System.out.print("|" );
                System.out.println( "\t|--"+gehege.toString());
                for (Tiere Tier:gehege.getTierListe()) {
                    System.out.print("|" );
                    System.out.println( "\t\t|--"+Tier.toString());
                    System.out.println( "\t\t\t|--"+"Futtermenge: "+Tier.getFutterbedarf().getFuttermenge()+ " Futtername: "+Tier.getFuttersorte());
                }
            }
    }

    @Override
    public String toString(){
        return "Zoo: " + this.zooname + ", gegründet " + this.builddate;
    }
}
