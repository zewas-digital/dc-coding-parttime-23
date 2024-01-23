package volkan.week16.Wiederholung;

public class Auto extends Fahrzeug {

    //Attribute

    public static final int WHEELS = 4;
    private String marke;
    private String modell;

    private Engine engine;


    private int kilometerstand;
//    private static String abgasnorm = "Euro6";
//    public static String pickerl;


    //Constructor
    public Auto (String color, String marke, String modell, String seriennummer, Engine engine) {
        super(color, seriennummer);
        // this ist ein Zeiger zum aktuellen Objekt
        this.marke = marke;
        this.modell = modell;
        this.engine = engine;
        Engine v8 = new Engine(400);

    }

    // getter

    @Override
    public String getColor() {
        return ("Die Karosseriefarbe ist " + super.getColor());
    }

    public Engine getEngine() {
        return this.engine;
    }

/*

    public String getPickerl() {
        return this.pickerl;
    }

    public void setPickerl(String date) {
        //Vorstellung: Prüfung, ob Mechaniker

        //Wertvalidierung: Darf dieser Wert abgespeichert werden.

    }

    public static void setAbgasnorm(String norm) {
        abgasnorm = norm;
    }

    public static String getAbgasnorm() {
        return abgasnorm;
    }


 */
}
