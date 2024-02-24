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
                            double bissWahrschZahl = Math.random( );
                            if ( bissWahrschZahl <= 0.4 ) {
                                g.getTierListe( ).remove( t );// Tier rausnemen
                                // ZufallsTierAuswahl
                                Random random = new Random( );
                                int randomInt = random.nextInt( 0, g.getTierListe( ).size( ) );
                                int gesundheitOpfer = g.getTierListe( ).get( randomInt ).getMaxGesundheit( );
                                int bissKamptier = t.getBiss( );
                                int gesundheitNeu = gesundheitOpfer - bissKamptier;
                                // setzen des OpferTieres
                                if ( 0 < gesundheitNeu ) {
                                    System.out.println( g.getTierListe().get( randomInt ).getAnimalName() + " wurde gebissen " +" Neue Gesundheit: " + gesundheitNeu);
                                    g.getTierListe( ).get( randomInt ).setMaxGesundheit( gesundheitNeu ); //neue Gesundheit wird dem OpferTierzugewiesen
                                } else {
                                    System.out.println( g.getTierListe().get( randomInt ).getAnimalName() + " wurde gebissen " +" !Meldung!: Bin gestorben ");
                                    g.getTierListe( ).remove( g.getTierListe( ).get( randomInt ) );//wenn die Gesundheit unter 0 ist wird das Random Tier aus der liste Rausgenommen
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
