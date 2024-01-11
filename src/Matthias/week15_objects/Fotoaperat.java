package Matthias.week15_objects;

import java.text.NumberFormat;
import java.util.Locale;

public class Fotoaperat extends Object{

    //Festlegen der Attribute des Objektes
    String hersteller;  // Herstellername der Kamera
    String Modell;      // Modelname der Kamera
    int brennweite;     // Angabe in mm bei Fotoobjektiven
    int aufloesung;     // Auflösung der Kamera in MegaPixel

    //Definieren den Konstrukter -> dem Konstruktor werden die Attribute übergeben, die Inizial wichtig sind
    // diese beschreiben die Objekt instanz -> wird somit unterscheidbar
    // Es können verschiedene Konstruktoren, implementiert werden
    // im Konstruktor wird nur das Implementiert was für das Objekt WIRKLICH & INIZIAL RELEVANT IST!!!

    public Fotoaperat(String Hersteller, String Modell,  int brennweite,int aufloesung){

        this.hersteller =Hersteller;
        this.Modell=Modell;
        this.brennweite=brennweite;
        this.aufloesung=aufloesung;
    }

    //to String ist eine Rückgabe die für die Instanz einen unterscheidbaren Rückgabewert liefert
    @Override
    public String toString() {
        return "Foto { " + super.toString() + // super entspricht der erweiterten Object-Klasse
                "\n Hersteller = " + hersteller +
                ",\n Model = " + Modell +
                ",\n Brennweite = " + brennweite + " in mm"+
                ",\n Auflösung = " + aufloesung +" in MegaPixel"+
                "\n}";
    }

}
