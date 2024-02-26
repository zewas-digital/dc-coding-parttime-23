package saifedine.week19_Zoo.oliver;

import java.util.Collections;
import java.util.HashMap;
import java.util.Vector;

public class ZooSimulator1 {
    Zoo zoo;

    public ZooSimulator1(Zoo zoo) {
        this.zoo = zoo;
    }

    protected void tagesSimulation(int anzahlTage) {
        for (int i = 1; i <= anzahlTage; i++) {
            System.out.println("+– | Tag "+ i + " "+ "–".repeat(52) +"+");
            int indexGehege = 1;

            // Initial die Aufgaben (zurück)setzen --------------
            // was ist zu erledigen?
            Vector<Gehege> zuErledigendeGehege = (Vector)this.zoo.gehege.clone();

            // wer hat was zu erledigen?
            HashMap<Pfleger,Vector<Gehege>> pfleger_zuErledigendeGehege = new HashMap<>();
            for (Pfleger pfleger : this.zoo.pfleger) {
                // Aufgabenliste des Pflegers mit zufälliger Reihenfolge
                Vector<Gehege> pflegerTodoList = (Vector)pfleger.zustaendigFuerGehege.clone();
                Collections.shuffle(pflegerTodoList);
                pfleger_zuErledigendeGehege.put(pfleger, pflegerTodoList);
            }

            // Ablauf -------------------------
            // So lange Gehege zu erledigen sind, wird gearbeitet ;-)
            while (!zuErledigendeGehege.isEmpty()) {
                System.out.printf("%-2s | ", indexGehege +".");

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
                        System.out.printf("%-27s | ", pfleger.getName() +" erledigt "+ gehegeTodo.bezeichnung);

                        // entferne Gehege von zu erledigenden Zoo-Gehegen
                        zuErledigendeGehege.remove(gehegeTodo);

                        // entferne Gehege von zu erledigenden Pfleger-Gehegen
                        pfleger_zuErledigendeGehege.get(pfleger).remove(gehegeTodo);
                    } else {
                        System.out.printf("%-27s | ", pfleger.getName() + " ist fertig.");
                    }
                }
                System.out.println();
                indexGehege++;
            }
        }
    }

    private Vector<Gehege> gehegeVector() {
        Vector<Gehege> gehegeVector = new Vector<>();

        return gehegeVector;
    }
}
