package judith.week16.Wiederholung;

public abstract class Fahrzeug {

    // Attribute

    //Diese Variablen sind privat damit sie nur einmal definiert und nicht wieder verändert werden können.
    private String color;
    private String seriennummer;

    // Construktor
    public Fahrzeug(String color, String seriennummer) {
        this.color = color;
        this.seriennummer = seriennummer;
    }

    // getter
    public String getColor() {
        return this.color;
    }

    public String getSeriennummer() {
        return this.seriennummer;
    }

    // setter
    public void setColor(String color) {
        this.color = color;
    }

    // sonstige Methoden
    public void fahren() {
        System.out.println("Fahrzeug fährt los!");
    }


}

