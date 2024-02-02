package Matthias.week19_Zoo;


import java.util.ArrayList;
import java.util.HashMap;

public class Zoo {
    private  String zooname;
    private int builddate;
    private HashMap<Futter.Futtersorten, Futter> Futterlager;
    private HashMap<Futter.Futtersorten, Integer> FutterbedarslisteTier;

    private HashMap<Gehege, Boolean> ZooAufgabenplan;
    private ArrayList<Gehege> gehegeArrayList = new ArrayList<>( );
    private ArrayList<Pfleger> pflegerArrayList=new ArrayList<>(  );

    public Zoo(String zooname,int builddate ){
        this.zooname =zooname;
        this.builddate=builddate;
        this.FutterbedarslisteTier =new HashMap<>(  );
        this.Futterlager=new HashMap<>(  );
    }

    public void neuerPfleger( Pfleger pfleger) {
        this.pflegerArrayList.add(pfleger);
    }

   public void TagesSimulation(){
        int inkrementGehege=0;
        boolean status =false;
        while (this.gehegeArrayList.size()>=inkrementGehege){
            System.out.println("Erledige:"+inkrementGehege );
            for (Pfleger pfleger:this.pflegerArrayList) {
                pflegerToDoList( inkrementGehege );
                for (Gehege g:pfleger.getZustaendigFuerGehege()) {
                        if(!g.getGehegeFutterStatus()){
                            pflegerToDoList( inkrementGehege ).replace( g,true );
                        }
                    }
                pfleger.abarbeitungEinesGeheges( inkrementGehege );
            }
            inkrementGehege++;
        }
      //
        //System.out.println( "Tages Simulation Beendet!" );
   }

    private HashMap<Gehege,Boolean> pflegerToDoList( int index ) {
        HashMap<Gehege, Boolean> pflegerToDoList= new HashMap<>();
        for (int e = 0; e < index; e++) {
            for (int i = 0; i < this.pflegerArrayList.size(); i++) {
                System.out.println("Gehege:"+pflegerArrayList.get( e).getZustaendigFuerGehege( ).get( i)+"|" +"Status:"+ pflegerArrayList.get( e).getZustaendigFuerGehege().get( i ).getGehegeFutterStatus());
                pflegerToDoList.put( pflegerArrayList.get( e).getZustaendigFuerGehege( ).get( i), pflegerArrayList.get( e).getZustaendigFuerGehege().get( i ).getGehegeFutterStatus());
            }
        }
        return pflegerToDoList;
    }

    public boolean zooGehgeToDOStatus(){
       for (Gehege g : this.gehegeArrayList) {
           if ( !g.getGehegeFutterStatus( ) ) {
               return true;         // es ist noch was zu tun
           }
       }
       return false;
   }

    public void verantwortlichFuerGehege( Pfleger pfleger, Gehege gehege) {
        if (this.pflegerArrayList.contains(pfleger) && this.gehegeArrayList.contains(gehege)) {

          pfleger.verantworlichFuerGehege( gehege);
        }else {
            System.out.println("Pfleger oder Gehege nicht existent!" );
        }
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
            System.out.println(FutterbedarslisteTier.get( Futtersorte ) +" "+ Futterlager.get( Futtersorte ).getEinheit()+" " + Futtersorte + " " +"Preis pro Menge: "+zwischensummepreis + " Euro" );;
        }
        System.out.println( "Zoo Gesamtkosten: " + Gesampreis );
        System.out.println( "*************************************" );

    }

    private void fillFutterlagerListe() {
        Futterlager.put( Futter.Futtersorten.FISCH, new Futter("Fisch", "kg",0.5  ) );
        Futterlager.put( Futter.Futtersorten.FLEISCH,new Futter( "Fleisch", "kg",0.5 ) );
        Futterlager.put( Futter.Futtersorten.HEU,new Futter( "Heu", "kg",0.5 ) );

    }
    private void fillFutterbedarsliste() {
        for (Gehege gehege: gehegeArrayList) {
            for (Tier tier : gehege.getTierListe( )) {
                if ( FutterbedarslisteTier.get(tier.futtersorte)!=null ) {
                    this.FutterbedarslisteTier.replace( tier.futtersorte,tier.getFutterbedarf( ).getFuttermenge( )+FutterbedarslisteTier.get( tier.futtersorte));
                }else {
                    this.FutterbedarslisteTier.put(tier.futtersorte,tier.getFutterbedarf().getFuttermenge());
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
    public Gehege addGehege( String Standort) {
        Gehege neuesGehege=new Gehege( Standort);
        gehegeArrayList.add( neuesGehege);
        return neuesGehege;
    }

    //Methode 2:  Eigenschaft: öffentlich zugänglich durch public, erzugt ein neues Gehege und fügt es in die Liste der Gehege
    public void removeGehege( Gehege gehegeObjekt) {
        gehegeArrayList.remove( gehegeObjekt);}
    public void printFormated(){
            System.out.println( "|--"+this.toString()); // Zeiger auf den Zoo Konstruktor der das neue Objekt Zoo erstellt

            for (Gehege gehege : gehegeArrayList) {
                System.out.print( "|" );
                System.out.println( "\t|--" + gehege.toString( ) );

                for (Matthias.week19_Zoo.Tier Tier : gehege.getTierListe( )) {
                    System.out.print( "|" );
                    System.out.println( "\t\t|--" + Tier.toString( ) );
                    System.out.println( "\t\t\t|--" + "Futtermenge: " + Tier.getFutterbedarf( ).getFuttermenge( ) + " Futtername: " + Tier.getFuttersorte( ) );
                }
            }
            System.out.println( "*************************************" );
            System.out.println("Zuständigkeitsliste:" );
            for (Pfleger pfleger: pflegerArrayList) {

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
