package claudia.week22_Carsimulation;

import java.text.NumberFormat;
import java.util.Locale;

public abstract class Auto implements Autofahren{
    private String hersteller;
    private String modell;
    private Motor motor;
    private Tank tank;

    private double kmStand;

    private int gewicht = 0;

    /// formatierte double-Attribute:

    private String kmStandFormatiert;
    //private String verbrauchFormatiert;
    ///


    public Auto(String hersteller, String modell, double kmStand, Tank tank, Motor motor) {
        this.hersteller = hersteller;
        this.modell = modell;
        this.kmStand = kmStand;
        this.kmStandFormatiert = NumberFormat.getInstance(Locale.GERMAN).format(kmStand) + " km";
        this.tank = tank;
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "allgemeines Auto";
    }

    /// Getter und Setter
    public String getHersteller() {
        return this.hersteller;
    }
    public String getModell() {
        return this.modell;
    }

    public double getKmStand() {
        return this.kmStand;
    }
    public String getKmStandFormatiert() {
        return this.kmStand + " km";
    }


    public void setKmStand(double kmStand) {
        //TODO Validierung: neue km > alte km? Sonst stimmt was nicht!
        this.kmStand = kmStand;
        this.kmStandFormatiert = NumberFormat.getInstance(Locale.GERMAN).format(kmStand) + " km";
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Tank getTank() {
        return tank;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }
}
