package saifedine.week18_Zoo.V02;

/*
Aufgabe: Pfleger
Erweitere dein Zooprogramm um Tierpfleger.

Erstelle eine Klasse Pfleger mit einem Namen und mit einer dynamischen Liste von Gehegen,
wofür der Pfleger zuständig ist. Erweitere die Klasse Zoo, dass die eine Liste der Pfleger beinhaltet.

Erweitere den Struktur-Ausdruck um die neu eingeführten Pfleger.
 */



public class Objekt_9_Pfleger {

    public static void main(String[] args) {

        // Zoo ----------------------
        Zoo tierparkDornbirn = new Zoo("Tierpark DB", 2022);
        Zoo tierparkFeldkirch = new Zoo("Tierpark FK", 1999);

        // Pfleger
        Pfleger pflegerHugo = new Pfleger("Hugo");
        Pfleger pflegerFranz = new Pfleger("Franz");

        // Pfleger Zoos zuweisen
        tierparkDornbirn.addPfleger(pflegerHugo);
        tierparkDornbirn.addPfleger(pflegerFranz);
        tierparkFeldkirch.addPfleger(pflegerFranz);

        // Gehege
        Gehege waldrandDB = new Gehege("Waldrand DB");
        Gehege weideDB = new Gehege("Weide DB");
        Gehege waldrandFK = new Gehege("Waldrand FK");

        tierparkDornbirn.addGehege(waldrandDB);
        tierparkDornbirn.addGehege(weideDB);
        tierparkFeldkirch.addGehege(waldrandFK);

        tierparkDornbirn.zooStrukturGehege();

        tierparkFeldkirch.zooStrukturGehege();

        tierparkDornbirn.zooStrukturGehegeTierePfleger();

        tierparkFeldkirch.zooStrukturGehegeTierePfleger();

        System.out.println();

        // Pflegern ihre Verantwortung zuweisen mit Validierung
        tierparkDornbirn.zustaendigkeitGehege(pflegerHugo, waldrandDB);
        tierparkDornbirn.zustaendigkeitGehege(pflegerFranz, weideDB);
        tierparkDornbirn.zustaendigkeitGehege(pflegerFranz, waldrandFK); // fehlerhaft
        tierparkFeldkirch.zustaendigkeitGehege(pflegerHugo, waldrandFK); // fehlerhaft

        System.out.println("\nPfleger von Tierpark DB" + tierparkDornbirn.pfleger.toString());

        System.out.println("\nPfleger von Tierpark FK" + tierparkFeldkirch.pfleger.toString());
    }
}
