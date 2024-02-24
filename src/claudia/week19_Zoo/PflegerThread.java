package claudia.week19_Zoo;

import claudia.week18_neuerZoo.Gehege;
import claudia.week18_neuerZoo.Pfleger;
import claudia.week18_neuerZoo.Zoo;
import claudia.week18_neuerZoo.Zoohilfe;

import java.util.ArrayList;
import java.util.Vector;

public class PflegerThread extends Thread {
    private Zoo zoo;
    private Pfleger pfleger;
    private int counter;
    public PflegerThread(Zoo zoo, Pfleger pfleger, int counter){
        this.counter = counter;
        this.pfleger = pfleger;
        this.zoo = zoo;
    }
    public void run(){
        pfleger.startDay();

            ArrayList<Gehege> gL = Zoohilfe.shufflecloneGehege(pfleger.getListeDerBetreutenGehege());
            Vector<Gehege> gehegeListe = new Vector<Gehege>(gL);


        while (!gehegeListe.isEmpty()) {//Wenn er noch ein Gehege auf seiner Liste hat...
            Gehege gehege = gehegeListe.get(0);

            if (!gehege.isAlreadyFed()) {
                System.out.println("\t".repeat(2 * counter) + pfleger + " füttert im Gehege " + gehege);
                gehege.changeFeedStatus();
            }
            gehegeListe.remove(gehege);

        }

        Zoohilfe.watchRandom(zoo, pfleger);
        Zoohilfe.watchFavourite(zoo, pfleger);

        pfleger.endDay();
    }

}
