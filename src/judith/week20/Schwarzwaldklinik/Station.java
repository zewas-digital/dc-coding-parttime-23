package judith.week20.Schwarzwaldklinik;

import java.util.ArrayList;

public class Station extends Department {


    private String stationName;

    private ArrayList<Room> roomArrayList = new ArrayList<>();

    public Station(String departmentName, String stationName) {
        super(departmentName);
        this.stationName = stationName;
    }

    public String getStationName() {
        return stationName;
    }

    // Methode Zimmer der Station zuweisen

    public void addRoom(Room room) {
        roomArrayList.add(room);
    }

    // Patient aufnehmen
    @Override
    public void patAdmission(String patName) {
        super.patAdmission(patName);
        System.out.println("Patient " + patName + " wird stationär aufgenommen.");
    }

    // Patient entlassen
    @Override
    public void patDischarge(String patName) {
        super.patDischarge(patName);
        System.out.println("Patient " + patName + " wird stationär entlassen.");
    }

    // Ausgabe
    public String toString() {
        return "Station: " + this.getStationName();
    }


}
