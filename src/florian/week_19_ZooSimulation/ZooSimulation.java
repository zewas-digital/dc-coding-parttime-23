package florian.week_19_ZooSimulation;

import florian.week_18_Pflegeraufgabe.Zoo;
import florian.week_18_Pflegeraufgabe.Gehege;
import florian.week_18_Pflegeraufgabe.Pfleger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class ZooSimulation {
    Zoo zoo;

    public ZooSimulation(Zoo zoo) {
        this.zoo = zoo;
    }

    public void simulation() {

        ArrayList<Gehege> vorhandeneGehege = (ArrayList<Gehege>) this.zoo.getGehegeArrayList().clone();

        HashMap<Pfleger, ArrayList<Gehege>> zuErledigendeGehege = new HashMap<>();

        for (Pfleger pfleger : this.zoo.getPflegerArrayList()) {
            ArrayList<Gehege> pflegerToDoList = (ArrayList) pfleger.getGehegeZustaendigkeitArrayList().clone();
            Collections.shuffle(pflegerToDoList);
            zuErledigendeGehege.put(pfleger, pflegerToDoList);
        }

        while (!vorhandeneGehege.isEmpty()) {


            for (Pfleger pfleger : this.zoo.getPflegerArrayList()) {
                Gehege gehegetodo = null;

                while (zuErledigendeGehege.get(pfleger).size() > 0) {
                    gehegetodo = zuErledigendeGehege.get(pfleger).get(0);
                    if (vorhandeneGehege.contains(gehegetodo)) {
                        break;

                    } else {
                        zuErledigendeGehege.get(pfleger).remove(gehegetodo);
                        gehegetodo = null;
                    }
                }

                if (gehegetodo != null) {
                    System.out.println(pfleger.pflegerName + " erledigt: " + gehegetodo);
                    vorhandeneGehege.remove(gehegetodo);
                    zuErledigendeGehege.get(pfleger).remove(gehegetodo);
                } else {
                    System.out.println(pfleger.pflegerName + " ist Fertig");
                }
            }


        }
    }
}