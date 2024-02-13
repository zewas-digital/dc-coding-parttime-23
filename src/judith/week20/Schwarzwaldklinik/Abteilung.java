package judith.week20.Schwarzwaldklinik;

public class Abteilung {

    //Attribute
    public String abteilungName;


    //Konstruktor
    public Abteilung(String abteilungName) {
        this.abteilungName = abteilungName;
    }


    //Methoden
    //Patient entlassen
    //Patient aufnehmen

    public void patEntlassen(String name) { // name ersetzen mit Patientennamen Variable

        System.out.println("Patient " + "patName" + " wurde entlassen");

    }

    public void patAufnahme(String name) { // name ersetzen mit Patientenname Variable

        System.out.println("Patient " + "patName" + " wurde aufgenommen");
    }


}
