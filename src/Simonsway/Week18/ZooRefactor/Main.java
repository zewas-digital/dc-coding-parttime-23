package Simonsway.Week18.ZooRefactor;

public class Main {
    public static void main(String[] args) {

        // Zoo erstellen

        Zoo tierGartenDornbirn = new Zoo("Tiegarten Dornbirn", "2021");
        Zoo tierGartenBregenz = new Zoo("Tiergarten Bregenz", "2022");

        // Gehege erstellen

        Gehege alpenWiese = new Gehege("Alpenwiese");
        Gehege westhang = new Gehege("Westhang");

        // Gehege Zoo zuordnen

        tierGartenDornbirn.addGehege(alpenWiese);
        tierGartenBregenz.addGehege(westhang);

        // Futter erstellen

        Futter heu = new Futter ("Heu", 0.50F, Futter.einheit.KG);


        // Tiere erstellen

        Tiere wildschwein = new Tiere("Wildschwein", "Wildtiere", 5);
        Tiere hirsch = new Tiere("Hirsch", "Wildtiere", 2);

        // Tiere Geheg zuordnen

        alpenWiese.addTiere(wildschwein);

        // Futter Tier zuordnen

        wildschwein.addFutter(heu);



        tierGartenDornbirn.zooDisplayOutput();
        tierGartenBregenz.zooDisplayOutput();




    }
}
