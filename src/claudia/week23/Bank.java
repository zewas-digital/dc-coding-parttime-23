package claudia.week23;
/*

Ein Bankinstitut hat verschiedene Schalter. Ein Kunde geht in ein Bankinstitut, um sein Bankgeschäft zu verrichten.
Zuerst geht der Kunde ins Institut und geht zum nächsten freien Schalter. Wenn der Kunde den Schalter wieder verlässt,
wird der Schalter zu einer Wahrscheinlichkeit von 20% für eine Pause geschlossen (die Pause eines Schalters endet,
nachdem 3 weitere Kunden die Bank betreten und verlassen haben). Hat ein Schalter kein Geld mehr, so muss dieser wieder
aufgefüllt werden, und der Schalter ist für die Dauer eines Kunden geschlossen.

* Das Bankgeschäft eines Kunden ist entweder eine Einzahlung oder eine Auszahlung.
* Kann ein Schalter eine gewisse Geldmenge nicht bedienen, geht der Kunde zum nächsten Schalter, und der ursprüngliche Schalter wird aufgefüllt.
* Es soll nachvollzogen werden können, welcher Schalter welche Kunden bedient hat, und was für ein Betrag eingezahlt oder ausgezahlt wurde (ACHTUNG keine Dictionary).

Erstelle ein UML Diagramm für dein Banksystem (Dia)
Erstelle die notwendigen Klassen und Methoden.
Erstelle nun eine Bank mit einigen Schaltern und erstelle weiters einige Kunden.
Simuliere nun das Bankgeschäft. Die Kunden gehen der Reihe nach in die Bank. Am Ende der Simulation soll
für jeden Schalter eine Statistik ausgegeben werden (welche Kunden waren dort, welche Beträge wurden verarbeitet).
Erstelle Unit Tests für deine Banksimulation.
       */


import java.util.ArrayList;
import java.util.List;

public class Bank {

    private int aktuelleAnzahlDerKunden;
    private List<AnzahlDerKundenObserver> observers = new ArrayList<>();
    private String nameDerBank;

    public Bank(String nameDerBank){
        this.nameDerBank = nameDerBank;
        this.aktuelleAnzahlDerKunden = 0;
    }

    public void addObserver(AnzahlDerKundenObserver observer){
        observers.add(observer);
    }
    public void removeObserver(AnzahlDerKundenObserver observer){
        observers.remove(observer);
    }
    //notify observers
    public void notifyObservers(){
        for (AnzahlDerKundenObserver ko : observers) {
            ko.update(this.aktuelleAnzahlDerKunden);
        }
    }

    public int getAktuelleAnzahlDerKunden() {
        return aktuelleAnzahlDerKunden;
    }

    public void setAktuelleAnzahlDerKunden(int aktuelleAnzahlDerKunden) {
        this.aktuelleAnzahlDerKunden = aktuelleAnzahlDerKunden;
    }
    public String getNameDerBank(){
        return this.nameDerBank;
    }
}
