package saifedine.week19_Zoo.oliver;

import java.util.HashMap;
import java.util.Vector;

public class Zoo extends Object {
    private String name;

    public Vector<Gehege> gehege;

    public Vector<Pfleger> pfleger;

    HashMap<Futter, Double> futterliste = new HashMap<>();

    public Zoo(String name) {
        this.name = name;
        this.gehege = new Vector<>();
        this.pfleger = new Vector<>();
    }

    public Gehege neuesGehege(String bezeichnung) {
        Gehege gehege = new Gehege(bezeichnung);
        this.gehege.add(gehege);

        return gehege;
    }

    public void neuerPfleger(Pfleger pfleger) {
        this.pfleger.add(pfleger);
    }

    public void verantwortlichFuerGehege(Pfleger pfleger, Gehege gehege) {
        if (this.pfleger.contains(pfleger) && this.gehege.contains(gehege)) {
            pfleger.zustaendigFuerGehege.add(gehege);
        }
    }


    public void futterHinzufuegen(Futter futter, Double preisProEinheit) {
        this.futterliste.put(futter, preisProEinheit);
    }

    public Double getFutterpreis(Futter futter) {
        return this.futterliste.get(futter);
    }

    public void druckeFutterStatistik() {
        HashMap<Futter, Integer> taeglicherBedarf = new HashMap<>();

        // Bedarf aller Gehege
        for (Gehege g: this.gehege) {
            g.berechneTaeglichenBedarf(taeglicherBedarf);
        }

        System.out.println("-".repeat(12));

        int summe = 0;
        for (Futter f: taeglicherBedarf.keySet()) {
            summe += f.getPreisProEinheit() * taeglicherBedarf.get(f);

            System.out.printf("%5d %-10s %-20s: %8.2s €\n",
                    taeglicherBedarf.get(f),
                    f.getEinheit(),
                    f.getName(),
                    (f.getPreisProEinheit() * taeglicherBedarf.get(f))
            );
        }
        System.out.println("-".repeat(12));
        System.out.printf("Summe täglicher Futterkosten: %.2s €\n", summe);
    }
}
