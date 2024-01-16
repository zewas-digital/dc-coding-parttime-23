/**
 *
Klasse Auto

Die Klasse Auto definiert ein Objekt, das die Eigenschaften eines Autos beschreibt. Die Klasse erbt von der Klasse Object und erweitert sie um folgende Eigenschaften und Methoden:

marke: Die Marke des Autos									// String marke;
modell: Das Modell des Autos								// String modell;
baujahr: Das Baujahr des Autos								// int baujahr;
kilometerstand: Der Kilometerstand des Autos				// private int kilometerstand; & String kilometerstandFormatiert;
tankvolumen: Das Tankvolumen des Autos						// private int tankvolumen = 80;
tankinhalt: Der aktuelle Tankinhalt des Autos				// public int tankinhalt;
 *
 */

// Siehe Screenshot vom 19.02.23

package saifedine.week15_objects.oliver_V01;

import java.text.NumberFormat;
import java.util.Locale;

public class Auto extends Object {
    String marke;
    String modell;
    int baujahr;
    private int kilometerstand;
    String kilometerstandFormatiert;

    public int tankinhalt;
    private int tankvolumen = 80;


    /**
     *
     * Konstruktor
     *
     * Der Konstruktor der Klasse Auto nimmt folgende Parameter entgegen:
     *
     * @param marke
     * @param modell
     * @param baujahr
     * @param kilometerstand
     * @param tankvolumen
     */

    public Auto(String marke, String modell, int baujahr, int kilometerstand, int tankvolumen) {

        // Der Konstruktor überprüft zunächst, ob das Baujahr des Autos mindestens 1885 ist. Dies ist der Beginn der Automobilproduktion. Wenn das Baujahr kleiner als 1885 ist,
        // wird eine IllegalArgumentException geworfen.

        if (baujahr < 1885) {
            throw new IllegalArgumentException("Das Baujahr soll in mit vier Ziffern angegeben werden.");
        }

        // Anschließend wird überprüft, ob das angegebene Tankvolumen größer als das maximale Tankvolumen der Klasse Auto ist. Das maximale Tankvolumen beträgt 80 Liter.
        // Wenn das angegebene Tankvolumen größer als 80 ist, wird ebenfalls eine IllegalArgumentException geworfen.

        if (tankvolumen > this.tankvolumen) {
            throw new IllegalArgumentException("Ein größeres Tankvolumen als "+ this.tankvolumen +" ist nicht möglich.");
        }

        // Anschließend werden die übergebenen Parameter den entsprechenden Eigenschaften des Auto-Objekts zugewiesen.
        // Außerdem wird der Kilometerstand in einem formatierten String gespeichert.
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
        this.kilometerstand = kilometerstand;
        this.kilometerstandFormatiert = NumberFormat.getInstance(Locale.GERMAN).format(kilometerstand) +" km";          // Außerdem wird der Kilometerstand in einem formatierten String gespeichert.
        this.tankvolumen = tankvolumen;

        System.out.println("Auto erzeugt mit Kilometerstand "+ kilometerstandFormatiert);
    }

    /**
     *
     * Getter und Setter
     *
     * Die Klasse Auto definiert folgende Getter und Setter:
     *
     * @return
     */

    // GETTER: übergibt den Tankvolumen an getTankvolumen
    // getTankvolumen(): Gibt das Tankvolumen des Autos zurück (Eigenschaft: private int tankvolumen = 80;)
    public int getTankvolumen() {
        return this.tankvolumen;
    }

    // SETTER: setzt und überprüft die Variablen Tankinhalt auf deren Input
    // setTankinhalt(): Setzt den Tankinhalt des Autos (Eigenschaft: private int tankvolumen = 80; & public int tankinhalt;)
    public void setTankinhalt(int neuerTankinhalt) {
        if (neuerTankinhalt <= this.tankvolumen && neuerTankinhalt >= 0)
            this.tankinhalt = neuerTankinhalt;
        else
            throw new IllegalArgumentException("Das ist nicht möglich.");
    }

    // getFormatierterTankinhalt(): Gibt den Tankinhalt des Autos in einem formatierten String zurück (Eigenschaft: public int tankinhalt;)
    public String getFormatierterTankinhalt() {
        return this.tankinhalt +" Liter";
    }

    // setKilometerstand(): Setzt den Kilometerstand des Autos (Eigenschaft: private int kilometerstand; & String kilometerstandFormatiert;)
    public void setKilometerstand(int neuerKilometerstand) {
        this.kilometerstand = neuerKilometerstand;
        this.kilometerstandFormatiert = NumberFormat.getInstance(Locale.GERMAN).format(neuerKilometerstand) +" km";
    }

    // getKilometerstand(): Gibt den Kilometerstand des Autos zurück (Eigenschaft: private int kilometerstand)
    public int getKilometerstand() {
        return this.kilometerstand;
    }

    /**
     *
     * Methode toString()
     *
     * Die Methode toString() gibt eine textuelle Darstellung des Auto-Objekts zurück. Die Methode überschreibt die Methode toString() der Klasse Object.
     *
     * @return
     */
    @Override
    public String toString() {
        return "Auto { " + super.toString() +                                                                           // super entspricht der erweiterten Object-Klasse (Siehe Screenshot vom 19.02.23)
                "\n marke = " + marke +
                ",\n modell = " + modell +
                ",\n baujahr = " + baujahr +
                ",\n kilometerstand = " + NumberFormat.getInstance(Locale.GERMAN).format(kilometerstand) +" km"
                + "\n}";
    }
}
