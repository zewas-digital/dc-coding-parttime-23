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

public class Objekt_11_ZooSimulationBonus1 {
    public static void main(String[] args) {
        Zoo zoo = Zoohilfe.erstelleStandardZooMitPflegern();
        Gehege gehege = zoo.getListeDerGehege().get(0);
        Zoohilfe.setAllAnimalsToHasntBitten(gehege.getListeDerTiere());
        Zoohilfe.printArrayListTiere(gehege.getListeDerTiere());

        gehege.removeDeadAnimals();

        for (Tier t : gehege.getListeDerTiere()) {
            System.out.println(t.getHealthActual());
        }

        Tier t5 = Zoohilfe.chooseRandom(gehege.getListeDerTiere());
        Tier t6 = Zoohilfe.chooseRandom(gehege.getListeDerTiere());
        System.out.println(t5.getName());
        System.out.println(t6.getName());

        for (int i = 0; i < 10; i++) {
            t5.bite(t6);
            t5.setHasBitten(false);
        }
        for (Tier t : gehege.getListeDerTiere()) {
            System.out.println(t.getHealthActual());
        }


        gehege.removeDeadAnimals();

        Zoohilfe.printArrayListTiere(gehege.getListeDerTiere());
    }
        /*
        Tier t1 = Zoohilfe.chooseRandom(zoo.getListeDerTiere());
        Tier t2 = Zoohilfe.chooseRandom(zoo.getListeDerTiere());
        Tier t3 = Zoohilfe.chooseRandom(zoo.getListeDerTiere());
        Tier t4 = Zoohilfe.chooseRandom(zoo.getListeDerTiere());

        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(t3.getName());
        System.out.println(t4.getName());

        /*
        t1.bite(t2);
        t2.bite(t3);
        t3.bite(t4);
        t4.bite(t1);*/
/*
        for (int i = 0; i < 10; i++) {
            t1.bite(t2);
        }
*/
   // }

}
