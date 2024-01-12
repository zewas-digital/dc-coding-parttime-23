package florian.week_15_objects;

public class Fotoapparat {

    String hersteller;
    String modell;
    private int megapixel;
    public Objektiv objektiv;
    public Speicherkarte speicherkarte;

    public Fotoapparat (String hersteller,String modell,int megapixel,Objektiv objektiv,Speicherkarte speicherkarte){
        this.hersteller = hersteller;
        this.modell = modell;
        this.megapixel = megapixel;
        this.objektiv = objektiv;
        this.speicherkarte = speicherkarte;
    }

    public int getMegapixel(){
        return this.megapixel;
    }

    public int setMegapixel(int megapixel){
        return this.megapixel = megapixel;
    }

    public String toString (){
         return "Hersteller: " + hersteller +
                 ", Modell: " + modell +
                 ", Megapixel: " + megapixel +
                 ", Objektiv: " + objektiv +
                 ", Speicherplatz: " + speicherkarte + " GB";
    }

    /*public double fotomachen (){
        this.speicherkarte = speicherkarte;
        double speicherplatz;
        int fotos = 0;

       if (speicherkarte  ){

       }
    }*/

}
