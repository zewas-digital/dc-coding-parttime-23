package claudia.week21_Threads.Restaurant;

import java.util.Random;

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



    }

    private void begruessen(int n){
        Random random = new Random();
        try{
            sleep(random.nextInt(5) * 1000);
        }
        catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        System.out.println("\n" + this + " begrüßt eine neue Gruppe von " + n + " Gästen.");
    }
    private Gruppe erstelleGruppe(){
        Random random = new Random();
        int anzahlPersonen = random.nextInt(2, 10);
        return new Gruppe(anzahlPersonen);
    }
    @Override
    public String toString(){
        return "Oberkellner " + this.name;
    }

}
