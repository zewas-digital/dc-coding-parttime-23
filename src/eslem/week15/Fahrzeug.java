package eslem.week15;

// Abstrakte Klassen können nicht instanziert werden. Sie bilden die Blaupause für ihre Subklassen.
public abstract class Fahrzeug extends Object {
    // Klassenattribut
    protected static int wheels = 1;
    private String name;

    public Fahrzeug(String name) {
        this.name = name;
    }

    // Abstrakte Methode, muss von Subklassen implementiert werden
    public abstract void drive(int kilometer);

    // Kann nicht überschrieben werden
    public final String getName() {
        return this.name;
    }
}