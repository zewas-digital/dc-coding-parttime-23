package michael_k.week15;

public class Fotoapparat extends Object {

    public int brennweite;
    public int brennweiteMin;
    public int brennweiteMax;
    public int megapixel;
    public int iso = 0;
    public float blende;
    public int blendeMin;
    public int blendeMax;
    public String marke;
    public String model;


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
    public void takePhoto(){
        System.out.println ("________________________________________" );
        System.out.println ("_____#______#____#______#____#__________" );
        System.out.println ("_____#______#___________#____#__________" );
        System.out.println ("_____#______#____#______#____#__________" );
        System.out.println ("_____########____#______#____#__________" );
        System.out.println ("_____#______#____#______#____#__________" );
        System.out.println ("_____#______#____#______________________" );
        System.out.println ("_____#______#____#______#____#__________" );
        System.out.println ("________________________________________" );
    }
    public String toString(){
        return "Akteelle Kamaradaten\n" +
        "Marke: " + marke +"\n" +
        "Model: " + model +"\n" +
        "Brennweite: " + brennweite +"\n" +
        "Megapixel: " + megapixel +"\n" +
        "Blende: " + blende +"\n" +
        "Iso-Wert: " + iso +"\n" ;
    }
    public int getBrennweite(){
        return brennweite;
    }
    public void setBrennweite(int brennweite){
        this.brennweite = brennweite;
    }
    public int getMegapixel(){
        return megapixel;
    }
    public int getIso(){
        return iso;
    }
    public void setIso(int iso){
        this.iso = iso;
    }
    public float getBlende(){
        return blende;
    }
    public void setBlende(float blende){
        this.blende = blende;
    }
    public String getMarke(){
        return marke;
    }
    public String getModel(){
        return model;
    }
}
