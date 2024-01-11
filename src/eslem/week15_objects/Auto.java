package eslem.week15_objects;
/* 1/ Erstelle eine Klasse welche die typischen Werte eines Autos speichern kann.

       String Marke
       String Modell
       int Baujahr
       int km-Stand
       eine Methode fahren(...) der ein Parameter mit den zu fahrenden Kilometern übergeben werden kann. Erhöhe den Kilometerstand.
       Tankvolumen und den Tankinhalt für deine Auto-Klasse und eine Methode volltanken() die das Tankvolumen auffüllt.
       Gib aus, wie viele Liter getankt wurden.

 */

import java.text.NumberFormat;
import java.util.Locale;
public class Auto extends Object {
    public String marke;
    public String modell;
    public int baujahr;
    public int kmStand;
    public int zufahren;
    public int tankVolumen;
    public int tankInhalt;


    public Auto() {

    }

    public Auto(String marke, String modell, int baujahr, int kmStand, int tankVolumen,  int tankInhalt) {
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
        this.kmStand = kmStand;
        this.zufahren = zufahren;
        this.tankVolumen = tankVolumen;
        this.tankInhalt = tankInhalt;
    }

    public String toString() {
        return "---" + "\n" + "marke: " + marke + "\n" + "modell: " + modell + "\n" + "baujahr: " + baujahr + "\n" + "kmStand: " + kmStand + "km";
    }

    public String fahren() {
        kmStand = kmStand + zufahren;
        return "kmStand: " + NumberFormat.getInstance(Locale.GERMAN).format(kmStand);
    }

    public String volltanken(){
        tankVolumen = tankVolumen - tankInhalt;
        return "Tank: " + tankVolumen;
    }
}


