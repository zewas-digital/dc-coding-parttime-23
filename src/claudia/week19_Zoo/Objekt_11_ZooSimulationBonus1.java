package claudia.week19_Zoo;

/*
Bonusaufgabe: Simulation 0.2
Erweitere die Simulation

1/ Jedes Tier hat eine Gesundheit, eine MaxGesundheit und einen Biss.
2/ Jedes Tier versucht mit 40 % Wahrscheinlichkeit, einen Nachbarn von ihm aus dem gleichen Gehege zu beißen.
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

        printTierTabelle(zoo);

        //zoo.feedAll();
        /*
        Lagerhaus.Futterarten futterart = Lagerhaus.Futterarten.GRAS;
        zoo.getDirektor().buy(zoo.getLagerhaus(), futterart);
        zoo.getDirektor().buy(zoo.getLagerhaus(), Lagerhaus.Futterarten.FISCH);
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("\nZoo erstellt, jetzt wird gebissen! ");
        System.out.println("\nStarte Zoowoche mit ENTER!");
        sc.nextLine();

        System.out.println("\nEine Woche im Zoo: ");
        dailyScheduleBiting(zoo, 7);

    }

    public static void dailyScheduleBiting(Zoo zoo, int numberOfDays) {
        ArrayList<Tier> listeAllerTiereImZoo = zoo.getListeDerTiere();
        ArrayList<Gehege> listeDerGehege = zoo.getListeDerGehege();

        for (int day = 1; day < numberOfDays; day++) {
            System.out.println("\n*** TAG " + (day + 1) + " ***");
            //Zum Starten HasBitten auf False setzen:
            Zoohilfe.setAllAnimalsToHasntBitten(listeAllerTiereImZoo);

            letAllAnimalsBite(listeDerGehege);
            
            System.out.println("Am Ende des Tages tote Tiere entfernen...");
            zoo.removeAllDeadAnimals();
            System.out.println("... und alle Tiere füttern.");
            zoo.feedAll();
            printTierTabelle(zoo);
         
        }
    }

    public static void letAllAnimalsBite(ArrayList<Gehege> listeDerGehege) {
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
            
        }
    }

    public static void printTierTabelle(Zoo zoo) {
        System.out.println("\n      Aktueller Tierbestand im Zoo: ");
        for (Gehege gehege : zoo.getListeDerGehege()) {
            System.out.println("-".repeat(45));
            System.out.printf("%30s", "-> Gehege " + gehege.getName() + " <-");
            System.out.println(" ".repeat(17) + " Gesundheit in %");
            System.out.print("-".repeat(45));
            System.out.println("  0               100");

            if (gehege.getListeDerTiere().isEmpty())
                System.out.println("Keine Tiere im Gehege!\n");
            else {
                for (Tier tier : gehege.getListeDerTiere()) {
                    System.out.printf("%-35s : %5d    ", tier.getName() + ", Gesundheit", tier.getHealthActual());

                    int healthNow = tier.getHealthActual();
                    int healthMax = tier.getHealthMax();
                    double percentage = (double) healthNow / (double) healthMax;
                    double number = 0.05;
                    while (number < percentage) {
                        System.out.print("+");
                        number = number + 0.05;
                    }
                    System.out.println();
                }

            }
        }
    }


}
