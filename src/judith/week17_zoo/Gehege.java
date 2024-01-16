package judith.week17_zoo;

public class Gehege {
    //3/ Erstelle eine Gehege Klasse mit Name der als Beschreibung des Geheges dient.

    public String gehegeName;

    public Gehege(String gehegeName){
        this.gehegeName = gehegeName;
    }

    public String toString(){
        return "Gehege {" + super.toString() +
                "\n Gehegename: " + gehegeName +
                "\n}";
    }


}
