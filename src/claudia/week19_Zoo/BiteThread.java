package claudia.week19_Zoo;

import claudia.week18_neuerZoo.*;

import java.util.ArrayList;

public class BiteThread extends Thread {
    private Gehege gehege;
    private int counter;

    public BiteThread(Gehege gehege, int counter){
        this.gehege = gehege;
        this.counter = counter;
    }
    public void run(){
        //System.out.println("innerhalb " + getName());

        ArrayList<Tier> listeDerTiere = gehege.getListeDerTiere();
        //Zoohilfe.printArrayListTiere(listeDerTiere);

        for (Tier tier : listeDerTiere) {
            //System.out.println("*".repeat(this.counter * 5) + "Schleife " + tier.getName());
            if (tier.getHealthActual() > 0) { //nur lebendige Tiere können beißen
                Tier zufaelligesTier = tier;
                //Tier beißt sich nicht selber, Tier mit Health < 0 wird nicht mehr gebissen:
                //TODO potentielle Endlosschleife!
                while (zufaelligesTier.equals(tier) || (zufaelligesTier.getHealthActual() <= 0)) {
                    zufaelligesTier = Zoohilfe.chooseRandom(listeDerTiere);
                }
                //System.out.println(tier.getName() + " " + zufaelligesTier.getName());
                //System.out.print("\t".repeat(this.counter * 2) + " im Gehege " + gehege.getName());
                tier.bite(zufaelligesTier, counter);
                try {
                    Thread.sleep(500);}
                catch (InterruptedException e){
                    throw new RuntimeException(e);
                }
            }
        }
        //gehege.removeDeadAnimals();




    }

}
