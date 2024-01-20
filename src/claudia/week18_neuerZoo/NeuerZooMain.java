package claudia.week18_neuerZoo;

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

        zoo.gehegeHinzufuegen(aquarium, zoo.getListeDerGehege());
        zoo.gehegeHinzufuegen(wald, zoo.getListeDerGehege());
        zoo.gehegeHinzufuegen(hochgebirge, zoo.getListeDerGehege());

        Tier hai1 = new Tier("Hai 1", "Hai", Lagerhaus.Futterarten.FISCH, 127 );
        System.out.println("\nNeues Tier erzeugt: " + hai1.getName() + "\nEs frisst " +
                hai1.getFutterBedarfInEinheit() + " " + zoo.getLagerhaus().getFutterliste().get(hai1.getFutterart()).getEinheit() + " " + hai1.getFutter());
        Tier goldfisch1 = new Tier("Goldi 1", "Goldfisch", Lagerhaus.Futterarten.SCHOKOLADE, 0.02);
        Tier goldfisch2 = new Tier("Goldi 2", "Goldfisch", Lagerhaus.Futterarten.SCHOKOLADE, 0.02);


        aquarium.tierHinzfuegen(hai1);
        aquarium.tierHinzfuegen(goldfisch1);
        aquarium.tierHinzfuegen(goldfisch2);

        Tier tiger1 = new Tier("Tiger 1", "Tiger", Lagerhaus.Futterarten.SCHOKOLADE, 18.00);

        wald.tierHinzfuegen(tiger1);

        Tier murmeltier1 = new Tier("Murmel 1", "Murmeltier", Lagerhaus.Futterarten.GRAS, 0.027);

        hochgebirge.tierHinzfuegen(murmeltier1);

        zoo.printStructure();

        zoo.erstelleFutterstatistik();




    }
}
