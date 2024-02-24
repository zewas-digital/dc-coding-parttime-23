package oliver.week19_Zoo;

import oliver.week18_Zoo.Zoo;
import oliver.week18_Zoo.Gehege;
import oliver.week18_Zoo.Tier;

import java.util.Collections;
import java.util.Vector;

public class ZooSimulator3 {
    Zoo zoo;

    public ZooSimulator3(Zoo zoo) {
        this.zoo = zoo;
    }

    protected void tagesSimulation(int anzahlTage) {
        for (int i = 1; i <= anzahlTage; i++) {
            System.out.println("\n+– Tag " + i + " " + "–".repeat(52) + "\n|");

            // alle Tiere beissen
            tiereBeissen();
            // alle Ärzte heilen
            aerzteHeilen();
        }
    }

    private void tiereBeissen() {
        for (Gehege gehege : this.zoo.gehege) {
            System.out.println("+– Gehege "+ gehege.bezeichnung +" "+ "–".repeat(10));

            for (Tier tier : gehege.getTiere()) {
                if (!tier.istLebendig())
                    continue;

                tier.streunt(gehege); // und beisst eventuell
            }
        }
    }

    private void aerzteHeilen() {
        //TODO
    }
}
