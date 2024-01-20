package saifedine.week18_Zoo.V02_mit_Bonus;

import java.util.ArrayList;
import java.util.HashMap;

public class Zoo {

    private String zooName;
    private int gruendungsjahr;
    private ArrayList<Gehege> gehegeArrayList = new ArrayList<>();

    private float futterPreisProEinheit = 2;

    private float tagesbedarf;

    Tiere tiere;
    Futter futter;



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

    public void zooStrukturGehege() {

        String zooDaten = toString();

        System.out.println("\n├── " + zooDaten);

        for (int i = 0; i < gehegeArrayList.toArray().length; i++) {
            System.out.println("│   ├── " + this.gehegeArrayList.get(i));
        }
        //System.out.println("gehegeArrayList.toArray().length - Länge: " + gehegeArrayList.toArray().length);
    }

    public void zooStrukturGehegeTiere() {

        String zooDaten = toString();

        System.out.println("\n├── " + zooDaten);

        for (int i = 0; i < gehegeArrayList.toArray().length; i++) {
            System.out.println("│   ├── " + this.gehegeArrayList.get(i));

            for (int j = 0; j < this.gehegeArrayList.get(i).gettierArrayList().toArray().length; j++) {
                System.out.println("│       ├── " + this.gehegeArrayList.get(i).gettierArrayList().get(j));
            }
        }
    }

    public void zooStrukturGehegeTiereFutter() {

        String zooDaten = toString();

        System.out.println("\n├── " + zooDaten);

        for (int i = 0; i < gehegeArrayList.toArray().length; i++) {
            System.out.println("│   ├── " + this.gehegeArrayList.get(i));

            for (int j = 0; j < this.gehegeArrayList.get(i).gettierArrayList().toArray().length; j++) {
                System.out.println("│       ├── " + this.gehegeArrayList.get(i).gettierArrayList().get(j));

            }
        }
    }

    HashMap<String, Integer> futterMengenBedarfListe = new HashMap<>();

    public void addfutterMengenBedarf(String futterName, int futterBedarf) {
        this.futterMengenBedarfListe.put(futterName, futterBedarf);
    }

    public float kalkulationBedarf() {

        for (int i = 0; i < gehegeArrayList.toArray().length; i++) {

            for (int j = 0; j < this.gehegeArrayList.get(i).gettierArrayList().size(); j++) {

                this.tagesbedarf += ((this.gehegeArrayList.get(i).gettierArrayList().get(j).getFutterBedarf()));
                System.out.println(this.tagesbedarf);
            }
        }
        System.out.println("Der Tagesbedarf an allen Futtersorten ist: " + this.tagesbedarf);
        return this.tagesbedarf;
    }


    public void kalkulationBedarfPreis() {

        for (int i = 0; i < gehegeArrayList.toArray().length; i++) {

            for (int j = 0; j < this.gehegeArrayList.get(i).gettierArrayList().size(); j++) {

                String futterName =  this.gehegeArrayList.get(i).gettierArrayList().get(j).futter.getFutterName();
                int futterBedarf =   this.gehegeArrayList.get(i).gettierArrayList().get(j).getFutterBedarf();

                //System.out.println("----->" + futterName);

                if (this.futterMengenBedarfListe.get(futterName) != null){
                    this.futterMengenBedarfListe.replace(futterName,futterBedarf + this.futterMengenBedarfListe.get(futterName));
                }
                else {
                    this.futterMengenBedarfListe.put(futterName,futterBedarf);
                }
            }
        }

        System.out.println("Der Tagesbedarf an allen Futtersorten ist: " + this.futterMengenBedarfListe);

    }




    //this.tagesbedarf = this.futterPreisProEinheit * this.tiere.getFutterBedarf();

    // version von simon:

    /*
    public float gesamtBedarfKalkulation(){
    float gesamtBedarf = 0;
    for (int i = 0; i < this.gehegeArrayList.size(); i++) {
        for (int j = 0; j < this.gehegeArrayList.get(i).getTiereArrayList().size(); j++) {
            gesamtBedarf += this.gehegeArrayList.get(i).getTiereArrayList().get(j).getBedarf();
        }
    }
    return gesamtBedarf;
}
     */
}

