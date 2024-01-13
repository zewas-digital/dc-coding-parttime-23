package florian.week_15_objects;

public class Fotoapparat {

    String hersteller;
    String modell;
    private double megapixel;
    private Objektiv objektiv;
    Speicherkarte speicherkarte;



    public Fotoapparat (String hersteller,String modell,int megapixel,Objektiv objektiv,Speicherkarte speicherkarte) {
        this.hersteller = hersteller;
        this.modell = modell;
        this.megapixel = megapixel;
        this.objektiv = objektiv;
        this.speicherkarte = speicherkarte;

    }

    public double getMegapixel(){
        return this.megapixel;
    }

    public double setMegapixel(int megapixel){
        return this.megapixel = megapixel;
    }

    public String toString (){
         return "Hersteller: " + hersteller +
                 ", Modell: " + modell +
                 ", Megapixel: " + megapixel +
                 ", Objektiv: " + objektiv +
                 ", Speicherplatz: " + speicherkarte + " GB";
    }

    public void objektiveinsetzen(Objektiv objektiv){
        this.objektiv = objektiv;
    }

    public void objektiventfernen(){
        this.objektiv = null;
    }



}
