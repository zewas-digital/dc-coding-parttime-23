package Matthias.week18_Zoo.Zoo2_Hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class Zoo {
    private  String zooname;
    private int builddate;
    private HashMap<String,Double> Futterlager;
    private HashMap<String, Integer> FutterbedarslisteTier;
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
        for (String Futtername: FutterbedarslisteTier.keySet()) {
            double zwischensummepreis=FutterbedarslisteTier.get( Futtername ) * Futterlager.get( Futtername );
           Gesampreis=Gesampreis+zwischensummepreis;
            System.out.println(FutterbedarslisteTier.get( Futtername ) + "Kg" + Futtername + " " +"Preis pro Menge: "+zwischensummepreis);;

        }
        System.out.println( "Zoo Gesamtkosten: " + Gesampreis );
        System.out.println( "*************************************" );

    }


    private void fillFutterbedarsliste() {
        for (Gehege gehege: gehegeArrayList) {
            for (Tiere Tier:gehege.getTierListe()) {
                if ( FutterbedarslisteTier.get( Tier.getFutter().getFutterArtikelname() )!=null ) {
                    FutterbedarslisteTier.replace( Tier.getFutter().getFutterArtikelname(),Tier.getFutterbedarf( ).getFuttermenge( )+FutterbedarslisteTier.get(Tier.getFutterbedarf().getFuttermenge()));
                }else {
                this.FutterbedarslisteTier.put( Tier.getFutter().getFutterArtikelname(),Tier.getFutterbedarf().getFuttermenge());
                }
            }
        }
    }

    private void fillFutterlagerListe(){
            for (Gehege gehege: gehegeArrayList) {
                for (Tiere Tier:gehege.getTierListe()) {
                    if ( Futterlager.get( Tier.getFutter().getFutterArtikelname() )!=null ) {
                        Futterlager.replace( Tier.getFutter().getFutterArtikelname(),Tier.getFutter().getEinheitpreis());
                    }else {
                        this.Futterlager.put( Tier.getFutter().getFutterArtikelname(),Tier.getFutter().getEinheitpreis());
                    }
                }
            }
    }
   private void removeFutterbedarslisteTier() {
        for (Gehege gehege: gehegeArrayList) {
            for (Tiere Tier:gehege.getTierListe()) {
                this.FutterbedarslisteTier.remove( Tier.getFutter(),Tier.getFutterbedarf()) ;
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
                    System.out.println( "\t\t\t|--"+"Futtermenge: "+Tier.getFutterbedarf().getFuttermenge()+ " Futtername: "+Tier.getFutter().getFutterArtikelname());
                }
            }
    }

    @Override
    public String toString(){
        return "Zoo: " + this.zooname + ", gegründet " + this.builddate;
    }
}
