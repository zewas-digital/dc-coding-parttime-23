package Simonsway.Week15;

import java.util.Scanner;

public class Kamera {

    private double brennweiteMin;

    private double brennweiteMax;

    private String modelBezeichnung = "";

    private String hersteller = "";

    private double megapixel;

    private int counter;

    ////////////////////////////////////////////////////////////////////////
    public void setBrennweiteMin(double brennweiteMin) {
        this.brennweiteMin = brennweiteMin;
    }
    public double getBrennweiteMin() {
        return this.brennweiteMin;
    }
    ////////////////////////////////////////////////////////////////////////
    public void setBrennweiteMax(double brennweiteMax) {
        this.brennweiteMax = brennweiteMax;
    }
    public double getBrennweiteMax() {
        return this.brennweiteMax;
    }
    ////////////////////////////////////////////////////////////////////////
    public void setModelBezeichnung(String modelBezeichnung) {
        this.modelBezeichnung = modelBezeichnung;
    }
    public String getModellBezeichnung() {
        return this.modelBezeichnung;
    }
    ////////////////////////////////////////////////////////////////////////
    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }
    public String getHersteller() {
        return this.hersteller;
    }
    ////////////////////////////////////////////////////////////////////////
    public void setMegapixel(double megapixel) {
        this.megapixel = megapixel;
    }
    public double getMegapixel() {
        return this.megapixel;
    }
    ////////////////////////////////////////////////////////////////////////


    public void takePhoto( int counter) {
        System.out.println("Klick - Foto geschossen 📸");
        System.out.println(counter + " Fotos geschossen");
    }

}
