package Matthias.week20_Zoo.Zoo8_bonus2;

import java.util.Vector;

public class Pfleger {
    private String name;

    private Vector<Gehege> zustaendigFuerGehege;

    public Pfleger( String name){

        this.name=name;
        this.zustaendigFuerGehege=new Vector<>(  );
    }

    public Vector<Gehege> getZustaendigFuerGehege() {
        return this.zustaendigFuerGehege;
    }

    public String getName() {
        return name;
    }

    public void verantworlichFuerGehege( Gehege gehege ){
        this.zustaendigFuerGehege.add( gehege );
    }

    public void abarbeitungEinesGeheges(int indexGehege) {
        if ( this.zustaendigFuerGehege.get( indexGehege ).getGehegeFutterStatus( ) ) {

            System.out.println( this.name + ":" + "Der Standort: " + this.zustaendigFuerGehege.get( indexGehege ).getStandort( ) + "wurde schon barbeitet" );

        } else if ( !zustaendigFuerGehege.get( indexGehege ).getGehegeFutterStatus( ) ) {

            zustaendigFuerGehege.get( indexGehege ).setGehegeFutterStatus( true );
            System.out.println( this.name + ":" + "Ich habe das " + this.zustaendigFuerGehege.get( indexGehege ).getStandort( ) + "angesehen und den Stautus auf :" + this.zustaendigFuerGehege.get( indexGehege ).getGehegeFutterStatus( ) );
        } else if ( zustaendigFuerGehege.isEmpty()) {
            System.out.println(  this.name+":"+"Ich bin fertig! und mache Pause");
        }

    }
}
