package judith.week20.Schwarzwaldklinik;

public class Ambulance extends Department{

    //vererbung von Abteilung?

    //Attribute

    private String ambulanceName;
    public String openingHours;



    //Konstruktor


    public Ambulance(String departmentName, String ambulanceName, String openingHours) {
        super(departmentName);
        this.ambulanceName = ambulanceName;
        this.openingHours = openingHours;
    }

    public String getAmbulanceName() {
        return ambulanceName;
    }

    @Override
    public void patAdmission(String patName) {
        super.patAdmission(patName);
        System.out.println("Patient " + patName + " wird ambulant aufgenommen");
    }

    @Override
    public void patDischarge(String patName) {
        super.patDischarge(patName);
        System.out.println("Patient " + patName + "wird ambulant entlassen " );
    }


    public String toString(){ return "Ambulanz: " + this.getAmbulanceName()
        + " Öffnungszeiten: " + this.openingHours;}


}
