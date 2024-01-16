package florian.week_15_objects;

public class Fotoapparat {

    String hersteller;
    String modell;
    private int megapixel;
    private Objektiv objektiv;
    Speicherkarte speicherkarte;

    public int fotos = 0;



    public Fotoapparat (String hersteller,String modell,int megapixel,Objektiv objektiv,Speicherkarte speicherkarte) {
        this.hersteller = hersteller;
        this.modell = modell;
        this.megapixel = megapixel;
        this.objektiv = objektiv;
        this.speicherkarte = speicherkarte;

    }

    public int getMegapixel(){
        return this.megapixel;
    }

    public double setMegapixel(int megapixel){
        return this.megapixel = megapixel;
    }

    public String toString (){
         return "Hersteller: " + hersteller +
                 ", Modell: " + modell +
                 ", Megapixel: " + megapixel +
                 ", Objektiv: " + objektiv +" Brennweite" +
                 ", Speicherplatz:" + speicherkarte;
    }

    public void objektiveinsetzen(Objektiv objektiv){
        this.objektiv = objektiv;
    }

    public void objektiventfernen(){
        this.objektiv = null;
    }

    public int fotomachen(int fotos){

        this.speicherkarte.fotos += fotos;

        System.out.println("Du hast " + fotos + " Fotos gemacht");

        return this.fotos = fotos;
    }



}
