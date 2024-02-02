package Alpi.week18_PfelgeraufgabeNeu;

/*
Aufgabe: Simulation 0.1
Erweitere das Programm mit einer Tagessimulation.

1/ An jeden Tag, gehen die Pfleger los, und kümmern sich um die Gehege in deren Zuständigkeitsbereich.
Falls ein Pfleger ein Gehege findet, welche schon bearbeitet wurde, überspringt die Gehege und nimmt das nächste.
2/ Wenn ein Pfleger zu einem Gehege kommt, werden zuerst die Tiere gefüttert.
3/ Nach dem Füttern wird er ein zufälliges Tier länger beobachten.

Bonus/ Mit einer Erweiterung der Pfleger um seine Lieblings-Tier-Gattung, kann der Pfleger ein Tier seiner Lieblings-Gattung bewundern.

Drucke auf der Konsole aus, wer-was macht...
 */

public class Objekt_10_ZooSimulation {

    private String name;
    private String zuestaendigkeitsbereich;
    private String lieblingstiergattung;

    public void Pfleger (String name, String zuestaendigkeitsbereich, String lieblingstiergattung){
        this.name = name;
        this.zuestaendigkeitsbereich = zuestaendigkeitsbereich;
        this.lieblingstiergattung = lieblingstiergattung;

    }

    public String getName(){
        return name;
    }
    public String getZuestaendigkeitsbereich(){
        return zuestaendigkeitsbereich;
    }

    public String getLieblingstiergattung(){
        return lieblingstiergattung;
    }
    public void fuettern(Gehege gehege){
        System.out.println( name + "füttert die Tiere im Gehege " + gehege.getName());

    }

    public void beobachten (Gehege gehege){
        System.out.println(name + "beobachtet ein zufälliges Tier im Gehege " + gehege.getName());

    }

    public void bewundern(Gehege gehege){

        System.out.println(name + " bewundert ein Tier seiner Lieblings-Gattung im Gehege " + gehege.getName());
    }


}
