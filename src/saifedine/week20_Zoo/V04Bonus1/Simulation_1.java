package saifedine.week20_Zoo.V04Bonus1;

import java.util.*;

public class Simulation_1 {

    Zoo zoo;

    public Simulation_1(Zoo zoo) {
        this.zoo = zoo;
    }

    public String toString() {
        return this.zoo + " ist Simulation_1 zugeordnet";
    }

    public void futtern() {
        System.out.print("gefüttert!\n");
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

    public Tiere zufallsTier(Gehege gehege) {

        Random zufallsTierAuswahl = new Random();
        int zufallsZahl = zufallsTierAuswahl.nextInt(gehege.gettierArrayList().size());

        gehege.gettierArrayList().get(zufallsZahl);
        //System.out.print(" das zufällige Tier " + gehege.gettierArrayList().get(zufallsZahl));
        return gehege.gettierArrayList().get(zufallsZahl);
    }

    public void beobachten(Gehege gehege) {

        zufallsTier(gehege);

        System.out.print(" beobachtet!\n\n");
    }

    public void arbeitsSimulation(int anzahlTage) {

        for (int i = 1; i <= anzahlTage; i++) {
            System.out.println("+– | Tag " + i + " " + "–".repeat(52) + "+\n");

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
                        System.out.printf(pfleger.getName() + " ist fertig.\n");
                        System.out.println();
                    }
                }
            }
        }
    }

    public void zufallsTierBiss(Gehege gehege) {

        // Option a
        /*
        Random bissWahrscheinlichkeit = new Random();
        double bissWahrschZahl = bissWahrscheinlichkeit.nextDouble(0.0,1.0);
         */

        Tiere gebissenesTier = zufallsTier(gehege);

        //HashMap<Tiere, Integer> gebisseneTierListe = new HashMap<>();


        for (int i = 0; i < gehege.gettierArrayList().size(); i++) {

            // Option b
            double bissWahrschZahl = Math.random();

            if (bissWahrschZahl <= 0.4) {
                System.out.println("bissWahrschZahl: " + bissWahrschZahl);
                System.out.println("zufallsTierBiss: " + gehege.gettierArrayList().get(i));

                //System.out.println("Zufallstier: " + zufallsTier(gehege));


                while (Objects.equals(gehege.gettierArrayList().get(i).toString(), gebissenesTier.toString())) {
                    gebissenesTier = zufallsTier(gehege);
                }

                if (gebissenesTier.getMaxGesundheit() > 0) {

                    System.out.println(gehege.gettierArrayList().get(i) + " beißt " + gebissenesTier);

                    //System.out.println("Bisskraft beißendes Tier: " + gehege.gettierArrayList().get(i).toString() + " = " + gehege.gettierArrayList().get(i).getBissKraft());
                    //System.out.println("Gesundheit gebissenes Tier: " + gebissenesTier.toString() + " = " + gebissenesTier.getMaxGesundheit());

                    gebissenesTier.setMaxGesundheit(gebissenesTier.getMaxGesundheit() - gehege.gettierArrayList().get(i).getBissKraft());

                    System.out.println("aktuelle Gesundheit gebissenes Tier " + gebissenesTier.toString() + " hat " + gebissenesTier.getMaxGesundheit() + "\n");
                }
                else {
                    System.out.println("aktuelle Gesundheit gebissenes Tier " + gebissenesTier.toString() + " ist Tod.");
                }
            }
        }

    }

}