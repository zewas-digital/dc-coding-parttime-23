package claudia.week15_extend;

// Abstrakte Klassen können nicht instanziiert werden. Sie bilden die Blaupause für ihre Subklassen.
public abstract class Fahrzeug extends Object {
    // Klassenattribut
    protected static int wheels = 1; //Kann auch public sein und dann für alle Instanzen überschrieben werden!
    private String name;

    public Fahrzeug(String name) {
        this.name = name;
    }

    // Abstrakte Methode, muss von Subklassen implementiert werden
    public abstract void drive(int kilometer);

    // Kann nicht überschrieben werden wg. FINAL
    public final String getName() {
        return this.name;
    }
}