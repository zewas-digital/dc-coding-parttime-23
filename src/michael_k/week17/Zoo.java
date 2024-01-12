package michael_k.week17;

import java.util.ArrayList;

public class Zoo extends Object{

    private String name;
    private int gruendungsjahr;
    public ArrayList<Gehege> zoogehege = new ArrayList<Gehege>();
    public Zoo (String name, int gruendungsjahr){
        this.name = name;
        this.gruendungsjahr = gruendungsjahr;
    }
    public void gehegeHinzufuegen(String gehegename){
        this.zoogehege.add(createGehege ( gehegename ));
    }
    private static Gehege createGehege(String gehegename){
        Gehege gehege = new Gehege ( gehegename );
        return gehege;
    }
    public String printoverview(){
        String ausgabe = "|---Zoo: " + this.name + ", gegründet" + this.gruendungsjahr+"\n";
        int arraySize = zoogehege.size ( );

        for (int i = 0; i < arraySize; i++) {
           ausgabe = ausgabe + "|   |---" + "Gehege: "+ zoogehege.get ( i ).name+"\n";
        }

        return ausgabe;
    }
}
