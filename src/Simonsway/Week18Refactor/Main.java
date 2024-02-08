package Simonsway.Week18Refactor;

import oliver.week18_Zoo.Tier;

public class Main {

    public static void main(String[] args) {


        // Zoo erstellen
        Zoo tierparkDornbirn = new Zoo("Tierpark Dornbirn", "2023");

        // Gehege erstellen und Zoo zuordnen
        Gehege westhang = tierparkDornbirn.neuesGehege("Westhang");

        // Futter erstellen

        Futter heu = new Futter("Heu", "KG", 2);
        Futter fleisch = new Futter("Fleisch", "KG", 3);

        // Tiere erstellen

        Tiere hirsch = westhang.neuesTier("Hirsch", heu, 4);
        Tiere reh = westhang.neuesTier("Reh", heu, 10);



        tierparkDornbirn.zooDisplayOutput();

    }


}
