package claudia.week19_Zoo;

import claudia.week18_neuerZoo.Gehege;
import claudia.week18_neuerZoo.Tier;
import claudia.week18_neuerZoo.Zoo;
import claudia.week18_neuerZoo.Zoohilfe;

import java.util.ArrayList;
import java.util.Scanner;

public class Objekt_11_ZooSimulationBonus1b {
    public static void main(String[] args) {
        //Versuch mit Threads...

        //TODO Schleife über die Tiere, nicht über Gehege?
        //Zoo erstellen, Gehege aussuchen
        Zoo zoo = Zoohilfe.erstelleStandardZooMitPflegern();
        //Gehege gehege = zoo.getListeDerGehege().get(1);
        //ArrayList<Tier> listeDerTiere = gehege.getListeDerTiere();
        ArrayList<Gehege> listeDerGehege = zoo.getListeDerGehege();

        System.out.println("Folgende Tiere gibt es im Zoo: ");
        Zoohilfe.printArrayListTiere(zoo.getListeDerTiere());

        Scanner sc = new Scanner(System.in);

        System.out.println("\nStarte Zoowoche mit ENTER!");
        sc.nextLine();

        System.out.println("\nEine Woche im Zoo: ");

        for (int i = 0; i < 1; i++) {
            System.out.println("\n *** TAG " + (i + 1) + " *** ");
            //Zum Starten HasBitten auf False setzen:
            Zoohilfe.setAllAnimalsToHasntBitten(zoo.getListeDerTiere());

            int counter = 0;
            for (Gehege g : listeDerGehege) {

                ArrayList<Tier> tiereImGehege = g.getListeDerTiere();
                if (tiereImGehege.size() > 1) {//Sonst ist nur noch ein Tier im Gehege, was niemanden beißen kann!
                    BiteThread bt = new BiteThread(g, counter);
                    bt.start();
                    counter++;
                }
            }
        }
        zoo.removeAllDeadAnimals();
        zoo.feedAll();
        Zoohilfe.printArrayListTiere(zoo.getListeDerTiere());

        for (int i = 0; i < 1; i++) {
            System.out.println("\n *** TAG " + (i + 1) + " *** ");
            //Zum Starten HasBitten auf False setzen:
            Zoohilfe.setAllAnimalsToHasntBitten(zoo.getListeDerTiere());

            int counter = 0;
            for (Gehege g : listeDerGehege) {

                ArrayList<Tier> tiereImGehege = g.getListeDerTiere();
                if (tiereImGehege.size() > 1) {//Sonst ist nur noch ein Tier im Gehege, was niemanden beißen kann!
                    BiteThread bt = new BiteThread(g, counter);
                    bt.start();
                    counter++;
                }
            }
        }

        zoo.removeAllDeadAnimals();
        zoo.feedAll();
        Zoohilfe.printArrayListTiere(zoo.getListeDerTiere());

    }
}