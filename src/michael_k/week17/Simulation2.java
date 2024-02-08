package michael_k.week17;

import java.util.ArrayList;
import java.util.Random;

public class Simulation2 {

    private Zoo zoo;
    private Gehege gehegeSchwaechstesTier;
    private Tiere tierSchwaechstesTier;

    public  Simulation2(Zoo zoo){
        this.zoo = zoo;
    }
    public void tagesSimulation(){

        tiereStreiten();
        printTiergesundheit ();
        toteTiereEntfernen ();
        sucheSchwaechstesZootier ();
        System.out.println ( zoo.tierarzt.name + " begibt sich zum Gehege " + gehegeSchwaechstesTier.name + " und verarztet das Tier " + tierSchwaechstesTier.name );
        verarztung ( tierSchwaechstesTier );

    }
    private void printTiergesundheit(){

        for (Gehege gehege: this.zoo.zoogehege) {
            System.out.println ("Gehege: " + gehege.name );

            for (int i = 0; i < gehege.gehegeTiere.size ( ) ; i++) {

                String energiebalken = "[";

                for (int j = 0; j < gehege.gehegeTiere.get ( i ).getGesundheitRelativ (); j+=2) {
                    energiebalken = energiebalken + "|";
                }

                System.out.printf("%-51s] ", energiebalken);
                System.out.println (gehege.gehegeTiere.get ( i ).name );

            }
        }
    }
    private void verarztung(Tiere tier){
        Random zufall = new Random ();
        int gesundheitswiederherstellungRelativ = zufall.nextInt (30,101);

        int gesundheitswiederherstellungAbsolut = tier.gesundheitMax*(gesundheitswiederherstellungRelativ/100);

        tier.gesundheitAbsolut = tier.gesundheitAbsolut + gesundheitswiederherstellungAbsolut;
        if( tier.gesundheitAbsolut> tier.gesundheitMax){
            tier.gesundheitAbsolut = tier.gesundheitMax;
        }
    }
    private void sucheSchwaechstesZootier(){

        for (Gehege gehege: this.zoo.zoogehege) {

            if (gehege.gehegeTiere.size ()>1) {

                for (int i = 0; i < gehege.gehegeTiere.size ( ) - 1; i++) {

                    if (gehege.gehegeTiere.get ( i ).getGesundheitRelativ ( ) <= gehege.gehegeTiere.get ( i + 1 ).getGesundheitRelativ ( )) {

                        gehegeSchwaechstesTier = gehege;
                        tierSchwaechstesTier = gehege.gehegeTiere.get ( i );
                    }
                }
            }
        }
    }
    private void toteTiereEntfernen(){

        for (Gehege gehege: this.zoo.zoogehege) {

            for (int k = 0; k < gehege.gehegeTiere.size (); k++) {

                if (gehege.gehegeTiere.get ( k ).gesundheitAbsolut <= 0 ){
                    System.out.println ( "Der Pfleger hat " + gehege.gehegeTiere.get ( k ).name + " im Gehege "+ gehege.name +" tot aufgefunden und entfernt." );
                    gehege.gehegeTiere.remove ( k );

                }
            }
        }
    }
    private void tiereStreiten(){

        for (Gehege gehege: this.zoo.zoogehege) {
            System.out.println ("Gehege 1: "+gehege.name );
            for (Tiere tier: gehege.gehegeTiere){

                Tiere zufallstier = zufallstierStreiten ( tier, gehege.gehegeTiere );
                if (zufallstier == null){
                    System.out.println (" - keiner streitet." );
                }
                else {
                    Random zufall = new Random ();
                    int bisswahrscheinlichkeit = zufall.nextInt (0,101);

                    if(bisswahrscheinlichkeit <=40) {
                        zufallstier.gesundheitAbsolut = zufallstier.gesundheitAbsolut - tier.biss;
                    }
                    System.out.println ( " - "+tier.name + " hat mit "+ zufallstier.name+ " gestritten." );
                }
            }
        }
    }
    private Tiere zufallstierStreiten( Tiere tier, ArrayList<Tiere> gehegeTiere){

        Random zufall = new Random ();
        int anzahlTiere = gehegeTiere.size ();
        boolean gleichartigeTiere = true;

        for (Tiere t: gehegeTiere) {
            if (!t.name.equals ( tier.name )){
                gleichartigeTiere = false;
            }
        }
        Tiere zufallstier= gehegeTiere.get ( zufall.nextInt ( 0, anzahlTiere  ) );
        if(gehegeTiere.size () == 1 || gleichartigeTiere){zufallstier = null;}
        else {
            while ( zufallstier.name.equals ( tier.name ) ) {
                zufallstier = gehegeTiere.get ( zufall.nextInt ( 0, anzahlTiere  ) );
            }
        }
        return zufallstier;
    }

}
