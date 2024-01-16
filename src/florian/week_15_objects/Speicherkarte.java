package florian.week_15_objects;

public class Speicherkarte {
    int speicherplatz;
    int fotos;

    public Fotoapparat fotoapparat;
    int restspeicherplatz = 0;

    public Speicherkarte (int speicherplatz,int fotos){
        this.speicherplatz = speicherplatz;
        this.fotos = fotos;

    }
    @Override
    public String toString (){
        return " " + restspeicherplatz + " von "
                + speicherplatz +" GB verfügbar" +
                ", Du hast: " + fotos + " Fotos gespeichert";

    }


    public void restSpeicherplatz(){

       restspeicherplatz = (int) (speicherplatz - ((30 * 0.3) * fotos));

       System.out.println("Restspeicher: " + restspeicherplatz + " " + "Anzahl Fotos: "+ fotos);
    }

}
