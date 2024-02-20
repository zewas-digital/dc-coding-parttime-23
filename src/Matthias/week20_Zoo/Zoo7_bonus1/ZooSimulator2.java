package Matthias.week20_Zoo.Zoo7_bonus1;


import java.util.Collections;
import java.util.HashMap;
import java.util.Vector;

public class ZooSimulator2 {
    Zoo zoo;
    public ZooSimulator2( Zoo zoo) {
        this.zoo=zoo;
    }

    public void TagesSimulation( int anzahlTage ) {
        for (int i = 0; i <= anzahlTage; i++) {
            System.out.println( "+– | Tag " + i + " " + "–".repeat( 52 ) + "+" );
            int indexGehege = 1;
            // was ist zu erledigen?
            Vector<Gehege> zuErledigendeGehege = (Vector) this.zoo.getGehegeVListe().clone( );

            // wer hat was zu erledigen?
            HashMap<Pfleger, Vector<Gehege>> pfleger_zuErledigendeGehege = new HashMap<>( );
            for (Pfleger p : this.zoo.getPflegerVListe()) {
                // Aufgabenliste des Pflegers mit zufälliger Reihenfolge
                Vector<Gehege> pflegerTodoList = (Vector) p.getZustaendigFuerGehege( ).clone( );
                Collections.shuffle( pflegerTodoList );
                pfleger_zuErledigendeGehege.put( p, pflegerTodoList );
            }
            //Ablauf:
            //So lange Gehege erledigt sind wird gearbeitet

            while ( !zuErledigendeGehege.isEmpty( ) ) {
                //jeder Pfleger erledigt 1 Gehege
                for (Pfleger pfleger : this.zoo.getPflegerVListe( )) {
                    Gehege gehegeToDo = null;
                    //so lange bis er es erledigt hat!
                    while ( pfleger_zuErledigendeGehege.get( pfleger ).size( ) > 0 ) {
                        //Pfleger möchte dieses Gehege erledigen
                        gehegeToDo = pfleger_zuErledigendeGehege.get( pfleger ).firstElement( );

                        // ist es noch zu erledigen?
                        if ( zuErledigendeGehege.contains( gehegeToDo ) ) {
                            // Aufgabe gefunden
                            break;
                        } else {
                            // entferne Gehege von zu erledigenden Pfleger-Gehegen
                            pfleger_zuErledigendeGehege.get( pfleger ).remove( gehegeToDo );
                            gehegeToDo = null; // hier auch gehegeTodo zurücksetzen!
                        }
                    }
                    if ( gehegeToDo != null ) {
                        // hier wird seine Aufgabe abgearbeitet und sonstiges gemacht
                        System.out.printf( "%-50s | ", pfleger.getName( ) + " erledigt " + gehegeToDo.getStandort( ) );
                        gehegeToDo.fuetternAlleGehege();
                        if ( !gehegeToDo.getTierListe().isEmpty()) {
                            gehegeToDo.randomTierBeobachten( );
                        }
                        // entferne Gehege von zu erledigenden Zoo-Gehegen
                        zuErledigendeGehege.remove( gehegeToDo );
                        // entferne Gehege von zu erledigenden Pfleger-Gehegen
                        pfleger_zuErledigendeGehege.get( pfleger ).remove( gehegeToDo );
                    } else {
                        System.out.printf( "%-50s | ", pfleger.getName( ) + " ist fertig." );
                    }
                }
                System.out.println( );
                indexGehege++;
            }
        }
        System.out.println( "Tages Simulation Beendet!" );
    }

}
