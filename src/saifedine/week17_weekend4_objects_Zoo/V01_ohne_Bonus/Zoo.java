package saifedine.week17_weekend4_objects_Zoo.V01_ohne_Bonus;

import java.util.ArrayList;

public class Zoo {

    private String zooName;
    private int gruendungsjahr;
    private ArrayList<Gehege> gehegeArrayList = new ArrayList<>();

    Gehege gehege;

    //
    public Zoo(String zooName, int gruendungsjahr) {
        this.zooName = zooName;
        this.gruendungsjahr = gruendungsjahr;
    }


    public String toString() {
        return "Zoo: " + this.zooName + ", gegründet " + this.gruendungsjahr;
    }

    public void addGehege(Gehege gehege) {
        gehegeArrayList.add(gehege);
    }

    public void removeGehege(Gehege gehege) {
        gehegeArrayList.remove(gehege);
    }

    public ArrayList<Gehege> getgehegeArrayList() {
        return this.gehegeArrayList;
    }

    public void zooStrukturGehege(){

        String zooDaten = toString();

        System.out.println("\n├── " + zooDaten);

        for (int i = 0; i < gehegeArrayList.toArray().length; i++) {
            System.out.println("│   ├── " + this.gehegeArrayList.get(i));
        }
        //System.out.println("gehegeArrayList.toArray().length - Länge: " + gehegeArrayList.toArray().length);
    }

    public void zooStrukturGehegeTiere(){

        String zooDaten = toString();

        System.out.println("\n├── " + zooDaten);

        for (int i = 0; i < gehegeArrayList.toArray().length; i++) {
            System.out.println("│   ├── " + this.gehegeArrayList.get(i));

            for (int j = 0; j < this.gehegeArrayList.get(i).gettierArrayList().toArray().length; j++) {
                System.out.println("│       ├── " + this.gehegeArrayList.get(i).gettierArrayList().get(j));
            }
        }

    }

}

