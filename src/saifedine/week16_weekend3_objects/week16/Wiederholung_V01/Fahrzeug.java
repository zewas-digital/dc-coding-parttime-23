package saifedine.week16_weekend3_objects.week16.Wiederholung_V01;

public abstract class Fahrzeug {

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

