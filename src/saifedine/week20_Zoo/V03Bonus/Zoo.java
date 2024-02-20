package saifedine.week20_Zoo.V03Bonus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

public class Zoo {

    // Attribute
    private String zooName;
    private int gruendungsjahr;

    private ArrayList<Gehege> gehegeArrayList = new ArrayList<>();
    private float tagesbedarf;

    HashMap<Futter.FutterArt, Integer> futterMengenBedarfListe = new HashMap<>();

    public Vector<Pfleger> pfleger;


    // Konstruktor
    public Zoo(String zooName, int gruendungsjahr) {
        this.zooName = zooName;
        this.gruendungsjahr = gruendungsjahr;
        this.pfleger = new Vector<>();
    }


    // alle Methoden, wobei toString immer der erste sein soll
    @Override
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

    public float kalkulationBedarf() {

        for (int i = 0; i < gehegeArrayList.toArray().length; i++) {

            for (int j = 0; j < this.gehegeArrayList.get(i).gettierArrayList().size(); j++) {

                this.tagesbedarf += ((this.gehegeArrayList.get(i).gettierArrayList().get(j).getFutterBedarf()));
                System.out.println(this.tagesbedarf);
            }
        }
        System.out.println("\nDer Tagesbedarf an allen Futtersorten ist: " + this.tagesbedarf + "\n");
        return this.tagesbedarf;
    }


    public void kalkulationBedarfPreis() {

        for (int i = 0; i < gehegeArrayList.toArray().length; i++) {

            for (int j = 0; j < this.gehegeArrayList.get(i).gettierArrayList().size(); j++) {

                Futter.FutterArt futterArt = this.gehegeArrayList.get(i).gettierArrayList().get(j).getFutterArt();
                int futterBedarf = this.gehegeArrayList.get(i).gettierArrayList().get(j).getFutterBedarf();

                //System.out.println("----->" + futterArt);

                if (this.futterMengenBedarfListe.get(futterArt) != null) {
                    this.futterMengenBedarfListe.replace(futterArt, futterBedarf + this.futterMengenBedarfListe.get(futterArt));
                } else {
                    this.futterMengenBedarfListe.put(futterArt, futterBedarf);
                }
            }
        }
        System.out.println("Der Tagesbedarf an Futter pro Sorte ist: " + this.futterMengenBedarfListe + "\n");

        // https://www.w3schools.com/java/java_hashmap.asp

        System.out.println("Kalkulation Tagesbedarf: ");

        System.out.println("=======================");

        for (Futter.FutterArt futterArt : futterMengenBedarfListe.keySet()) {
            //System.out.print(this.futterMengenBedarfListe.get(futterArt) +  " " + Futter.FutterLagerListe.get(futterArt).getFutterEinheit() + "         ");

            /*
            // Version ohne soutf
            System.out.println(this.futterMengenBedarfListe.get(futterArt)
                    +  " "
                    + Futter.FutterLagerListe.get(futterArt).getFutterEinheit()
                    + "         "
                    + futterArt
                    + " : "
                    + (Futter.FutterLagerListe.get(futterArt).getFutterPreis() * this.futterMengenBedarfListe.get(futterArt))
                    + " € Kosten am Tag");
            System.out.println("----------------------------------------------------------------------------------------");
             */

            // Version mit soutf
            System.out.printf("%2d %-9s %-13s :   %6.2f € %n",
                    this.futterMengenBedarfListe.get(futterArt),
                    Futter.FutterLagerListe.get(futterArt).getFutterEinheit(),
                    futterArt,
                    (Futter.FutterLagerListe.get(futterArt).getFutterPreis() * this.futterMengenBedarfListe.get(futterArt)));
        }

        System.out.println("=======================");
    }

    // Objekt_9_Pfleger

    public void addPfleger(Pfleger pfleger) {
        this.pfleger.add(pfleger);
    }

    public void zustaendigkeitGehege(Pfleger pfleger, Gehege gehege) {

        //System.out.println("Pfleger: " + this.pfleger.contains(pfleger));
        //System.out.println("Gehege: " + this.gehegeArrayList.contains(gehege));

        if (this.pfleger.contains(pfleger) && this.gehegeArrayList.contains(gehege)) {
            pfleger.gehegeZustaendigkeit.add(gehege);
        } else if (this.pfleger.contains(pfleger) == false && this.gehegeArrayList.contains(gehege) == false) {

            System.out.println(pfleger + " und " + gehege + " ist diesem " + this.zooName + " nicht zugeordnet!");
        } else if (this.pfleger.contains(pfleger) == false) {

            System.out.println(pfleger + " ist diesem " + this.zooName + " nicht zugeordnet!");
        } else {
            System.out.println(gehege + " ist diesem " + this.zooName + " nicht zugeordnet!");
        }
    }

    public void zooStrukturGehegeTierePfleger() {

        String zooDaten = toString();

        System.out.println("\n├── " + zooDaten);

        for (int i = 0; i < gehegeArrayList.toArray().length; i++) {
            System.out.println("│   ├── " + this.gehegeArrayList.get(i));

            for (int j = 0; j < this.gehegeArrayList.get(i).gettierArrayList().toArray().length; j++) {
                System.out.println("│       ├── " + this.gehegeArrayList.get(i).gettierArrayList().get(j));

                for (int k = 0; k < this.pfleger.size(); k++) {

                    if (this.pfleger.get(k).gehegeZustaendigkeit.contains(this.gehegeArrayList.get(i)))

                        System.out.println("│          ├── " + this.pfleger.get(k));
                }
            }
        }
    }
}

