package claudia.week21_Threads.Restaurant;

import java.util.Random;
import java.util.Vector;

import static java.lang.Thread.sleep;

public class Oberkellner {
    private String name;
    private Restaurant restaurant;
    private Vector<Gruppe> listeDerGruppen;
    public Oberkellner(String name, Restaurant restaurant){
        this.name = name;
        this.restaurant = restaurant;
        this.listeDerGruppen = new Vector<>();
    }

    public String getName() {
        return name;
    }

    public Restaurant getRestaurant() {
        return this.restaurant;
    }

    public void gruppeZuweisen() {
        Gruppe gaeste = erstelleGruppe(this.restaurant);
        begruessen(gaeste);
        gaestePlatzieren(gaeste, findeTisch(gaeste));
        gaeste.start();
    }

    public void restaurantSchliessen() throws InterruptedException {
        System.out.println("Das Restaurant schließt jetzt! ");

        for (Gruppe gaeste : this.listeDerGruppen) {
            gaeste.join();
        }
        synchronized (this) {
            this.restaurant.geoeffnet = false;
        }
    }


    private Tisch findeTisch(Gruppe gaeste){

        int n = gaeste.getAnzahlPersonen();
        Tisch gefundenerTisch = null;
        Vector<Raum> raumliste = RestaurantHilfe.shufflecloneRaum(this.restaurant.getListeDerRaeume());
        for (Raum r : raumliste){
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
        rauswerfen(gaeste);//, true);
        return gefundenerTisch;
        // entweder Gruppe zu klein, zu groß oder alle Tisch besetzt
    }
    private synchronized void gaestePlatzieren(Gruppe gaeste, Tisch t){
        if (t != null){
            System.out.println(this + " begleitet die Gruppe zum Tisch. Zuständig ist " + t.getKellner() );
            t.changeStatus();
            gaeste.anDenTischSetzen(t);
            this.listeDerGruppen.add(gaeste);
        }
    }

    private void rauswerfen(Gruppe gaeste){//, boolean zuKlein) {
        //if (zuKlein) System.out.println("Für diese kleine Gruppe gibt es keinen passenden Tisch.");
        //else System.out.println("Diese Gruppe ist zu groß und kann nicht untergebracht werden.");
        System.out.println("Kein passender Tisch gefunden!");
        gaeste.nachHauseGehen(false, this.restaurant, this.listeDerGruppen);

    }
    private void begruessen(Gruppe gaeste){
        int n = gaeste.getAnzahlPersonen();
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
    private Gruppe erstelleGruppe(Restaurant restaurant){
        Random random = new Random();
        int anzahlPersonen = random.nextInt(1, 13);
        return new Gruppe(anzahlPersonen, restaurant, this.listeDerGruppen);
    }
    public int anzahlDerAnwesedenGruppen(){
        return this.listeDerGruppen.size();
    }
    @Override
    public String toString(){
        return "Oberkellner " + this.name;
    }

    public Vector<Gruppe> getListeDerGruppen() {
        return listeDerGruppen;
    }
}
