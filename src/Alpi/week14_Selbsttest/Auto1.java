package Alpi.week14_Selbsttest;



public class Auto1 {

    // Eigenschaften

    public String marke;
    public int baujahr ;
    public String modell ;
    public int kilometerstand ;

    public int getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public Auto1 () {


    }
   public Auto1 (String marke, int baujahr , String modell ,  int kilometerstand){

       this.marke = marke;
       this.baujahr = baujahr;
       this.modell = modell;
       this.kilometerstand = kilometerstand;

       }
}
