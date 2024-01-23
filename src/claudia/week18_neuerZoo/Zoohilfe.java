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


        Tier hai1 = new Tier("Hai 1", "Hai", Lagerhaus.Futterarten.FISCH, 127, aquarium.getListeDerTiere());
        Tier goldfisch1 = new Tier("Goldi 1", "Goldfisch", Lagerhaus.Futterarten.SCHOKOLADE, 0.02, aquarium.getListeDerTiere());
        Tier goldfisch2 = new Tier("Goldi 2", "Goldfisch", Lagerhaus.Futterarten.SCHOKOLADE, 0.017, aquarium.getListeDerTiere());

        Tier tiger1 = new Tier("Tiger 1", "Tiger", Lagerhaus.Futterarten.SCHOKOLADE, 18.00, wald.getListeDerTiere());
        Tier murmeltier1 = new Tier("Murmel 1", "Murmeltier", Lagerhaus.Futterarten.GRAS, 0.027, hochgebirge.getListeDerTiere());

        return zoo;
    }

    public static Zoo erstelleStandardZooMitPflegern() {
        Zoo zoo = erstelleStandardZooOhnePfleger();

        Pfleger pflegerHansi = new Pfleger("Hansi", zoo.getListeDerPfleger(), zoo.getListeDerGehege(), false);//, zoo.getZustaendig());
        Pfleger pflegerBerni = new Pfleger("Berni", zoo.getListeDerPfleger(), zoo.getListeDerGehege(), false);//, zoo.getZustaendig());

        return zoo;


    }


}



