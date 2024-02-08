package saifedine.week20_Zoo.V01;

import java.util.Collections;
import java.util.HashMap;
import java.util.Random;
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

    public void beobachten(Gehege gehege) {

            Random zufallsTierAuswahl = new Random();
            int zufallsZahl = zufallsTierAuswahl.nextInt(gehege.gettierArrayList().size());

            gehege.gettierArrayList().get(zufallsZahl);
            System.out.print(" das zufällige Tier " + gehege.gettierArrayList().get(zufallsZahl));

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

    public void arbeitsSimulation() {

        // Arbeitslisten

        // Liste aller Pfleger, geklont
        Vector<Pfleger> pflegerListe = (Vector) this.zoo.pfleger.clone();
        //System.out.println("PflegerListe: " + pflegerListe);

        // wer hat was zu erledigen?
        HashMap<Pfleger, Vector<Gehege>> pfleger_zuErledigendeGehege = new HashMap<>();
        //System.out.println("pfleger_zuErledigendeGehegeV1 " + pfleger_zuErledigendeGehege);

        for (Pfleger pfleger : this.zoo.pfleger) {
            // Aufgabenliste des Pflegers mit zufälliger Reihenfolge
            Vector<Gehege> pflegerTodoList = (Vector) pfleger.gehegeZustaendigkeit.clone();
            //System.out.println("pflegerTodoList " + pflegerTodoList);
            Collections.shuffle(pflegerTodoList);

            pfleger_zuErledigendeGehege.put(pfleger, pflegerTodoList);
        }
        //System.out.println("\npfleger_zuErledigendeGehegeV2 " + pfleger_zuErledigendeGehege);


        // Arbeit

        // https://www.geeksforgeeks.org/convert-arraylist-to-vector-in-java/

        // Liste aller Gehege, geklont
        //System.out.println("Array Liste aller Gehege im Zoo " + Arrays.toString(this.zoo.getgehegeArrayList().toArray()));
        Vector<Gehege> zuErledigendeGehege = new Vector<Gehege>(this.zoo.getgehegeArrayList());
        //System.out.println("Kopie der Array Liste aller Gehege im Zoo " + zuErledigendeGehege);

        // Ablauf -------------------------
        // So lange Gehege zu erledigen sind, wird gearbeitet ;-)
        while (!zuErledigendeGehege.isEmpty()) {


            // jeder Pfleger erledigt 1 Gehege
            for (Pfleger pfleger : this.zoo.pfleger) {

                Gehege gehegeTodo = null;
                // Solange Pfleger etwas zu erledigen hat:
                while (pfleger_zuErledigendeGehege.get(pfleger).size() > 0) {
                    // Pfleger möchte dieses Gehege erledigen
                    gehegeTodo = pfleger_zuErledigendeGehege.get(pfleger).firstElement();

                    // ist es noch zu erledigen?
                    if (zuErledigendeGehege.contains(gehegeTodo)) {
                        // Aufgabe gefunden
                        break;
                    } else {
                        // entferne Gehege von zu erledigenden Pfleger-Gehegen
                        pfleger_zuErledigendeGehege.get(pfleger).remove(gehegeTodo);
                        gehegeTodo = null; // hier auch gehegeTodo zurücksetzen!
                    }
                }

                if (gehegeTodo != null) {
                    // hier wird seine Aufgabe abgearbeitet und sonstiges gemacht
                    System.out.printf(pfleger.getName() + " erledigt " + gehegeTodo.getGehegeName() + ".");

                    System.out.print("\nTiere im " + gehegeTodo.getGehegeName() + " wurden ");
                    futtern();
                    System.out.print(pfleger.getName() + " hat im " + gehegeTodo.getGehegeName());
                    beobachten(gehegeTodo);

                    // entferne Gehege von zu erledigenden Zoo-Gehegen
                    zuErledigendeGehege.remove(gehegeTodo);

                    // entferne Gehege von zu erledigenden Pfleger-Gehegen
                    pfleger_zuErledigendeGehege.get(pfleger).remove(gehegeTodo);
                } else {
                    System.out.printf(pfleger.getName() + " ist fertig.");
                    System.out.println();
                }
            }
        }
    }

    /*
    public void zufallsTier() {

        Vector<Tiere> zuBeobachtendeTiere = new Vector<Tiere>();

        for (Gehege gehege : this.zoo.getgehegeArrayList()) {

            for (Tiere tiere : gehege.gettierArrayList()) {

                zuBeobachtendeTiere.add(tiere);

            }
        }

        if (this.zoo.getgehegeArrayList().contains(gehege.gettierArrayList().equals(zuBeobachtendeTiere))){

            System.out.println("zuBeobachtendeTiere " + zuBeobachtendeTiere);

            Random zufallsTierAuswahl = new Random();
            int zufallsZahl = zufallsTierAuswahl.nextInt(zuBeobachtendeTiere.size());

            zuBeobachtendeTiere.get(zufallsZahl);
            System.out.println("ZufallsTier: " + zuBeobachtendeTiere.get(zufallsZahl));
        }
    }

     */
}




