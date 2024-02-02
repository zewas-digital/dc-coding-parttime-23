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
        //Zoo erstellen
        Zoo zoo = Zoohilfe.erstelleStandardZooMitPflegern();
        ArrayList<Gehege> listeDerGehege = zoo.getListeDerGehege();
        ArrayList<Tier> listeAllerTiereImZoo = zoo.getListeDerTiere();

        /*
        Scanner sc = new Scanner(System.in);
        zoo.feedAll();

        Lagerhaus.Futterarten futterart = Lagerhaus.Futterarten.GRAS;
        zoo.getDirektor().buy(zoo.getLagerhaus(), futterart);
        zoo.getDirektor().buy(zoo.getLagerhaus(), Lagerhaus.Futterarten.FISCH);
*/
        for (Tier tier : listeAllerTiereImZoo) {
            System.out.println(tier.getName() + " Gesundheit: " + tier.getHealthActual());
        }

        System.out.println("\nZoo erstellt, jetzt wird gebissen! ");
        System.out.println("\nStarte Zoowoche mit ENTER!");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();

        System.out.println("\nEine Woche im Zoo: ");

        for (int i = 0; i < 7; i++) {
            System.out.println("\n*** TAG " + (i + 1) + " ***");
            //Zum Starten HasBitten auf False setzen:
            Zoohilfe.setAllAnimalsToHasntBitten(listeAllerTiereImZoo);

            for (Gehege gehege : listeDerGehege) {
                ArrayList<Tier> listeDerTiere = gehege.getListeDerTiere();
                if (listeDerTiere.size() > 1) { //sonst ist nur ein Tier übrig => kein Beißen
                    for (Tier tier : listeDerTiere) {
                        if (tier.getHealthActual() > 0) { //nur lebendige Tiere können beißen
                            Tier zufaelligesTier = tier;
                            //Tier beißt sich nicht selber, Tier mit Health < 0 wird nicht mehr gebissen:
                            while (zufaelligesTier.equals(tier) || (zufaelligesTier.getHealthActual() <= 0)) {
                                zufaelligesTier = Zoohilfe.chooseRandom(listeDerTiere);
                            }
                            tier.bite(zufaelligesTier);
                        }
                    }
                }
                gehege.removeDeadAnimals();
            }
            System.out.println("Am Ende des Tages tote Tiere entfernen...");
            zoo.removeAllDeadAnimals();
            System.out.println("... und alle Tiere füttern.");
            zoo.feedAll();
            //listeAllerTiereImZoo = zoo.getListeDerTiere();

            //Zoohilfe.printArrayListTiere(listeAllerTiereImZoo);
        }
        listeAllerTiereImZoo = zoo.getListeDerTiere();
        for (Tier t : listeAllerTiereImZoo) {
            System.out.println("Gesundheit " + t.getName() + " = " + t.getHealthActual());
        }
    }


}
