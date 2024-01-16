package eslem.week15_objects;
/* 1/ Erstelle eine Klasse welche die typischen Werte eines Autos speichern kann.

       String Marke
       String Modell
       int Baujahr
       int km-Stand
       eine Methode fahren(...) der ein Parameter mit den zu fahrenden Kilometern übergeben werden kann. Erhöhe den Kilometerstand.
       Tankvolumen und den Tankinhalt für deine Auto-Klasse und eine Methode volltanken() die das Tankvolumen auffüllt.
       Gib aus, wie viele Liter getankt wurden.
       Definiere einen Verbrauch pro Liter und reduziere beim fahren(...) den Tankinhalt.
       Gib eine Warnmeldung aus, wenn nur mehr 5 Liter im Tank sind.
       Gib aus, wenn der Tank leer ist und wie viele Kilometer bis zum Ziel noch nicht gefahren sind.

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
    public double tankprokm = 0.1;
    public double übrigekm;
    public double übrigekmTotal;
    public double kmZiel;
    public double verbrauch;

    public Auto() {
    }

    public Auto(String marke, String modell, int baujahr, int kmStand,int zufahren, int tankVolumen,  int tankInhalt, double tankprokm) {
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
        this.kmStand = kmStand;
        this.zufahren = zufahren;
        this.tankVolumen = tankVolumen;
        this.tankInhalt = tankInhalt;
        this.tankprokm = tankprokm;
        this.übrigekm = übrigekm;

    }
    public String toString() {
        return "---" + "\n" + "marke: " + marke + "\n" + "modell: " + modell + "\n" + "baujahr: " + baujahr + "\n" + "kmStand: " + kmStand + "km";
    }
    public String fahren(int km) {
        kmStand = kmStand + zufahren;
        return "kmStand: " + NumberFormat.getInstance(Locale.GERMAN).format(kmStand);
    }
    public void fahrt(int km) {
        System.out.println("km fahren: " + km);
        double distanz = this.tankInhalt / this.tankprokm;
    }
    public String volltanken(){
        tankVolumen = tankVolumen - tankInhalt;
        return "Tank: " + tankVolumen;
    }
    public String gesamterverbrauch(){
        double temp;
        temp = zufahren * tankprokm;
        übrigekmTotal = tankInhalt - temp;
        kmZiel = kmZiel - zufahren;
        return "sie sind " + zufahren + "km gefahren, " + "sie haben noch " + übrigekmTotal + " km, " + "sie haben nur noch "  + kmZiel + "km übrig";
    }
    public String warning(){
        if (verbrauch == 5){
            return "nur noch 5 Liter übrig";
        } else if (verbrauch <= 5) {
            return "bitte tanken";
        } return "sie haben genügend Tank";
    }
}


