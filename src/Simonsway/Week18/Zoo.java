package Simonsway.Week18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Zoo {

    // Parameter
    private String zooName;
    private String zooJahr;

    public ArrayList <Gehege> gehegeArrayList;



    // Externe Klassen Import
    Futter futter;
    Tiere tiere;


    // Konstruktor
    public Zoo (String zooName, String zooJahr){
        this.zooName = zooName;
        this.zooJahr = zooJahr;
        this.gehegeArrayList = new ArrayList<>();
    }

    // To String
    public String toString(){
        return "Zoo: " + this.zooName + " Gründungsjahr " + this.zooJahr;
    }
    public String getZooName() {
        return zooName;
    }
    public String getZooJahr() {
        return zooJahr;
    }


    // Gehege
    public void addGehege (Gehege gehege){
        this.gehegeArrayList.add(gehege);
    }
    public void removeGehege (Gehege gehege){
        this.gehegeArrayList.remove(gehege);
    }
    public ArrayList<Gehege> getgehegeArrayList(){
        return this.gehegeArrayList;
    }



    //Gesamt Bedarf Kalkulation
    HashMap<String, Futter> futterHashMap = new HashMap<>();





    // Display Output
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







//    public void zooDisplayOutputV1(){
//        System.out.println(haken + "Zoo: " + zooName + ", gegründet " + zooJahr);
//        for (Gehege s : gehegeArrayList){
//            System.out.println(haken2 + " Gehege:" + s.getGehegeName());
//            for (Tiere t : s.tiereArrayList){
//                System.out.println(haken3 + "Name:");
//            }
//        }
//    }



    //    public float gesamtBedarfKalkulation(){
//        float gesamtBedarf = 0;
//        for (int i = 0; i < this.gehegeArrayList.size(); i++) {
//            for (int j = 0; j < this.gehegeArrayList.get(i).getTiereArrayList().size(); j++) {
//                gesamtBedarf += this.gehegeArrayList.get(i).getTiereArrayList().get(j).getBedarf();
//                if (this.gehegeArrayList.get(i).getTiereArrayList().get(j).getBedarf() <= 0){
//
//                }
//            }
//            System.out.println(futterHashMap.toString());
//        }
//        return gesamtBedarf;
//    }



//    public float gesamtBedarfKalkluationPreis(){
//        float gesamtBedarfPreis = 0;
//        for (int i = 0; i < this.gehegeArrayList.size(); i++) {
//            for (int j = 0; j < this.gehegeArrayList.get(i).getTiereArrayList().size(); j++) {
//                gesamtBedarfPreis += this.gehegeArrayList.get(i).getTiereArrayList().get(j).getBedarf() * this.gehegeArrayList.get(i).getTiereArrayList().get(j).getFutter().getEinheitsPreis();
//            }
//        }
//        return gesamtBedarfPreis;
//    }

}
