package claudia.week19_Zoo;

import claudia.week18_neuerZoo.*;

import java.util.ArrayList;
import java.util.Vector;

public class BiteThread extends Thread {
    private Gehege gehege;
    private int counter;

    public BiteThread(Gehege gehege, int counter){
        this.gehege = gehege;
        this.counter = counter;
    }
    public void run(){

        ArrayList<Tier> listeDerTiere = gehege.getListeDerTiere();
        Vector<Tier> lDT = new Vector<>(listeDerTiere);

        //Zoohilfe.printArrayListTiere(listeDerTiere);

        for (Tier tier : lDT) {

            if (tier.getHealthActual() > 0) { //nur lebendige Tiere können beißen
                Tier zufaelligesTier = tier;
                //Tier beißt sich nicht selber, Tier mit Health < 0 wird nicht mehr gebissen:
                //TODO potentielle Endlosschleife!
                while (zufaelligesTier.equals(tier) || (zufaelligesTier.getHealthActual() <= 0)) {
                    zufaelligesTier = Zoohilfe.chooseRandom(listeDerTiere);
                }

                tier.bite(zufaelligesTier, counter);


            }
        }
        /*
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }*/
        //gehege.removeDeadAnimals();




    }

}
