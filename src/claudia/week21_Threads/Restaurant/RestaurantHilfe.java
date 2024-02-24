package claudia.week21_Threads.Restaurant;

import java.util.Random;

public class RestaurantHilfe {
    public static Oberkellner erstelleRestaurant(){
        Restaurant restaurant = new Restaurant("Hinterm Ofen");
        Oberkellner ok = new Oberkellner("Hansi", restaurant);


        for (int i = 0; i < 4; i++){
            restaurant.raumHinzufuegen(new Raum(new Kellner("Kellner " + i)));
        }
        Random random = new Random();
        for (Raum r : restaurant.getListeDerRaeume()){
            for (int i = 0; i < 4; i++) {
                r.tischZufuegen(new Tisch(random.nextInt(1,7) * 2));
            }

        }

        

        System.out.println("\nRestaurant \"" + restaurant + "\" eröffnet.");
        System.out.println("Es gibt folgende Tische in verschiedenen Räumen: ");
        for (Raum raum : restaurant.getListeDerRaeume()) {
            System.out.println("* - ".repeat(10) + "*" );
            for (Tisch t : raum.getListeDerTische()) {
                System.out.println(t.getSitzplaetze() + " Sitzplätze;\t\t\t frei? " + t.istFrei() );
            }

        }
        return ok;
    }
}
/*
public static ArrayList<Gehege> shufflecloneGehege(ArrayList<Gehege> liste){
        ArrayList<Gehege> neueListe = (ArrayList<Gehege>) liste.clone();
        Collections.shuffle(neueListe);
        return neueListe;
    }
 */