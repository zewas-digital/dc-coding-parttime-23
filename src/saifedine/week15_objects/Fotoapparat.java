package saifedine.week15_objects;

public class Fotoapparat {

    private String hersteller;
    private String model;
    private float megapixel;
    private int brennweite;

    /*
    public Fotoapparat(String hersteller, String model, float megapixel, int brennweite){

        this.hersteller = hersteller;
        this.model = model;
        this.megapixel = megapixel;
        this.brennweite = brennweite;
    }
     */

    public void setHersteller(String hersteller){
        this.hersteller = hersteller;
    }
    public String getHersteller(){return this.hersteller;}

    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){return this.model;}

    public void setMegapixel(float megapixel){
        this.megapixel = megapixel;
    }
    public float getMegapixel(){return this.megapixel;}

    public void setBrennweite(int brennweite){
        this.brennweite = brennweite;
    }
    public int getBrennweite(){return this.brennweite;}

    public String toString(){

        return "Fotoapparat { " + super.toString() +
                "\n Hersteller: " + hersteller +
                "\n Model: " + model +
                "\n Megapixel: " + megapixel +
                "\n Brennweite: " + brennweite +
                "\n}";
    }
}
