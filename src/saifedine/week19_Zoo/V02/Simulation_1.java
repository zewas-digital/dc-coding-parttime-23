package saifedine.week19_Zoo.V02;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Vector;

public class Simulation_1 {

    Zoo zoo;
    Pfleger pfleger;

    Gehege gehege;

    HashMap<Gehege, Pfleger> toDoListZoo = new HashMap<>();

    public Simulation_1(Zoo zoo) {
        this.zoo = zoo;
    }

    public String toString() {
        return zoo + " ist Simulation_1 zugeordnet";
    }

    public void futtern() {
        System.out.print("gefüttert!\n");
    }

    public void beobachten() {
        System.out.print(" beobachtet!\n\n");
    }


    public boolean checkZustaendigkeit(Pfleger pfleger, Gehege gehege) {

        boolean vorhanden1 = false;

        if (zoo.pfleger.contains(pfleger) && zoo.getgehegeArrayList().contains(gehege)) {

            for (int i = 0; i < zoo.pfleger.size(); i++) {

                if (pfleger.gehegeZustaendigkeit.contains(gehege)) {
                    return vorhanden1 = true;
                }
            }
        } else {

            System.out.println("\n" + pfleger + " oder  " + gehege + " ist diesem Zoo nicht zugeordnet!!");

            return vorhanden1 = false;
        }
        return vorhanden1;
    }

    public void arbeitListe() {

        // hier stehen geblieben

        //toDo
        // arrayList clone to vector

        // https://www.geeksforgeeks.org/convert-arraylist-to-vector-in-java/

        // Liste aller Gehege

        //System.out.println("Array Liste aller Gehege im Zoo " + Arrays.toString(this.zoo.getgehegeArrayList().toArray()));

        Vector<Gehege> zuErledigendeGehege = new Vector<>(this.zoo.getgehegeArrayList());
        //System.out.println("Kopie der Array Liste aller Gehege im Zoo " + zuErledigendeGehege);

        // wer hat was zu erledigen?


    }

    /*
    public void arbeitListe() {

        for (int i = 0; i < zoo.getgehegeArrayList().size(); i++) {

            // clone Plegerliste
            // shuffle
            // foreach

            Vector<Pfleger> pflegerListe = (Vector)this.zoo.pfleger.clone();
            Collections.shuffle(pflegerListe);

            for (Pfleger pfleger : pflegerListe) {

                if (pfleger.gehegeZustaendigkeit.contains(zoo.getgehegeArrayList().get(i))) {

                    toDoListZoo.put(zoo.getgehegeArrayList().get(i), pfleger);
                    break;
                }
            }
        }
        System.out.println(toDoListZoo + "\n");
    }
     */

        public void arbeit (Zoo zoo){

            while (toDoListZoo.size() > 0) {

                for (Gehege gehege : toDoListZoo.keySet()) {

                    System.out.println(gehege + " ist erledigt von " + toDoListZoo.get(gehege));

                    System.out.print("Tiere im " + gehege + " wurden ");
                    futtern();
                    System.out.print(toDoListZoo.get(gehege) + " hat die Tiere im " + gehege);
                    beobachten();

                }
                toDoListZoo.clear();
            }
        }
    }




