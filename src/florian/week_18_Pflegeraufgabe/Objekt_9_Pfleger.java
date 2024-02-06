package florian.week_18_Pflegeraufgabe;

/*
Aufgabe: Pfleger
Erweitere dein Zooprogramm um Tierpfleger.

Erstelle eine Klasse Pfleger mit einem Namen und mit einer dynamischen Liste von Gehegen,
wofür der Pfleger zuständig ist. Erweitere die Klasse Zoo, dass die eine Liste der Pfleger beinhaltet.

Erweitere den Struktur-Ausdruck um die neu eingeführten Pfleger.
 */


public class Objekt_9_Pfleger {
    public static void main(String[] args) {

        String haken = "├──";
        String haken2 = "│   ├──";
        String haken3 = "│     ├──";
        String haken4 = "│       ├──";

        Zoo tierpark = new Zoo("Doppelmayerzoo", 1980);

        Futterlager futterlager = new Futterlager();

        Pfleger peter = new Pfleger("Peter");
        Pfleger hans = new Pfleger("Hans");
        Pfleger bernd = new Pfleger("Bernd");

        Gehege alpen = new Gehege("Alpen");
        Gehege savanne = new Gehege("Savanne");
        Gehege aquarium = new Gehege("Aquarium");

        //Pfleger erstellen

        tierpark.addPfleger(peter);
        tierpark.addPfleger(hans);
        tierpark.addPfleger(bernd);
        // System.out.println(tierpark.pflegerArrayList);

        // Pfleger löschen
        //tierpark.removePfleger(peter);
        // System.out.println(tierpark.pflegerArrayList);

        // Gehege erstellen

        tierpark.addGehege(alpen);
        tierpark.addGehege(savanne);
        tierpark.addGehege(aquarium);

        tierpark.zustaendigkeitfuerGehege(peter, alpen);
        tierpark.zustaendigkeitfuerGehege(hans, savanne);
        tierpark.zustaendigkeitfuerGehege(bernd, aquarium);


        //Tiere hinzufügen

        tierpark.getGehegeArrayList().get(0).getTiereImGehege().add(new Tiere("Maxi", "Wildschwein", Futterlager.futterarten.HEU, 5));
        tierpark.getGehegeArrayList().get(0).getTiereImGehege().add(new Tiere("Hugo", "Bär", Futterlager.futterarten.FISCH, 15));
        tierpark.getGehegeArrayList().get(1).getTiereImGehege().add(new Tiere("Aslan", "Löwe", Futterlager.futterarten.FISCH, 10));
        tierpark.getGehegeArrayList().get(2).getTiereImGehege().add(new Tiere("Nemo", "Weisser Hai", Futterlager.futterarten.FISCH, 15));

        // Ausgabe
        System.out.println(haken + " Zoo: " + tierpark.getName() + ", gegründet " + tierpark.getGruendungsjahr());
        for (Pfleger p : tierpark.getPflegerArrayList()) {
            System.out.println(haken2 + "Zuständiger Pfleger: " + p);
            for (Gehege s : p.getGehegeZustaendigkeitArrayList()) {
                System.out.println(haken3 + " Gehege: " + s.getBezeichnung());
                for (Tiere t : s.getTiereImGehege()) {
                    System.out.println(haken4 + "Name: " + t.Name + ", Gattung: " + t.Gattung + ", Futter: " + futterlager.lagerliste.get(t.futter).bezeichnung);
                }
            }
        }
    }

    public static Zoo erzeugeZoo(String name,int gruendungsjahr){

        String haken = "├──";
        String haken2 = "│   ├──";
        String haken3 = "│     ├──";
        String haken4 = "│       ├──";

        Zoo tierpark = new Zoo(name,gruendungsjahr);

        Futterlager futterlager = new Futterlager();

        Pfleger peter = new Pfleger("Peter");
        Pfleger hans = new Pfleger("Hans");
        Pfleger bernd = new Pfleger("Bernd");

        Gehege alpen = new Gehege("Alpen");
        Gehege savanne = new Gehege("Savanne");
        Gehege aquarium = new Gehege("Aquarium");

        //Pfleger erstellen

        tierpark.addPfleger(peter);
        tierpark.addPfleger(hans);
        tierpark.addPfleger(bernd);

        // Gehege erstellen

        tierpark.addGehege(alpen);
        tierpark.addGehege(savanne);
        tierpark.addGehege(aquarium);

        tierpark.zustaendigkeitfuerGehege(peter, alpen);
        tierpark.zustaendigkeitfuerGehege(hans, savanne);
        tierpark.zustaendigkeitfuerGehege(bernd, aquarium);

        tierpark.getGehegeArrayList().get(0).getTiereImGehege().add(new Tiere("Maxi", "Wildschwein", Futterlager.futterarten.HEU, 5));
        tierpark.getGehegeArrayList().get(0).getTiereImGehege().add(new Tiere("Hugo", "Bär", Futterlager.futterarten.FISCH, 15));
        tierpark.getGehegeArrayList().get(1).getTiereImGehege().add(new Tiere("Aslan", "Löwe", Futterlager.futterarten.FISCH, 10));
        tierpark.getGehegeArrayList().get(2).getTiereImGehege().add(new Tiere("Nemo", "Weisser Hai", Futterlager.futterarten.FISCH, 15));

        System.out.println(haken + " Zoo: " + tierpark.getName() + ", gegründet " + tierpark.getGruendungsjahr());
        for (Pfleger p : tierpark.getPflegerArrayList()) {
            System.out.println(haken2 + "Zuständiger Pfleger: " + p);
            for (Gehege s : p.getGehegeZustaendigkeitArrayList()) {
                System.out.println(haken3 + " Gehege: " + s.getBezeichnung());
                for (Tiere t : s.getTiereImGehege()) {
                    System.out.println(haken4 + "Name: " + t.Name + ", Gattung: " + t.Gattung + ", Futter: " + futterlager.lagerliste.get(t.futter).bezeichnung);
                }
            }
        }

        return tierpark;
    }




}
