package judith.week20.Schwarzwaldklinik;

import java.util.ArrayList;

public class Room {

    //Attribute

    public String roomNumber;

    private ArrayList<Bed> bedArrayList = new ArrayList<Bed>();

//Konstruktor
    public Room(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void addBed(Bed bed){
        bedArrayList.add(bed);
    }

    public String toString() {
        return "Room number: " + this.roomNumber;
    }
}
