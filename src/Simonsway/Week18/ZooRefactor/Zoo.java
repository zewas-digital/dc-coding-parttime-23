package Simonsway.Week18.ZooRefactor;

import java.util.ArrayList;

public class Zoo {

    private String name;
    private String gruendungsJahr;
    public ArrayList <Gehege> gehegeArrayList = new ArrayList<>();

    // Zoo Konstruktor
    //////////////////////////////////////////////////////////////////////////////////////////////////
    public Zoo(String name, String gruendungsJahr) {
        this.name = name;
        this.gruendungsJahr = gruendungsJahr;
    }

    // Zoo Setter & Getter
    //////////////////////////////////////////////////////////////////////////////////////////////////
    public void setName(String name) {
        this.name = name;
    }
    public void setGruendungsJahr(String gruendungsJahr) {
        this.gruendungsJahr = gruendungsJahr;
    }

    // Zoo Getter
    public String getName() {
        return this.name;
    }
    public String getGruendungsJahr() {
        return this.gruendungsJahr;
    }

    // Zoo toString
    public String toString(){
        return "Zoo: " + this.name + " Gründungsjahr " + this.gruendungsJahr;
    }

    // Gehege
    //////////////////////////////////////////////////////////////////////////////////////////////////
    public void addGehege (Gehege gehege){
        this.gehegeArrayList.add(gehege);
    }
    public void removeGehege (Gehege gehege){
        this.gehegeArrayList.remove(gehege);
    }

    // Output
    //////////////////////////////////////////////////////////////////////////////////////////////////

    public void zooDisplayOutput(){
        String zooDisplayOutput = toString();
        System.out.println("\n├── " + zooDisplayOutput);

        for (int i = 0; i < this.gehegeArrayList.size(); i++) {
            System.out.println("│   ├── " + this.gehegeArrayList.get(i));

            for (int j = 0; j < this.gehegeArrayList.get(i).getTiereArrayList().size(); j++) {
                System.out.println("│       ├── " + this.gehegeArrayList.get(i).getTiereArrayList().get(j));
            }
        }
    }
}
