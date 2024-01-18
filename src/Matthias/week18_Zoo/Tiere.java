package Matthias.week18_Zoo;

public class Tiere {

    private String animalName;
    private String gattungName;
    public Tiere(String animalName,String gattungName){
        this.animalName=animalName;
        this.gattungName=gattungName;
    }

    public String getAnimalName() {
        return animalName;
    }

    public String getGattungName() {
        return gattungName;
    }

    @Override
    public String toString(){
        return "Tiername: "+this.animalName+" Gattung Name: "+ this.gattungName;
    }
}
