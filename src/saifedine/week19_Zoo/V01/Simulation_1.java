package saifedine.week19_Zoo.V01;

import java.util.HashMap;

public class Simulation_1 {

    Zoo zoo;
    Pfleger pfleger;

    Gehege gehege;

    HashMap<Gehege, Pfleger> toDoList = new HashMap<>();

    public Simulation_1(Zoo zoo) {
        this.zoo = zoo;
    }

    public String toString (){
        return zoo + " ist Simulation_1 zugeordnet";
    }

    public void futtern() {
        System.out.println("Gefüttert");
    }

    public void beobachten() {
        System.out.println("Beobachten");
    }


    public boolean checkZustaendigkeit(Pfleger pfleger, Gehege gehege) {

        boolean vorhanden1 = false;

        if (zoo.pfleger.contains(pfleger) && zoo.getgehegeArrayList().contains(gehege)){

            for (int i = 0; i < zoo.pfleger.size(); i++) {

                if (pfleger.gehegeZustaendigkeit.contains(gehege)){
                    return vorhanden1 = true;
                }
            }
        }
        else {

            System.out.println("\n" + pfleger + " oder  " + gehege + " ist diesem Zoo nicht zugeordnet!!");

            return vorhanden1 = false;
        }
        return vorhanden1;
    }

    public void arbeitListe(Pfleger pfleger, Gehege gehege) {

        for (int i = 0; i < zoo.getgehegeArrayList().size(); i++) {

            for (int j = 0; j < zoo.pfleger.size(); j++) {

                if (zoo.pfleger.get(j).gehegeZustaendigkeit.contains(zoo.getgehegeArrayList().get(i)))

                    toDoList.put(zoo.getgehegeArrayList().get(i), zoo.pfleger.get(j));
            }
        }

        System.out.println(toDoList);
    }

    public void arbeit(Zoo zoo) {

        while (toDoList.size() > 0) {


            for (Gehege gehege: toDoList.keySet()){

                System.out.println(gehege + " ist erledigt von " + toDoList.get(gehege));

                futtern();
                beobachten();
            }
            toDoList.clear();
        }
    }
}




