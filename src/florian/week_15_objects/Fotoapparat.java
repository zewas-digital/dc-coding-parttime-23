package florian.week_15_objects;

public class Fotoapparat {

    String hersteller;
    String modell;

   private int megapixel;

    public Fotoapparat (String hersteller,String modell,int megapixel){
        this.hersteller = hersteller;
        this.modell = modell;
        this.megapixel = megapixel;
    }

    public int getMegapixel(){
        return this.megapixel;
    }

    public int setMegapixel(int megapixel){
        return this.megapixel = megapixel;
    }

    public String toString (){
         return "Hersteller " + hersteller +
                 " Modell" + modell +
                 " Megapixel " + megapixel;
    }

}
