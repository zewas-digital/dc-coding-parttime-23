package saifedine.week15_extend;

// Klasse Einrad erweitert die Klasse Fahrzeug
public class Einrad extends Fahrzeug {

    // Methode zur Erstellung einer Instanz Einrad mit Konstruktoren
    public Einrad(String name) {
        // Konstruktor der Super-Klasse muss aufgerufen werden, da sie sich den Wert für das private Attribut erwartet.
        super(name);
    }

    // Abstrakte Methode in Klasse Fahrzeug, muss von Subklassen implementiert werden
    @Override
    public void drive(int kilometer) {
        System.out.println("Fahre Einrad.");
        //TODO drive x kilometer...
    }
}


















