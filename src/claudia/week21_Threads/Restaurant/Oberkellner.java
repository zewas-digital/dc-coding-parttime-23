package claudia.week21_Threads.Restaurant;

import java.util.Random;
import java.util.Vector;

import static java.lang.Thread.sleep;

public class Oberkellner {
    private String name;
    private Restaurant restaurant;
    public Oberkellner(String name, Restaurant restaurant){
        this.name = name;
        this.restaurant = restaurant;
    }

    public String getName() {
        return name;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void gruppeZuweisen(){
        Gruppe gaeste = erstelleGruppe();
        int anzahlPersonen = gaeste.getAnzahlPersonen();
        begruessen(anzahlPersonen);
        gaestePlazieren(findeTisch(anzahlPersonen));



    }

    private Tisch findeTisch(int n){
        Tisch gefundenerTisch = null;
        Vector<Raum> raumliste = RestaurantHilfe.shufflecloneRaum(this.restaurant.getListeDerRaeume());
        for (Raum r : raumliste){
            //TODO Liste der Räume zufällig durchlaufen!
            //boolean zuKlein;
            for (Tisch t : r.getListeDerTische()){
                if (t.istFrei() && (t.getSitzplaetze() == n || t.getSitzplaetze() == n + 1)){
                    gefundenerTisch = t;
                    return gefundenerTisch;
                    //System.out.println(this + " begleitet die Gruppe zum Tisch. Zuständig ist " + r.getKellner().toString());
                    //t.changeStatus();
                }
            }
           }
        return gefundenerTisch;
        // entweder Gruppe zu klein, zu groß oder alle Tisch besetzt
    }
    private void gaestePlazieren(Tisch t){
        if (t != null){
            System.out.println(this + " begleitet die Gruppe zum Tisch. Zuständig ist " + t.getKellner() );
            t.changeStatus();
        }
    }

    private void rauswerfen(boolean zuKlein) {
        if (zuKlein) System.out.println("Für diese kleine Gruppe gibt es keinen passenden Tisch.");
        else System.out.println("Diese Gruppe ist zu groß und kann nicht untergebracht werden.");
        System.out.println(this + " schickt sie nach Hause.");
    }
    private void begruessen(int n){
        Random random = new Random();
        try{
            sleep(random.nextInt(5) * 1000);
        }
        catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        String singularPlural = (n==1) ? "Gast" : "Gästen";
        System.out.println("\n" + this + " begrüßt eine neue Gruppe von " + n + " " + singularPlural + ".");
    }
    private Gruppe erstelleGruppe(){
        Random random = new Random();
        int anzahlPersonen = random.nextInt(1, 13);
        return new Gruppe(anzahlPersonen);
    }
    @Override
    public String toString(){
        return "Oberkellner " + this.name;
    }

}
