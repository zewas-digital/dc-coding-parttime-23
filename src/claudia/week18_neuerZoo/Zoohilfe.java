package claudia.week18_neuerZoo;

import java.util.ArrayList;
public class Zoohilfe {

    public static Zoo erstelleStandardZooOhnePfleger() {
        double[] preisliste = {3.5, 21.0, 5.21};
        Lagerhaus lagerhaus = new Lagerhaus(preisliste);
        Zoo zoo = new Zoo("Standardzoo", 2024, lagerhaus);

        Gehege aquarium = new Gehege("Aquarium", 20000, zoo.getListeDerGehege());
        Gehege wald = new Gehege("Wald", 4390, zoo.getListeDerGehege());
        Gehege hochgebirge = new Gehege("Hochgebirge", 43, zoo.getListeDerGehege());
        Gehege tiefsee = new Gehege("Tiefsee", 1149, zoo.getListeDerGehege());
        Gehege sandwueste = new Gehege("Sandwüste", 32045, zoo.getListeDerGehege());

        Tier hai1 = new Tier("Hai 1", "Hai", Lagerhaus.Futterarten.FISCH, 127, aquarium.getListeDerTiere());
        Tier goldfisch1 = new Tier("Goldi 1", "Goldfisch", Lagerhaus.Futterarten.SCHOKOLADE, 0.02, aquarium.getListeDerTiere());
        Tier goldfisch2 = new Tier("Goldi 2", "Goldfisch", Lagerhaus.Futterarten.SCHOKOLADE, 0.017, aquarium.getListeDerTiere());
        Tier tiger1 = new Tier("Tiger 1", "Tiger", Lagerhaus.Futterarten.SCHOKOLADE, 18.00, wald.getListeDerTiere());
        Tier tiger2 = new Tier("Tiger 2", "Tiger", Lagerhaus.Futterarten.SCHOKOLADE, 7.00, wald.getListeDerTiere());
        Tier murmeltier1 = new Tier("Murmel 1", "Murmeltier", Lagerhaus.Futterarten.GRAS, 0.027, hochgebirge.getListeDerTiere());
        Tier murmeltier2 = new Tier("Murmel 2", "Murmeltier", Lagerhaus.Futterarten.GRAS, 1.03, hochgebirge.getListeDerTiere());
        Tier murmeltier3 = new Tier("Murmel 3", "Murmeltier", Lagerhaus.Futterarten.GRAS, 0.52, hochgebirge.getListeDerTiere());
        Tier riesenkrake = new Tier("Kraki 1", "Riesenkrake", Lagerhaus.Futterarten.FISCH, 82, tiefsee.getListeDerTiere());

        for (int i = 1; i < 6; i++){
            new Tier("Böckle " + i, "Steinbock", Lagerhaus.Futterarten.GRAS, i, hochgebirge.getListeDerTiere());
        }

        for (int i = 1; i < 11; i++){
            new Tier("Hechti " + i, "Hecht", Lagerhaus.Futterarten.FISCH, i, aquarium.getListeDerTiere());
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

    public static void setAllEnclosuresToUnfed(Zoo zoo){
        //Alle Gehege auf "nicht gefüttert" setzen:
        for (Gehege g : zoo.getListeDerGehege()) {
            if (g.isAlreadyFed()) {
                g.changeFeedStatus();
            }
        }
    }

    public static void printArrayListGehege(ArrayList<Gehege> liste) {
        for (Gehege g : liste) {
            System.out.println(g.getName());
        }
    }

    public static void printArrayListPfleger(ArrayList<Pfleger> liste) {
        for (Pfleger g : liste) {
            System.out.print(g.getName() + " ");
        }
    }
    public static void watchFavourite(Zoo zoo, Pfleger pfleger) {
        System.out.println("\nPfleger " + pfleger.getName() + " schaut noch sein Lieblingstier an: ");
        Tier t = zoo.findArt(pfleger.getLieblingsArt());
        if (t != null){
            t.watch(pfleger);
        }
        //else System.out.println("Leider ist das Lieblingtier " + pfleger.getLieblingsArt() + " im Zoo nicht vorhanden.");
    }

}



