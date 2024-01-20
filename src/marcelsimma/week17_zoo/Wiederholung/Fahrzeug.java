package marcelsimma.week17_zoo.Wiederholung;

public abstract class Fahrzeug implements Move {

    // Attribute
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

