package saifedine.week21_Zoo.V01Bonus2;

import java.util.Random;

public class SimulationBonus1 {

    Zoo zoo;

    public SimulationBonus1(Zoo zoo){this.zoo = zoo;}

    public String toString() { return this.zoo + " ist SimulationBonus1"; }

    /*
    2/ Jedes Tier versucht mit 40 % Wahrscheinlichkeit, ein Nachbar von ihm aus dem gleichen Gehege zu beißen.
ToDo:
 pro Tier Bisswahrscheinlichkeit von 0,4
 Random von 0 - 1 wird eine Bisswahrscheinlichkeit einem Tier zugeordnet, d.h. wenn random von 0 - 0,4 --> BISS - von 0,4 - 1 --> KEIN BISS
 Random wird für jedes Tier berechnet und ausgeführt
 Random TierAuswahl, darf nicht sich selbst beißen und keine toten Tiere beissen
     */
    public void biss(){

        Random bisswahrscheinlichkeit = new Random();
        float zufallsZahl = bisswahrscheinlichkeit.nextInt(0,1);

        System.out.println(zufallsZahl);


    }

}
