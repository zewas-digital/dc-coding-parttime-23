package saifedine.week18_Zoo.V02;

import java.util.HashMap;

public class Simulation_1 {

    Zoo zoo;
    Pfleger pfleger;

    Gehege gehege;
    boolean vorhanden = checkZustaendigkeit();

    HashMap<Gehege, Pfleger> toDoList = new HashMap<>();


    public void futtern() {
        System.out.println("Gefüttert");
    }

    public void beobachten() {
        System.out.println("Beobachten");
    }

     boolean checkZustaendigkeit() {

        if (zoo.pfleger.contains(pfleger) && zoo.getgehegeArrayList().contains(gehege) && pfleger.gehegeZustaendigkeit.contains(gehege)) {

            return true;

        } else {

            System.out.println(pfleger + " oder  " + gehege + " ist diesem Zoo nicht zugeordnet!!");

            return false;
        }
    }


    public void arbeit(boolean vorhanden, Pfleger pfleger, Gehege gehege) {

        if (vorhanden) {

            for (int i = 0; i < zoo.getgehegeArrayList().size(); i++) {

                if (this.toDoList.get(pfleger) != null) {

                    for (int j = 0; j < zoo.pfleger.size(); j++) {

                        if (this.toDoList.get(gehege) != null) {

                        }

                    }


                }

            }


        }
/*
        this.toDoList.put(gehege,pfleger);

        while (zoo.getgehegeArrayList().size() > 0 && pfleger.gehegeZustaendigkeit.contains(pfleger){

        }

        if (zoo.getgehegeArrayList().contains(gehege))
    }

 */
    }

}
