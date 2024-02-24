package claudia.week19_Zoo;

import claudia.week18_neuerZoo.*;
import claudia.week21_Threads.ThreadPfleger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Objekt_11_ZooSimulationBonus1b {
    public static void main(String[] args) throws InterruptedException {
        //Versuch mit Threads...

        //Zoo erstellen
        Zoo zoo = Zoohilfe.erstelleStandardZooMitPflegern();
        ArrayList<Gehege> listeDerGehege = Zoohilfe.shufflecloneGehege(zoo.getListeDerGehege());
        ArrayList<Pfleger> listeDerPfleger = Zoohilfe.shuffleclonePfleger(zoo.getListeDerPfleger());

        //System.out.println("Folgende Tiere gibt es im Zoo: ");
        //Zoohilfe.printArrayListTiere(zoo.getListeDerTiere());

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("\nStarte Zoowoche mit ENTER!");
        sc.nextLine();
        System.out.println("\nEine Woche im Zoo: ");
        */

        for (int i = 0; i < 10; i++) {
            System.out.println("\n *** TAG " + (i + 1) + " *** ");
            //Zum Starten HasBitten auf False setzen:
            Zoohilfe.setAllAnimalsToHasntBitten(zoo.getListeDerTiere());

            //Hashmap mit allen Threads:
            HashMap<Gehege, BiteThread> biteThreads = new HashMap<>();
            HashMap<Pfleger, PflegerThread> pflegerThreads = new HashMap<>();

            int counter = 0;
            for (Gehege g : listeDerGehege) {
                ArrayList<Tier> tiereImGehege = g.getListeDerTiere();
                if (tiereImGehege.size() > 1) {//Sonst ist nur noch ein Tier im Gehege, was niemanden beißen kann!
                    //erzeuge neuen Thread
                    BiteThread bt = new BiteThread(g, counter);
                    //füge Thread in Hashmap ein:
                    biteThreads.put(g, bt);
                    //starte Thread:
                    bt.start();
                    //System.out.println("\n* - * - * Thread " + counter + " gestartet! Gehege: " + g + " Anzahl der Tiere: " + tiereImGehege.size() );
                    counter++;
                   // bt.join();
                }
            }
            counter = 0;
            for (Pfleger pfleger : listeDerPfleger){
                PflegerThread pt = new PflegerThread(zoo, pfleger, counter);
                pflegerThreads.put(pfleger, pt);
                pt.start();
                counter++;
            }


            //alle Threads beenden
            for (BiteThread bt : biteThreads.values()) {
                bt.join();
            }
            for (PflegerThread pt : pflegerThreads.values()){
                pt.join();
            }

            zoo.removeAllDeadAnimals();
            //zoo.feedAll();
            //Objekt_11_ZooSimulationBonus1.printTierTabelle(zoo);
            try {
                Thread.sleep(1000);}
            catch (InterruptedException e){
                throw new RuntimeException(e);
            }

        }
        //System.out.println("Tierbestand am Ende: ");
        //Zoohilfe.printArrayListTiere(zoo.getListeDerTiere());

    }
}