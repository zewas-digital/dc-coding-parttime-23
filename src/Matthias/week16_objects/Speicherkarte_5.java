package Matthias.week16_objects;

import Simonsway.Week15.Speicherkarte;

public class Speicherkarte_5 {
    public double SpeicherplatzMax;     // Angabe in megabyte
    private double SpeicherplatzStatus=0;     // Angabe in megabyte
    private int AnzahlderFotos;

    public Speicherkarte_5(int megabyte){
        this.SpeicherplatzMax =megabyte;
    }

    public double getSpeicherplatzStatus() {
        return this.SpeicherplatzStatus;
    }

    public void setSpeicherplatzStatus( double speicherplatzStatus ) {
        SpeicherplatzStatus = speicherplatzStatus;
    }

    public int getAnzahlderFotos() {
        return AnzahlderFotos;
    }

    public void setAnzahlderFotos( int anzahlderFotos ) {
        AnzahlderFotos = anzahlderFotos;
    }

    @Override
    public String toString() {return "Der Speicherplatz ist: "+ SpeicherplatzMax +
                            "Aktueller Speicherstand: "+ SpeicherplatzStatus;}
}
