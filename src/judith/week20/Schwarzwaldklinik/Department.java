package judith.week20.Schwarzwaldklinik;

import java.util.ArrayList;

public class Department {

    //Attribute
    public String departmentName;
    private ArrayList<Station> stationArrayList = new ArrayList<>();


    //Konstruktor
    public Department(String departmentName) {
        this.departmentName = departmentName;
    }


    //Methoden

    public void addStation(Station station) {
        stationArrayList.add(station);
    }


    //Patient aufnehmen
    //Patient entlassen

    public void patAdmission(String name) { // name ersetzen mit Patientenname Variable

        System.out.println("Patient " + "patName" + " wurde aufgenommen");
    }

    public void patDischarge(String name) { // name ersetzen mit Patientennamen Variable

        System.out.println("Patient " + "patName" + " wurde entlassen");

    }

    public String toString() {
        return "Department: " + this.departmentName;
    }

}
