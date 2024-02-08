package volkan.week17_zoo;

import java.util.ArrayList;

public class Zoo {



// 2/ Erstelle eine Zoo Klasse mit Name und Gründungsjahr
    private String zooName;
    private int gruendungsJahr;
    Gehege gehege;




    public Zoo(String zooName, int gruendungsJahr){
        this.zooName = zooName;
        this.gruendungsJahr = gruendungsJahr;
    }


    public Zoo(){}

    public void setName(String zooName){this.zooName = zooName;}
    public String getZooName(){return this.zooName;}

    public void setGruendungsJahr(int gruendungsJahr) {this.gruendungsJahr = gruendungsJahr;}

    public int getGruendungsJahr(){return this.gruendungsJahr;}



    public ArrayList<Gehege> gehegeArrayList = new ArrayList<>();

    public void addGehege(Gehege gehege){
        gehegeArrayList.add(gehege);}

    public void zooStrukturGehege(){
        System.out.println("\n├── " + "Zoo: "+ getZooName() + ", gegründet " + gruendungsJahr);

        for (int i = 0; i <gehegeArrayList.size() ; i++) {
            System.out.println("│   ├── " + this.gehegeArrayList.get(i));

        }
    }

    public void zooStrukturGegeheTiere(){
        System.out.println("\n├── " + "Zoo: "+ getZooName() + ", gegründet " + gruendungsJahr);

        for (int i = 0; i <gehegeArrayList.size() ; i++) {
            System.out.println("│   ├── " + this.gehegeArrayList.get(i));


            for (int j = 0; j < this.gehegeArrayList.get(i).getTiereArrayList().toArray().length; j++) {
                System.out.println("│       ├── " + this.gehegeArrayList.get(i).getTiereArrayList().get(j));
            } {

            }
        }
    }
}





