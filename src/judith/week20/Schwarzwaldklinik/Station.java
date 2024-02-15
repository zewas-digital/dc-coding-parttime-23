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

    public String toString() {
        return "Station: " + this.getStationName();
    }
}
