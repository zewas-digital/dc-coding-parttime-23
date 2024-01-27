package claudia.week18_neuerZoo;

import java.util.ArrayList;

public class NeuerZooMain {
    public static void main(String[] args) {

        Zoo zoo = new Zoo("Premiumzoo Dornbirn", 1973);
        System.out.println("\nNeuer Zoo erzeugt: " + zoo);
        System.out.println("\nFolgende Arten von Futter sind verfügbar:\n");

        for (Lagerhaus.Futterarten fa : Lagerhaus.Futterarten.values()) {
            System.out.println(fa);
        }

        Gehege aquarium = new Gehege("Aquarium", 20000, zoo.getListeDerGehege());
        Gehege wald = new Gehege("Wald", 4390, zoo.getListeDerGehege());
        Gehege hochgebirge = new Gehege("Hochgebirge", 43, zoo.getListeDerGehege());
        Gehege tiefsee = new Gehege("Tiefsee", 1149, zoo.getListeDerGehege());


        Tier hai1 = new Tier("Hai 1", "Hai", Lagerhaus.Futterarten.FISCH, 127, aquarium.getListeDerTiere());
        System.out.println("\nNeues Tier erzeugt: " + hai1.getName() + "\nEs frisst " + hai1.getFutterBedarfInEinheit()
                + " " + zoo.getLagerhaus().getFutterliste().get(hai1.getFutterart()).getEinheit() + " " + hai1.getFutter());
        Tier goldfisch1 = new Tier("Goldi 1", "Goldfisch", Lagerhaus.Futterarten.SCHOKOLADE, 0.02, aquarium.getListeDerTiere());
        Tier goldfisch2 = new Tier("Goldi 2", "Goldfisch", Lagerhaus.Futterarten.SCHOKOLADE, 0.017, aquarium.getListeDerTiere());


        Tier tiger1 = new Tier("Tiger 1", "Tiger", Lagerhaus.Futterarten.SCHOKOLADE, 18.00, wald.getListeDerTiere());

        Tier murmeltier1 = new Tier("Murmel 1", "Murmeltier", Lagerhaus.Futterarten.GRAS, 0.027, hochgebirge.getListeDerTiere());

        zoo.printStructure();

        zoo.printFeedList();


        System.out.println("\nTier " + murmeltier1.getName() + " wird gefüttert: ");
        murmeltier1.feed();
        zoo.feedAll();

        System.out.println("\nDer Zoo braucht Personal!");
        Pfleger hansi = new Pfleger("Hansi", zoo.getListeDerPfleger(), zoo.getListeDerGehege(), false);//, zoo.getZustaendig());
        Pfleger berni = new Pfleger("Berni", zoo.getListeDerPfleger(), zoo.getListeDerGehege(), false);//, zoo.getZustaendig());

        System.out.println("\nAlle Pfleger im Zoo: ");
        ArrayList<Pfleger> allePfleger = zoo.getListeDerPfleger();
        for (Pfleger p : allePfleger) {
            System.out.println(p.getName());
        }

        System.out.println("\nPfleger " + hansi.getName() + " betreut Gegehe: ");
        ArrayList<Gehege> betreuteGehege = hansi.getListeDerBetreutenGehege();
        for (Gehege g : betreuteGehege) {
            System.out.println(g.getName());
        }


        System.out.println("\nListe aller Tiere: ");
        ArrayList<String> liste = zoo.listeAllerTiere();
        for (String t : liste) {
            System.out.println(t);
        }

        System.out.println("\n\nLISTE!: ");
        zoo.getPflegerUndGehegeListe();
    }


}



