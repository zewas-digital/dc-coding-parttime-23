package MichaelReal.week18_Zoo;

/*
Aufgabe: Tiere
Erweitere dein Zooprogramm mit Tiere.

+ Erstelle eine Tier-Klasse mit einem Namen und einer Gattung

+ Erweitere die Gehege, um Tiere dynamisch hinzufügen und entfernen zu können.

+ Erweitere den Struktur-Ausdruck von Zoo, dass es auch die Tiere ausdrückt.

├── Zoo: Tiergarten Dornbirn, gegründet 2022
│   ├── Gehege: Alpenwiese
│       ├── Rijska, Kuh
│   ├── Gehege: Ried
│       ├── Garmond, Storh
│       ├── Hugo, Storh
│       ├── Idaxis, Storh
│   ├── Gehege: Terrarium (warm)
│       ├── (leer)
 */


public class Objekt_7_Tiere extends Zoo {
    public Objekt_7_Tiere(String name, int gruendungsjahr) {
        super(name, gruendungsjahr);
    }

    @Override
    public void printAdditionalInfo() {
        System.out.println("""
                
                Weitere Informationen über den Objekt_7_Tiere.
                🐵🦊🐺🫏🫎🐴🐆🐮🐂🐃🐄🐷🐖🐗                    
                """);
    }

    public static void main(String[] args) {
        Objekt_7_Tiere zoo = new Objekt_7_Tiere("Objekt_7_Tiere", 2024);

        zoo.addGehege("Alpenwiese");
        zoo.addGehege("Ried");
        zoo.addGehege("Terrarium (warm)");

        Futter heu = new Futter("Heu🌿");
        Futter fischfutter = new Futter("Fischfutter🫘");
        Futter insekten = new Futter("Insekten🪳");

        Tier hase = new Tier("Hase🐰", heu);
        Tier reh = new Tier("Reh🦌", heu);
        Tier fisch = new Tier("Fisch🐟", fischfutter);
        Tier schmetterling = new Tier("Schmetterling🦋", insekten);

        zoo.assignTierToGehege("Alpenwiese", hase);
        zoo.assignTierToGehege("Alpenwiese", reh);
        zoo.assignTierToGehege("Ried", fisch);
        zoo.assignTierToGehege("Terrarium (warm)", schmetterling);

        zoo.printZooStructureWithTiere();

        Futter karotten = new Futter("Karotten🥕");
        zoo.changeTierFutter("Alpenwiese", "Hase🐰", karotten);

        zoo.printZooStructureWithTiere();

        zoo.removeTierFromGehege("Ried", "Fisch🐟");

        zoo.printZooStructureWithTiere();


    }

}