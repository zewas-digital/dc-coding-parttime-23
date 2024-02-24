package claudia.week21_Threads.Restaurant;

public class RestaurantHilfe {
    public static Oberkellner erstelleRestaurant(){
        Restaurant r = new Restaurant("Hinterm Ofen");
        Oberkellner ok = new Oberkellner("Hansi", r);
        return ok;
    }
}
