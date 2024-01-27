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

    public Tier(String name, String art, Lagerhaus.Futterarten futter, double futterBedarfInEinheit, ArrayList<Tier> listeDerTiere) {
        this.name = name;
        this.art = art;
        this.futter = futter;
        this.futterBedarfInEinheit = futterBedarfInEinheit;
        listeDerTiere.add(this);
    }

    public void feed() {
        System.out.println("Ich heiße " + this.name + " und fresse " + futter);
        try {
            Thread.sleep(1000);}
        catch (InterruptedException e){
            throw new RuntimeException(e);
        }
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

        System.out.println("\nPfleger " + p.getName() + " geht weiter!");
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
}
