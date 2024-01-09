package michael_k.week15;

public class Fotoapparat extends Object {

    public static int brennweite;
    public static int brennweiteMin;
    public static int brennweiteMax;
    public static int megapixel;
    public static int iso = 0;
    public static float blende;
    public static int blendeMin;
    public static int blendeMax;
    public static String marke;
    public static String model;


    public Fotoapparat (String marke, String model, String brennweite_Min_Max, int megapixel, String blende_Min_Max){

        this.marke = marke;
        this.model = model;
        this.megapixel = megapixel;

        String[] arr1 = brennweite_Min_Max.split ( "/" );
        this.brennweite = Integer.parseInt ( arr1[0] );
        this.brennweiteMin = Integer.parseInt ( arr1[0] );
        this.brennweiteMax = Integer.parseInt ( arr1[1] );

        String[] arr2 = blende_Min_Max.split ( "/" );
        this.blende = Float.parseFloat ( arr2[0] );
        this.blendeMin = Integer.parseInt ( arr2[0] );
        this.blendeMax = Integer.parseInt ( arr2[1] );


    }
    public static void takePhoto(){
        System.out.println ("________________________________________" );
        System.out.println ("________________________________________" );
        System.out.println ("________________________________________" );
        System.out.println ("________________________________________" );
        System.out.println ("________________________________________" );
        System.out.println ("________________________________________" );
        System.out.println ("________________________________________" );
        System.out.println ("________________________________________" );
        System.out.println ("________________________________________" );
    }
    public static void toSrting(){
        System.out.println ("Akteelle Kamaradaten" );
        System.out.println ("Marke: " + marke );
        System.out.println ("Model: " + model );
        System.out.println ("Brennweite: " + brennweite );
        System.out.println ("Megapixel: " + megapixel );
        System.out.println ("Blende: " + blende );
        System.out.println ("Iso-Wert: " + iso );
    }
    public static int getBrennweite(){
        return brennweite;
    }
    public void setBrennweite(int brennweite){
        this.brennweite = brennweite;
    }
    public static int getMegapixel(){
        return megapixel;
    }
    public static int getIso(){
        return iso;
    }
    public void setIso(int iso){
        this.iso = iso;
    }
    public static float getBlende(){
        return blende;
    }
    public void setBlende(float blende){
        this.blende = blende;
    }
    public static String getMarke(){
        return marke;
    }
    public static String getModel(){
        return model;
    }
}
