package claudia.week18_neuerZoo;

import java.util.ArrayList;

public class NeuerZooMain {
    public static void main(String[] args) {

        Zoo zoo = new Zoo("Premiumzoo Dornbirn", 1973);
        System.out.println("\nNeuer Zoo erzeugt: " + zoo);
        System.out.println("\nFolgende Arten von Futter sind verfügbar:\n");

        for (Lagerhaus.Futterarten fa : Lagerhaus.Futterarten.values()){
            System.out.println(fa);
        }

        Gehege aquarium = new Gehege("Aquarium", 20000);
        Gehege wald = new Gehege("Wald", 4390);
        Gehege hochgebirge = new Gehege("Hochgebirge", 43);
        Gehege tiefsee = new Gehege("Tiefsee", 1149);

        zoo.gehegeHinzufuegen(aquarium, zoo.getListeDerGehege());
        zoo.gehegeHinzufuegen(wald, zoo.getListeDerGehege());
        zoo.gehegeHinzufuegen(hochgebirge, zoo.getListeDerGehege());
        zoo.gehegeHinzufuegen(tiefsee, zoo.getListeDerGehege());

        Tier hai1 = new Tier("Hai 1", "Hai", Lagerhaus.Futterarten.FISCH, 127 );
        System.out.println("\nNeues Tier erzeugt: " + hai1.getName() + "\nEs frisst " + hai1.getFutterBedarfInEinheit()
                + " " + zoo.getLagerhaus().getFutterliste().get(hai1.getFutterart()).getEinheit() + " " + hai1.getFutter());
        Tier goldfisch1 = new Tier("Goldi 1", "Goldfisch", Lagerhaus.Futterarten.SCHOKOLADE, 0.02);
        Tier goldfisch2 = new Tier("Goldi 2", "Goldfisch", Lagerhaus.Futterarten.SCHOKOLADE, 0.017);


        aquarium.tierHinzufuegen(hai1);
        aquarium.tierHinzufuegen(goldfisch1);
        aquarium.tierHinzufuegen(goldfisch2);

        Tier tiger1 = new Tier("Tiger 1", "Tiger", Lagerhaus.Futterarten.SCHOKOLADE, 18.00);

        wald.tierHinzufuegen(tiger1);

        Tier murmeltier1 = new Tier("Murmel 1", "Murmeltier", Lagerhaus.Futterarten.GRAS, 0.027);

        hochgebirge.tierHinzufuegen(murmeltier1);

        //zoo.printStructure();

        //zoo.erstelleFutterstatistik();

        /*
        System.out.println("\nTier " + murmeltier1.getName() + " wird gefüttert: ");
        murmeltier1.feed();
        zoo.feedAll();
*/
        System.out.println("\nDer Zoo braucht Personal!");
        Pfleger hansi = new Pfleger("Hansi", zoo.getListeDerGehege(), zoo.getZustaendig());
        Pfleger berni = new Pfleger("Berni", zoo.getListeDerGehege(), zoo.getZustaendig());

        zoo.pflegerHinzufuegen(hansi, zoo.getListeDerPfleger());
        zoo.pflegerHinzufuegen(berni, zoo.getListeDerPfleger());

       /* int index = 0;
        for (Pfleger p: zoo.getListeDerPfleger()) {
            for (Gehege g: p.getListeDerBetreutenGehege()){
                zoo.getPflegerUndGehege()[index][0] = p;
                zoo.getPflegerUndGehege()[index][1] = g);
            }
        }*/

    }
}
