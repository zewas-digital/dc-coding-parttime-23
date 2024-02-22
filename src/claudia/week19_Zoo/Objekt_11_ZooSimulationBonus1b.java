package claudia.week19_Zoo;

import claudia.week18_neuerZoo.Gehege;
import claudia.week18_neuerZoo.Tier;
import claudia.week18_neuerZoo.Zoo;
import claudia.week18_neuerZoo.Zoohilfe;

import java.util.ArrayList;
import java.util.Scanner;

public class Objekt_11_ZooSimulationBonus1b {
    public static void main(String[] args) throws InterruptedException {
        //Versuch mit Threads...

        //Zoo erstellen
        Zoo zoo = Zoohilfe.erstelleStandardZooMitPflegern();
        ArrayList<Gehege> listeDerGehege = zoo.getListeDerGehege();

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


            int counter = 0;
            for (Gehege g : listeDerGehege) {
                ArrayList<Tier> tiereImGehege = g.getListeDerTiere();
                if (tiereImGehege.size() > 1) {//Sonst ist nur noch ein Tier im Gehege, was niemanden beißen kann!
                    BiteThread bt = new BiteThread(g, counter);
                    bt.start();
                    System.out.println("\n* - * - * Thread " + counter + " gestartet! Gehege: " + g + " Anzahl der Tiere: " + tiereImGehege.size() );
                    counter++;
                    //bt.join();
                }
            }

            /*
            BiteThread bt0 = new BiteThread(listeDerGehege.get(0), 0);
            BiteThread bt1 = new BiteThread(listeDerGehege.get(1), 1);
            BiteThread bt2 = new BiteThread(listeDerGehege.get(2), 2);
            BiteThread bt3 = new BiteThread(listeDerGehege.get(3), 3);

            bt0.start();
            bt1.start();
            bt2.start();
            bt3.start();

            bt0.join();
            bt1.join();
            bt2.join();
            bt3.join();
            */
            zoo.removeAllDeadAnimals();
            zoo.feedAll();
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