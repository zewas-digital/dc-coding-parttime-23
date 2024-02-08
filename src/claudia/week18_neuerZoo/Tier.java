package claudia.week18_neuerZoo;

import java.util.ArrayList;
import java.util.Random;

public class Tier {
    private String name;
    private String art;
    private Lagerhaus.Futterarten futter;
    // futterArt: enum
    // menge: int
    private double futterBedarfInEinheit;
    private boolean hasBitten = false;
    private int healthMax;
    private int healthActual;
    private double probabilityOfBite;
    private int strengthOfBite;

    public Tier(String name, String art, Lagerhaus.Futterarten futter, double futterBedarfInEinheit, ArrayList<Tier> listeDerTiere) {
        this.name = name;
        this.art = art;
        this.futter = futter;
        this.futterBedarfInEinheit = futterBedarfInEinheit;
        this.healthMax = 100;
        this.healthActual = healthMax;
        this.probabilityOfBite = 0.4;
        this.strengthOfBite = 40;
        listeDerTiere.add(this);
    }

    public Tier(String name, String art, Lagerhaus.Futterarten futter, double futterBedarfInEinheit, ArrayList<Tier> listeDerTiere, int healthMax, int strengthOfBite, double probabilityOfBite) {
        this.name = name;
        this.art = art;
        this.futter = futter;
        this.futterBedarfInEinheit = futterBedarfInEinheit;
        this.healthMax = healthMax;
        this.healthActual = healthMax;
        this.strengthOfBite = strengthOfBite;
        this.probabilityOfBite = probabilityOfBite;
        listeDerTiere.add(this);
    }

    public void bite (Tier anderesTier){
        double random = Math.random(); //Zufallszahl in [0,1)
        if (!this.hasBitten && random < this.probabilityOfBite){
            this.hasBitten = true;
            anderesTier.setHealthActual(anderesTier.getHealthActual() - this.strengthOfBite);
            System.out.println("\n" + this.name + " beißt " + anderesTier.getName() + "!");
            if (anderesTier.getHealthActual() > 0)
                System.out.println("Die Gesundheit dieses Tieres verringert sich um " + this.strengthOfBite + " auf " + anderesTier.getHealthActual() + ".");
            else System.out.println("Dieses Tier ist damit leider aufgefressen.");
        }
        //else System.out.println("Kein Biss! ");
    }
    public void bite (Tier anderesTier, int counter){
        double random = Math.random(); //Zufallszahl in [0,1)
        if (!this.hasBitten && random < this.probabilityOfBite){
            this.hasBitten = true;
            anderesTier.setHealthActual(anderesTier.getHealthActual() - this.strengthOfBite);
            System.out.println("\n" + "\t".repeat(2 * counter) +  this.name + " beißt " + anderesTier.getName() + ":");
            if (anderesTier.getHealthActual() > 0)
                System.out.println("\t".repeat(2 * counter) + "Die Gesundheit von " + anderesTier.getName() + " verringert sich um " + this.strengthOfBite + " auf " + anderesTier.getHealthActual() + ".");
            else System.out.println("\t".repeat(2 * counter) + anderesTier.getName() + " ist damit leider aufgefressen.");
        }
        //else System.out.println("\t".repeat(2 * counter) + "Kein Biss! ");
    }

    public void feed(Lagerhaus lagerhaus) {
        String einheit = lagerhaus.getFutterliste().get(this.getFutterart()).getEinheit();
        //System.out.println("Ich heiße " + this.name + " und fresse " + this.getFutterBedarfInEinheit() + " " + einheit+ " " + this.futter);
        //erhöhe HealthActual um 10% bei jedem Füttern, aufgerundet:
        this.healthActual = Math.min((int) Math.ceil(this.healthActual * 1.1), this.healthMax);
      //  System.out.println("Futterart: " + lagerhaus.getFutterliste().get(this.getFutterart()));
       // System.out.println("aktueller Lagerbestand: " + lagerhaus.getStockListAllFeeds().get(this.getFutterart()));
       // System.out.println("Bedarf: " + this.getFutterBedarfInEinheit());



        //Hier Lagerbestand neu berechnen, "einkaufen"!
        lagerhaus.setStockListSingleFeed(this.futter, lagerhaus.getStockListAllFeeds().get(this.futter) - this.getFutterBedarfInEinheit());



        // System.out.println("Neuer Lagerbestand: ");
        //System.out.println(lagerhaus.getStockListAllFeeds().get(this.getFutterart()));
        /*
        try {
            Thread.sleep(500);}
        catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        */

    }

    public void watch(Pfleger p) {
        Random random = new Random();
        int multiplicator = random.nextInt(10);
        int counter = 0;
        System.out.print("\n" + p + " beobachtet " + this.getName() + ", " + this.getArt() + ". ");
        try {
            while(counter < multiplicator){
            System.out.print(" . ");
            counter++;

            Thread.sleep(2000);}

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("\n" + p.getName() + " geht weiter!");
    }


    public String getName() {
        return this.name;
    }

    public String getArt() {
        return this.art;
    }

    public String getFutter() {
        return this.futter.toString();
    }
    public Lagerhaus.Futterarten getFutterart(){
        return this.futter;
    }

    public double getFutterBedarfInEinheit() {
        return futterBedarfInEinheit;
    }

    public boolean getHasBitten() {
        return hasBitten;
    }

    public void setHasBitten(boolean hasBitten) {
        this.hasBitten = hasBitten;
    }

     public int getHealthMax() {
        return healthMax;
    }

     public int getHealthActual() {
        return healthActual;
    }

    public void setHealthActual(int healthActual) {
        if (healthActual <= this.healthMax)
            this.healthActual = healthActual;
        else System.out.println("Max Gesundheit überschritten! ");
    }

    public double getProbabilityOfBite() {
        return probabilityOfBite;
    }


    public int getStrengthOfBite() {
        return strengthOfBite;
    }

}
