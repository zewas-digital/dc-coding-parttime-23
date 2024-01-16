package judith.week17_zoo;

import java.util.ArrayList;

public class Zoo {



// 2/ Erstelle eine Zoo Klasse mit Name und Gründungsjahr
    private String zooName;
    private int gruendungsJahr;
    public Gehege gehege;



    public Zoo(String zooName, int gruendungsJahr){
        this.zooName = zooName;
        this.gruendungsJahr = gruendungsJahr;
    }


    public Zoo(){}

    public void setName(String zooName){this.zooName = zooName;}
    public String getZooName(){return this.zooName;}

    public void setGruendungsJahr(int gruendungsJahr) {this.gruendungsJahr = gruendungsJahr;}

    public int getGruendungsJahr(){return this.gruendungsJahr;}

    @Override
    public String toString(){
        return "Zoo {" + super.toString() +
                "\n Zooname: " + zooName +
                "\n Gründungsjahr: " + gruendungsJahr +
                "\n}";
        }

    ArrayList<Gehege> gehegeArrayList = new ArrayList<>();

    public void addGehege(Gehege gehege){
        gehegeArrayList.add(this.gehege);

    }
}





