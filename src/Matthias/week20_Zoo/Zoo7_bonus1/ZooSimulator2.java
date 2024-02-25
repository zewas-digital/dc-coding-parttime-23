package Matthias.week20_Zoo.Zoo7_bonus1;


import java.util.*;

public class ZooSimulator2 {
    Zoo zoo;

    public ZooSimulator2( Zoo zoo ) {
        this.zoo = zoo;
    }

    public void TagesSimulation(int anzahlTage


    ) {
        for (int i = 0; i <= anzahlTage; i++) {
            System.out.println( "+– | Tag " + i + " " + "–".repeat( 52 ) + "+" );
            this.zoo=Objekt_11_ZooSimulationBonus1.getDemoZoo();
            bissSimulation(  );
        }
    }

    public void bissSimulation( ) {
            for (Gehege g : this.zoo.getGehegeVListe( )) {
                int counter = 0;
                //solange bis die Liste leer ist wird gekämpft
                if(!g.getTierListe().isEmpty()) {

                    while ( g.getTierListe( ).size( ) > 1 ) {
                        ArrayList<Tier> copy= (ArrayList<Tier>) g.getTierListe().clone();
                        for (Tier t : copy) {
                            // Random Bisswarhscheinlichkeit
                            if ( t.bissWahrscheinlichkeit() <= 0.4 ) {
                                Tier zufallsTier=g.zufallsTier( g );
                                g.getTierListe( ).remove( t);// Tier rausnemen
                                int bissKamptier = t.getBiss( );
                                zufallsTier.wirdVerletzt( bissKamptier );
                                // setzen des OpferTieres
                                if (zufallsTier.istLebendig()) {
                                    System.out.println( zufallsTier.getAnimalName() + " wurde gebissen " +" Neue Gesundheit: " + zufallsTier.getMaxGesundheit());
                                } else {
                                    System.out.println(zufallsTier.getAnimalName() + " wurde gebissen " +" !Meldung!: Bin gestorben ");
                                    //g.getTierListe( ).remove( g.getTierListe( ).get( randomInt ) );//wenn die Gesundheit unter 0 ist wird das Random Tier aus der liste Rausgenommen
                                }
                                g.getTierListe( ).add( t );// Kampftier hat seine Aggresionnen abgebaut und geht wieder ins Gehege
                            }
                        }
                    }
                    System.out.println( g.getTierListe().get( 0 ).getAnimalName()+" ich habe mich im Duell durchgesetzt!" );

                }

            }
    }
}
