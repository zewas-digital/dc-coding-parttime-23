package judith.week20.Schwarzwaldklinik;

public class Warteraum {


    //Attribut
    public int anzahlVonPlaetzen;


//Konstruktor

    public Warteraum(int anzahlVonPlaetzen) {
        this.anzahlVonPlaetzen = anzahlVonPlaetzen;
    }


    //Methode
    //type????

    public String patAufruf(String name) { //mit Variablen Namen (Patientennamen) ersetzen
        String aufruf = "Patient " + "patName "+ " wird aufgerufen";

        return aufruf;

    }


}
