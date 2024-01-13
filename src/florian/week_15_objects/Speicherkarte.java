package florian.week_15_objects;

public class Speicherkarte {
    double speicherplatz;
    int fotos;

    public Fotoapparat fotoapparat;


    public Speicherkarte (float speicherplatz,int fotos){
        this.speicherplatz = speicherplatz;
        this.fotos = fotos;
    }

    public String toString (){
        return "" + speicherplatz + fotos;
    }

    public void fotomachen(int fotos){


        this.speicherplatz = this.fotoapparat.getMegapixel() * 0.3;

        for (double i = this.speicherplatz; i < this.fotos ; i++) {
            if (this.speicherplatz > 0.3){
                speicherplatz -= 0.3;
                fotos++;
            }
        }


        System.out.println(this.speicherplatz + this.fotos);
    }
}
