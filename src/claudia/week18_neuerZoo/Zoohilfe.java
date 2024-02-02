package claudia.week18_neuerZoo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Zoohilfe {

    public static Zoo erstelleStandardZooOhnePfleger() {
        double[] preisliste = {3.5, 21.0, 5.21};
        Lagerhaus lagerhaus = new Lagerhaus(preisliste);

        Zoo zoo = new Zoo("Standardzoo", 2024, lagerhaus);
        zoo.getDirektor().setLieblingsArt("Hängebauchschwein");

        Gehege aquarium = new Gehege("Aquarium", 20000, zoo.getListeDerGehege());
        Gehege wald = new Gehege("Wald", 4390, zoo.getListeDerGehege());
        Gehege hochgebirge = new Gehege("Hochgebirge", 43, zoo.getListeDerGehege());
        Gehege tiefsee = new Gehege("Tiefsee", 1149, zoo.getListeDerGehege());
        Gehege sandwueste = new Gehege("Sandwüste", 32045, zoo.getListeDerGehege());

        Tier hai1 = new Tier("Hai 1", "Hai", Lagerhaus.Futterarten.FISCH, 127, aquarium.getListeDerTiere(), 100, 40, 0.2);
        Tier goldfisch1 = new Tier("Goldi 1", "Goldfisch", Lagerhaus.Futterarten.SCHOKOLADE, 0.02, aquarium.getListeDerTiere(), 5, 1, 0.6);
        Tier goldfisch2 = new Tier("Goldi 2", "Goldfisch", Lagerhaus.Futterarten.SCHOKOLADE, 0.017, aquarium.getListeDerTiere(), 6, 1, 0.6);
        Tier tiger1 = new Tier("Tiger 1", "Tiger", Lagerhaus.Futterarten.SCHOKOLADE, 18.00, wald.getListeDerTiere(), 100, 35, 0.3);
        Tier tiger2 = new Tier("Tiger 2", "Tiger", Lagerhaus.Futterarten.SCHOKOLADE, 7.00, wald.getListeDerTiere(), 95, 35, 0.2);
        Tier murmeltier1 = new Tier("Murmel 1", "Murmeltier", Lagerhaus.Futterarten.GRAS, 0.027, hochgebirge.getListeDerTiere(), 50, 10, 0.4);
        Tier murmeltier2 = new Tier("Murmel 2", "Murmeltier", Lagerhaus.Futterarten.GRAS, 1.03, hochgebirge.getListeDerTiere(), 40, 10, 0.4);
        Tier murmeltier3 = new Tier("Murmel 3", "Murmeltier", Lagerhaus.Futterarten.GRAS, 0.52, hochgebirge.getListeDerTiere(), 45, 10, 0.4);
        Tier riesenkrake = new Tier("Kraki 1", "Riesenkrake", Lagerhaus.Futterarten.FISCH, 82, tiefsee.getListeDerTiere(), 100, 25, 0.3);
        Tier haengebauchschwein1 = new Tier("Heinz", "Hängebauchschwein", Lagerhaus.Futterarten.GRAS, 0.030, wald.getListeDerTiere(), 100, 30, 0.9);
        Tier haengebauchschwein2 = new Tier("Hilde", "Hängebauchschwein", Lagerhaus.Futterarten.SCHOKOLADE, 123, wald.getListeDerTiere(), 100, 25, 0.9);


        for (int i = 1; i < 6; i++){
            new Tier("Böckle " + i, "Steinbock", Lagerhaus.Futterarten.GRAS, i, hochgebirge.getListeDerTiere(), 50, 5, 0.1);
        }

        for (int i = 1; i < 11; i++){
            new Tier("Hechti " + i, "Hecht", Lagerhaus.Futterarten.FISCH, i, aquarium.getListeDerTiere(), 30, 15, 0.3);
        }

        return zoo;
    }

    public static Zoo erstelleStandardZooMitPflegern() {
        Zoo zoo = erstelleStandardZooOhnePfleger();

        Pfleger pflegerHansi = new Pfleger("Hansi", zoo.getListeDerPfleger(), zoo.getListeDerGehege(), false);//, zoo.getZustaendig());
        Pfleger pflegerBerni = new Pfleger("Berni", zoo.getListeDerPfleger(), zoo.getListeDerGehege(), false);//, zoo.getZustaendig());
        Pfleger pflegerWerner = new Pfleger("Werner", zoo.getListeDerPfleger(), zoo.getListeDerGehege(), false);
        pflegerHansi.setLieblingsArt("Tiger");
        pflegerBerni.setLieblingsArt("Regenwurm");
        pflegerWerner.setLieblingsArt("Hecht");
        return zoo;


    }

    public static ArrayList<Gehege> shuffleclone(ArrayList<Gehege> liste){
        ArrayList<Gehege> neueListe = (ArrayList<Gehege>) liste.clone();
        Collections.shuffle(neueListe);
        return neueListe;
    }

    public static void setAllEnclosuresToUnfed(Zoo zoo){
        //Alle Gehege auf "nicht gefüttert" setzen:
        for (Gehege g : zoo.getListeDerGehege()) {
            if (g.isAlreadyFed()) {
                g.changeFeedStatus();
            }
        }
    }
    public static void setAllAnimalsToHasntBitten(ArrayList<Tier> liste){
        for (Tier t : liste){
            t.setHasBitten(false);
        }
    }

    public static void printArrayListGehege(ArrayList<Gehege> liste) {
        for (Gehege g : liste) {
            System.out.println(g.getName());
        }
    }
    public static void printArrayListTiere(ArrayList<Tier> liste) {
        for (Tier t: liste) {
            System.out.println(t.getName());
        }
    }

    public static void printArrayListPfleger(ArrayList<Pfleger> liste) {
        for (Pfleger g : liste) {
            System.out.print(g.getName() + " ");
        }
    }
    public static void watchFavourite(Zoo zoo, Pfleger pfleger) {
        System.out.println("\n" + pfleger + " schaut noch das Lieblingstier an: ");
        Tier t = zoo.findArt(pfleger.getLieblingsArt());
        if (t != null){
            t.watch(pfleger);
        }
        //else System.out.println("Leider ist das Lieblingtier " + pfleger.getLieblingsArt() + " im Zoo nicht vorhanden.");
    }

    public static void watchRandom(Zoo zoo, Pfleger pfleger) {
        System.out.println("\n" + pfleger + " schaut noch ein zufälliges Tier an: ");
        //Random random = new Random();
        chooseRandom(zoo.getListeDerTiere()).watch(pfleger);
    }

    public static Tier chooseRandom(ArrayList<Tier> liste){
        Random random = new Random();
        return liste.get(random.nextInt(liste.size()));
    }

}



