package Matthias.week18_Zoo.Zoo1;

public class Tiere {

    private String animalName;
    private String gattungName;
    private Futterbedarf futterbedarf;
   private Futter futter;
    public Tiere( String animalName, String gattungName, Futter futter, Futterbedarf futterbedarf){
        this.animalName=animalName;
        this.gattungName=gattungName;
        this.futterbedarf=futterbedarf;
        this.futter=futter;
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

    public Futter getFutter() {
        return futter;
    }

    @Override
    public String toString(){
        return "Tiername: "+this.animalName+" Gattung Name: "+ this.gattungName;
    }
}
