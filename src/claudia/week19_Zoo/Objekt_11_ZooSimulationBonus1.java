package claudia.week19_Zoo;

/*
Bonusaufgabe: Simulation 0.2
Erweitere die Simulation

1/ Jedes Tier hat eine Gesundheit, eine MaxGesundheit und einen Biss.
2/ Jedes Tier versucht mit 40 % Wahrscheinlichkeit, einen Nachbar von ihm aus dem gleichen Gehege zu beißen.
3/ Falls ein Tier gebissen wird, wird seine Gesundheit mit dem Biss vom Angreifer reduziert
3.1/ "Tote Tiere" beißen nicht.
4/ Am Ende des Tages werden "tote Tiere" aus dem Gehege entfernt

Lass auf der Konsole ausdrucken, wer was macht.
 */

import claudia.week18_neuerZoo.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Objekt_11_ZooSimulationBonus1 {
    public static void main(String[] args) {
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

/*


        for (int i = 0; i < 20; i++) {
//TODO Falls Gehege nur noch ein Tier enthält, abbrechen!
            //TODO Falls Tier schon tot, nicht mehr beißen
            System.out.println((i + 1) + "-ter Tag");
            //Zum Starten HasBitten auf False setzen:
            Zoohilfe.setAllAnimalsToHasntBitten(listeDerTiere);



            for (Tier tier : listeDerTiere) {
                if (tier.getHealthActual() > 0) { //nur lebendige Tiere können beißen
                    Tier zufaelligesTier = tier;
                    //Tier beißt sich nicht selber, Tier mit Health < 0 wird nicht mehr gebissen:
                    //TODO potentielle Endlosschleife!
                    while (zufaelligesTier.equals(tier) || (zufaelligesTier.getHealthActual() <= 0)) {
                        zufaelligesTier = Zoohilfe.chooseRandom(listeDerTiere);
                    }
                    tier.bite(zufaelligesTier);
                }
            }
            gehege.removeDeadAnimals();
            Zoohilfe.printArrayListTiere(listeDerTiere);
        }
       //

        for (Tier t : gehege.getListeDerTiere()) {
            System.out.println(t.getHealthActual());
        }


        gehege.removeDeadAnimals();

        Zoohilfe.printArrayListTiere(gehege.getListeDerTiere());
*/

    }



}
