package michael_k.week15;

public class Speicherkarte extends Object{

    public int speichergroesse;
    public int speicherBelegt=0;

    public Speicherkarte(int groesse){

        this.speichergroesse = groesse;
    }
    public void takePhoto(){

        speicherBelegt = speicherBelegt +5;
    }
}
