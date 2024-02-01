package Alpi.week18_PfelgeraufgabeNeu;

public class ZooSimulationMAIN {

    public static void main(String[] args) {

        Pfleger pflegerPeter = new Pfleger("Peter");
        Pfleger pflegerHans = new Pfleger("Hans");
        Pfleger pflegerBernd = new Pfleger("Bernd");


        Gehege gehegeAlpen = new Gehege("Alpen", "Peter");
        Gehege gehegeSavanne = new Gehege("Savanne", "Hans");
        Gehege gehegeAquarium = new Gehege("Aquarium", "Bernd");

        gehegeAlpen.setBearbeitet(true);
        gehegeSavanne.setBearbeitet(true);
        gehegeAquarium.setBearbeitet(false);












    }
}
