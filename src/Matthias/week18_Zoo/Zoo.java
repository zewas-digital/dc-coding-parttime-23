package Matthias.week18_Zoo;

import java.util.ArrayList;

public class Zoo {
    private  String zooname;
    private int builddate;
    private ArrayList<Gehege> gehegeArrayList = new ArrayList<>( );
    public Zoo(String zooname,int builddate ){
        this.zooname =zooname;
        this.builddate=builddate;
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
                System.out.println( "\t|--"+gehege);
            }
    }

    @Override
    public String toString(){
        return "Zoo: " + this.zooname + ", gegründet " + this.builddate;
    }
}
