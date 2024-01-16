package MichaelReal.week18_Zoo;

public class Futter {
    private String name;
    private String einheit; // Hinzugefügt: Die Einheit des Futters (z. B. kg, Stück, usw.)
    private double einheitspreis; // Hinzugefügt: Der Preis pro Einheit des Futters

    public Futter(String name, String einheit, double einheitspreis) {
        this.name = name;
        this.einheit = einheit;
        this.einheitspreis = einheitspreis;
    }

    public String getName() {
        return name;
    }

    public String getEinheit() {
        return einheit;
    }

    public double getEinheitspreis() {
        return einheitspreis;
    }
}
