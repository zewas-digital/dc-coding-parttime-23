package Matthias.week19_Zoo;

import java.util.ArrayList;

public class Pfleger {
    private String name;

    private ArrayList<Gehege> zustaendigFuerGehege;

    public Pfleger( String name){

        this.name=name;
        this.zustaendigFuerGehege=new ArrayList<>(  );
    }

    public ArrayList<Gehege> getZustaendigFuerGehege() {
        return zustaendigFuerGehege;
    }

    public String getName() {
        return name;
    }

    public void verantworlichFuerGehege( Gehege gehege ){
        this.zustaendigFuerGehege.add( gehege );
    }

    public void geheZuGehge(){
        while ( true ) {
            for (Gehege g : this.zustaendigFuerGehege) {
                if ( !g.isGehegeFutterStatus( ) ) {
                    g.setGehegeFutterStatus( true );
                    System.out.println( this.name + ":" + "Ich habe das " + g.getStandort( ) + "angesehen und den Stautus auf :" + g.isGehegeFutterStatus( ) );
                } else {
                    System.out.println( this.name + ":" + "Der Standort: " + g.getStandort( ) + "wurde schon barbeitet" );
                }
            }
        }
    };
}
