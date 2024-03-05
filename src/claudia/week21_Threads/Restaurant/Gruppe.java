package claudia.week21_Threads.Restaurant;

import java.util.Vector;

public class Gruppe extends Thread{
    private int anzahlPersonen;
    private Tisch tisch = null;
    private Restaurant restaurant;
    private Vector<Gruppe> listeDerGruppen;

    public Gruppe(int anzahlPersonen, Restaurant restaurant, Vector<Gruppe> listeDerGruppen){
        this.anzahlPersonen = anzahlPersonen;
        this.restaurant = restaurant;
        this.listeDerGruppen = listeDerGruppen;
    }

    public int getAnzahlPersonen() {
        return anzahlPersonen;
    }

    public void run(){
        try{
            sleep((int) (Math.random() * 50000));
        }
        catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        nachHauseGehen(this.tisch != null, this.restaurant, this.listeDerGruppen);
    }

    public void anDenTischSetzen(Tisch tisch){
        this.tisch = tisch;
    }
    public synchronized void nachHauseGehen(boolean tischGefunden, Restaurant restaurant, Vector<Gruppe> liste){
        if (tischGefunden){
            this.tisch.freigeben();
            liste.remove(this);
        }
        String singularPlural = (this.anzahlPersonen == 1) ? "Gast" : "Gästen";
        String ausgabe = (tischGefunden)? "Gruppe mit " + this.anzahlPersonen + " " + singularPlural +
                " hat genug gegessen und geht nach Hause :o)." : "Gruppe mit " + this.anzahlPersonen +
                " " + singularPlural + " muss woanders essen und geht nach Hause :o(.";
        System.out.print(ausgabe + " \n");

    }
}
