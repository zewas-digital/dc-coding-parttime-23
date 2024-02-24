package Matthias.week20_Zoo.Zoo7_bonus1;

public class Tier {

    private String animalName;
    private String gattungName;
    private Futterbedarf futterbedarf;

    public Futter.Futtersorten futtersorte;

    private  int MaxGesundheit;
    private int Biss;
    public Tier( String animalName, String gattungName, Futter.Futtersorten futtersorte, Futterbedarf futterbedarf,int maxGesundheit, int Biss){
        this.animalName=animalName;
        this.gattungName=gattungName;
        this.futterbedarf=futterbedarf;
        this.futtersorte=futtersorte;
        this.MaxGesundheit=maxGesundheit;
        this.Biss=Biss;
    }
    public void futtern(){
        System.out.print("\nGattung:"+this.gattungName+"  ist mit "+this.futtersorte.name()+" gefüttert.");
    }

    public int getMaxGesundheit() {
        return this.MaxGesundheit;
    }

    public void setMaxGesundheit( int maxGesundheit ) {
        this.MaxGesundheit = maxGesundheit;
    }

    public int getBiss() {
        return this.Biss;
    }

    public void beobachten(){
        System.out.print(  "\n"+this.animalName +":"+"wird beobachtet!\n");
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
