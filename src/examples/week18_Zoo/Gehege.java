package examples.week18_Zoo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

public class Gehege {
    public String bezeichnung;
    public Vector<Tier> tiere;

    public Gehege(String bezeichnung) {
        this.bezeichnung = bezeichnung;
        this.tiere = new Vector<>();
    }

    public Tier tierHinzufuegen(String name, Futter futter, int taeglicherBedarf, int maxGesundheit, int biss) {
        Tier tier = new Tier(name, futter, taeglicherBedarf, maxGesundheit, biss);
        this.tiere.add(tier);

        return tier;
    }

    public void berechneTaeglichenBedarf(HashMap<Futter, Integer> taeglicherBedarf) {
        for (Tier t: this.tiere) {
            t.berechneTaeglichenBedarf(taeglicherBedarf);
        }
    }

    public void beissenSimulieren(int indexGehege) {
        for (Tier tier: this.tiere ) {
            for(Tier tier2: this.tiere) {
                if(tier.hashCode() == tier2.hashCode() || tier.gesundheit <= 0 || tier2.gesundheit <= 0) continue;
                if(Math.ceil(Math.random() * 10) < 4) {
                    System.out.printf("%-2s | " +tier2.name +" wurde von " + tier.name + " gebissen.\n", indexGehege++ + ".");
                    tier2.wirdGebissen(tier.biss);
                    System.out.printf("%-2s | Gesundheit von "+ tier2.name + ": "+ tier2.gesundheit+ ".\n", indexGehege++ + ".");
                }
            }


        }
    }

    public void toteTiereEntfernen(int indexGehege) {
        for (int i = 0; i < this.tiere.size(); i++) {
            if(this.tiere.elementAt(i).gesundheit <= 0) {
                System.out.printf("%-2s | "+this.tiere.elementAt(i).name +" wurde tot aufgefunden.\n", indexGehege++ + ".");
            }
        }
        this.tiere.removeIf((tier -> tier.gesundheit <= 0));
    }
}










