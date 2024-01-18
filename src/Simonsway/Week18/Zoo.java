package Simonsway.Week18;

import java.util.ArrayList;
import java.util.HashMap;

public class Zoo {

    private String zooName;
    private String zooJahr;
    private ArrayList<Gehege> gehegeArrayList = new ArrayList<>();

    // Constructor
    public Zoo (String zooName, String zooJahr){
        this.zooName = zooName;
        this.zooJahr = zooJahr;
    }
    public String toString(){
        return "Zoo: " + this.zooName + " Gründungsjahr " + this.zooJahr;
    }
    public void addGehege (Gehege gehege){
        this.gehegeArrayList.add(gehege);
    }
    public void removeGehege (Gehege gehege){
        this.gehegeArrayList.remove(gehege);
    }
    public ArrayList<Gehege> getgehegeArrayList(){
        return this.gehegeArrayList;
    }

    public void zooDisplayOutput(){

        String zooDisplayOutput = toString();

        System.out.println("\n├── " + zooDisplayOutput);

        for (int i = 0; i < gehegeArrayList.toArray().length; i++) {
            System.out.println("│   ├── " + this.gehegeArrayList.get(i));

            for (int j = 0; j < this.gehegeArrayList.get(i).getTiereArrayList().toArray().length; j++) {
                System.out.println("│       ├── " + this.gehegeArrayList.get(i).getTiereArrayList().get(j));
            }
        }
    }

}
