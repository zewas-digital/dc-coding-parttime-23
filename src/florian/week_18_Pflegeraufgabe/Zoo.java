package florian.week_18_Pflegeraufgabe;

/*
Aufgabe: Zoo
1/ Erstelle eine Main Klasse, die zuständig ist für
+ die Initialisierung des Zoos und aller seiner Bestandteile

2/ Erstelle eine Zoo Klasse mit Name und Gründungsjahr

3/ Erstelle eine Gehege Klasse mit Name der als Beschreibung des Geheges dient.

4/ Erweitere deinen Zoo, sodass Gehege dynamisch hinzugefügt und entfernt werden können.

5/ Erweitere dein Programm um eine Funktion, die die Struktur des Zoos ausgibt.
Der erwartete Ausdruck sieht folgendermaßen aus:

├── Zoo: Tiergarten Dornbirn, gegründet 2022
│   ├── Gehege: Alpenwiese
│   ├── Gehege: Ried
│   ├── Gehege: Terrarium (warm)

 */


import java.util.ArrayList;

public class Zoo {


    private String name;
    private final int gruendungsjahr;

    private ArrayList<Gehege> gehegeArrayList;

    private ArrayList<Pfleger> pflegerArrayList;

    public Zoo(String name, int gruendungsjahr) {

        this.name = name;
        this.gruendungsjahr = gruendungsjahr;
        this.gehegeArrayList = new ArrayList<>();
        this.pflegerArrayList = new ArrayList<>();

    }

    // Getter und Setter
    public int getGruendungsjahr() {
        return gruendungsjahr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Gehege> getGehegeArrayList() {
        return gehegeArrayList;
    }

    public void setGehegeArrayList(ArrayList<Gehege> gehegeArrayList) {
        this.gehegeArrayList = gehegeArrayList;
    }

    public ArrayList<Pfleger> getPflegerArrayList() {
        return pflegerArrayList;
    }

    public void setPflegerArrayList(ArrayList<Pfleger> pflegerArrayList) {
        this.pflegerArrayList = pflegerArrayList;
    }


    // Methoden für die Main
    public void addGehege(Gehege gehege) {
        this.gehegeArrayList.add(gehege);
    }

    public void removeGehege(Gehege gehege) {
        this.gehegeArrayList.add(gehege);
    }

    public void addPfleger(Pfleger pfleger) {
        this.pflegerArrayList.add(pfleger);
    }

    public void removePfleger(Pfleger pfleger) {
        this.pflegerArrayList.remove(pfleger);
    }

    public void zustaendigkeitfuerGehege(Pfleger pfleger, Gehege gehege) {

        if (this.pflegerArrayList.contains(pfleger) && this.gehegeArrayList.contains(gehege)) {
            pfleger.getGehegeZustaendigkeitArrayList().add(gehege);
        } else {
            System.out.println("Pfleger oder Gehege schon Vorhanden oder falsch zugeordnet");
        }
    }


}





