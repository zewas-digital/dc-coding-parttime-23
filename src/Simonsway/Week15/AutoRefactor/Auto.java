package Simonsway.Week15.AutoRefactor;

public class Auto {

    public String marke = "";

    public String model = "";
    public int bauJahr;
    public int kmStand;
    public int tankVolumen;
    public double tankFuelstand;
    public double verbrauchProKM;


    public Auto(String marke, String model, int bauJahr, int kmStand, int tankVolumen, double verbrauchProKm) {

        if (bauJahr < 1885) {
            throw new IllegalArgumentException("Das Baujahr soll mit vier Ziffern angegeben werden");
        }
        this.marke = marke;
        this.model = model;
        this.bauJahr = bauJahr;
        this.kmStand = kmStand;
        this.tankVolumen = tankVolumen;
        this.verbrauchProKM = verbrauchProKm;

    }

    public void fahzeugDetails () {
        System.out.println("--------------------------" +
                "\n" + "Marke: " + this.marke + "\n"
                + "Model: " + this.model + "\n"
                + "Baujahr: " + this.bauJahr + "\n"
                + "Kilometerstand Aktuell: " + this.kmStand + "\n"
                + "--------------------------");
    }
    public void volltanken() {
        int counter = 0;
        while (this.tankVolumen > this.tankFuelstand){
            this.tankFuelstand++;
            counter++;
    }
        System.out.println("Es wurden " + counter + " Liter getankt.");
    }

    public void fahren(int kilomterZumZiel) {
        System.out.println("Sie möchten " + kilomterZumZiel + " fahren");
        boolean warning = false;
        while (kilomterZumZiel > 0 && this.tankFuelstand >= this.verbrauchProKM){
            kilomterZumZiel--;
            this.kmStand++;
            this.tankFuelstand -= this.verbrauchProKM;

            if (this.tankFuelstand <= 5 && !warning){
                System.out.println("Es sind nur noch 5 Liter im Tank. Restliche Kilometer " + kilomterZumZiel + " bis zum Ziel");
                warning = true;
            }
        }
    }
}