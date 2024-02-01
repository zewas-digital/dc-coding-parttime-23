package Matthias.week19_Zoo.Zoo4_gehenNachEinander;

public class Tier {

    private String animalName;
    private String gattungName;
    private Futterbedarf futterbedarf;
    public Futter.Futtersorten futtersorte;
    public Tier( String animalName, String gattungName, Futter.Futtersorten futtersorte, Futterbedarf futterbedarf){
        this.animalName=animalName;
        this.gattungName=gattungName;
        this.futterbedarf=futterbedarf;
        this.futtersorte=futtersorte;
    }

    public String getAnimalName() {
        return animalName;
    }

    public String getGattungName() {
        return gattungName;
    }

    public Futterbedarf getFutterbedarf() {
        return futterbedarf;
    }

    public Futter.Futtersorten getFuttersorte() {
        return futtersorte;
    }

    @Override
    public String toString(){
        return "Tiername: "+this.animalName+" Gattung Name: "+ this.gattungName;
    }
}
